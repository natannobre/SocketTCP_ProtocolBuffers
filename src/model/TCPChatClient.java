package model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import encap.MensagemOuterClass.Mensagem;

public class TCPChatClient {

	public static void main(String[] args) {
		
		try {
                    
                    Socket s = new Socket( "127.0.0.1", 8000 );

                    OutputStream os = s.getOutputStream();
                    DataOutputStream dataOS = new DataOutputStream( os );

                    InputStream is = s.getInputStream();
                    DataInputStream dataIS = new DataInputStream( is );

                    boolean running = true;

                    while( running ) {

                        //Digitando mensagem para o servidor
                        System.out.print("Digite a mensagem: ");
                        Scanner scanner = new Scanner(System. in);
                        String inputString = scanner. nextLine();
                        
                        Mensagem.Builder mBuilder = Mensagem.newBuilder();
                        mBuilder.setConteudo(inputString);

                        //Criando o objeto mensagem
                        Mensagem mensagem = mBuilder.build();
                        
                        //Mandando a mensagem pela rede
                        mensagem.writeDelimitedTo(dataOS);
                        dataOS.flush();			

                        //Esperando resposta do servidor e printando
                        Mensagem receivedFromServer = Mensagem.parseDelimitedFrom(dataIS);
                        if(receivedFromServer.hasConteudo()){
                            System.out.println("Tratado pelo servidor: " + receivedFromServer.getConteudo());
                        }else {
                            System.out.println("Erro");
                        }

                        System.out.println( "\n\nDeseja parar? Digite Sim" );		        
                        inputString = scanner. nextLine();

                        if( inputString.startsWith( "S") ) running = false;

                    }

                    dataOS.close();
                    dataIS.close();						
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
