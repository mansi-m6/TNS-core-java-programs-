package com.multilevelinheritance;

public class Word extends Wordpad{
		private boolean spellCheckEnabled;
		
		public Word() {
			this.spellCheckEnabled=true;
		}
		public void spellCheck() {
			if(spellCheckEnabled) {
				System.out.println("Running Spelling Check.....");
			}else {
				System.out.println("Spelling Check is Disable");
			}
		}
		public void enableSpellCheck(boolean enable)
		{
			spellCheckEnabled=enable;
		}
		
			
		

}
