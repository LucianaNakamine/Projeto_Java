package sagaGeneratorv2;

public class dadosJogador {
	 private String pergunta;
	    private String[] opcoesResposta;
	    private int respostaCorreta;
	    
	    int pontuacao=0;
	    
	    public dadosJogador(String pergunta, String[] opcoesResposta, int respostaCorreta) {
	        this.pergunta = pergunta;
	        this.opcoesResposta = opcoesResposta;
	        this.respostaCorreta = respostaCorreta;
	    }
	    
	    public String getPergunta() {
	        return pergunta;
	    }
	    
	    public String[] getOpcoesResposta() {
	        return opcoesResposta;
	    }
	    
	    public int getRespostaCorreta() {
	        return respostaCorreta;
	    }

		public int getPontuacao() {
			return pontuacao;
		}

		public void setPontuacao(int pontuacao) {
			this.pontuacao = pontuacao;
		}
	
	

}
