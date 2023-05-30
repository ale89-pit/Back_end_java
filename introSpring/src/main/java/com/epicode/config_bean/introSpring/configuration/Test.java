package com.epicode.config_bean.introSpring.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Test {

	public String titolo;
		private String txt;
		
		public String readTxt() {
			return "Titolo" + titolo + "Testo test :" + txt;
					
		}
}
