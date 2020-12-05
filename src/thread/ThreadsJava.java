package thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import encap.MensagemOuterClass.Mensagem;

public class ThreadsJava extends Thread {

	private boolean running;
	private static int contador = 0;
	private int idThread;
	
	private Socket socket;
	
	public ThreadsJava( Socket socket ) {
		this.running = false;
		this.idThread = contador++;
		this.socket = socket;
	}
	
	
	public boolean isRunning() {
		return running;
	}


	public void setRunning(boolean running) {
		this.running = running;
	}
        
        public int getIdThread() {
		return this.idThread;
	}


	public void run() {
		
		this.running = true;
		
		while( running ) {
			
			
			try {
				
                            InputStream is = socket.getInputStream();
                            DataInputStream dataIS = new DataInputStream( is );

                            OutputStream os = socket.getOutputStream();
                            DataOutputStream dataOS = new DataOutputStream( os );

                            
                            //Esperando resposta do cliente
                            Mensagem receivedFromClient = Mensagem.parseDelimitedFrom(dataIS);

                            String conteudoMensagem = receivedFromClient.getConteudo();
                            System.out.println( "Cliente " + idThread + " disse: " + conteudoMensagem );

                            //Respondendo de volta para o cliente pela rede
                            conteudoMensagem = ("De: Cliente " + idThread + " : " + conteudoMensagem);
                            Mensagem.Builder mBuilder = Mensagem.newBuilder();
                            mBuilder.setConteudo(conteudoMensagem);
             
                            //Criando o objeto mensagem
                            Mensagem mensagem = mBuilder.build();

                            //Mandando a mensagem pela rede
                            mensagem.writeDelimitedTo(dataOS);
                            dataOS.flush();			
                            
				
			} catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            this.running = false;
			}
			
		}
		
	}
	
	
}