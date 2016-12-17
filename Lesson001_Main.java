package lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import lesson002.Lesson001_Sub001;

/**
 * MainClass
 * @author Akira
 *
 */
public class Lesson001_Main {

	/**
	 * MainMesod
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 変数宣言
		int x = 100010;
		int y = 10;
		int answer = 0;
		String str = null;

		// インスタンス化
		Lesson001_Sub001 sub1 = new Lesson001_Sub001();

		System.out.println("helloWorld");

		// 別パッケージクラスsumLessonを呼び出す
		answer = sub1.sumLesson( x, y );

		System.out.println( x + " ＋ " + y + " ＝ " + answer );

		// 別パッケージクラスkakeLessonを呼び出す
		answer = sub1.kakeLesson( x, y );

		System.out.println( x + " × " + y + " ＝ " + answer );

		// 入力待ち処理
		for( int i=0; i<5; i++ ) {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			try {
				str = br.readLine();
			} catch( IOException e ) {
				System.out.println( "入力エラー" + e.getMessage() );
			}
			System.out.println( "input: '" + str + "'" );
		}


	}

}
