package com.example.physicspro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Info extends AppCompatActivity {
    String st="חוק ניוטון ";
    TextView tv,textt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        tv=(TextView)(findViewById(R.id.tv));
        textt=(TextView)(findViewById(R.id.textt));

        int i;
        Intent t=getIntent();
        i=t.getIntExtra("rule",0);

        switch (i){
            case 1:st=st+ "הראשון";
            textt.setText("החוק הראשון של ניוטון, הנקרא גם חוק ההתמדה, קובע:\n" +
                    "\n" +
                    "\n" +
                    "\"כל גוף יתמיד במצבו, יישאר במנוחה או ימשיך לנוע\n" +
                    "בתנועה שוות-מהירות ובקו ישר, כל עוד לא פועל עליו כוח חיצוני\"\n" +
                    ".\n" +
                    "\n" +
                    "במערכת הנמצאת בשיווי-משקל כל גוף מתמיד במצבו. במערכת זו, סכום ווקטורי הכוחות הפועלים על כל גוף במערכת הוא אפס.\n" +
                    "\n" +
                    "\n" +
                    "ΣF = 0\n" +
                    "\n" +
                    "עולה השאלה...אם מהירות משתנה רק בעקבות הפעלה של כוח אז מדוע כדור שנבעט ומתגלגל על משטח חלק ומישורי מאט את מהירותו? התשובה נתונה בעובדה שהכדור מתחכך בפני המשטח וכוח החיכוך פועל נגד כיוון תנועתו ומאט אותו. גם כוח התנגדות האוויר, הזניח במקרה זה, פועל להאטת מהירות הכדור.\n" +
                    "\n" +
                    "נסכם ונאמר, כל עוד סכום הכוחות הווקטורים הפועלים על גוף שווים לאפס, הוא יתמיד בתנועתו לאורך קו ישר ובמהירות קבועה, ומכך ניתן להסיק גם את ההפף- אם גוף נע בקו ישר ובמהירות קבועה, בכום הכוחות הפועלים עליו שווה ל-0.\n");

            break;
            case 2: st=st+ " השני ";
            textt.setText("החוק הראשון של ניוטון דן במקרה של גוף שסכום הכוחות הפועלים עליו הוא אפס. החוק השני של ניוטון דן במקרה של גוף שסכום הכוחות הפועלים עליו שונה מאפס. כלומר, פועל על הגוף כוח חיצוני כלשהו. החוק השני של ניוטון קושר בין הכוח החיצוני הפועל על גוף ובין תאוצת תנועת הגוף שהוא גורם לה.\n" +
                    "\n" +
                    "החוק השני של ניוטון קובע:\n" +
                    "\n" +
                    "\n" +
                    "\"כל גוף הפועל עליו כוח חיצוני משנה את מהירותו ביחס ישר לכוח\n" +
                    "וביחס הפוך למסתו\"\n" +
                    "\n" +
                    "את החוק השני ניתן לנסח בפשטות בעזרת הנוסחה הבאה,\n" +
                    "\n" +
                    "\n" +
                    "F = m a\n" +
                    "\n" +
                    "מהנוסחה שלעיל עולה בבירור כי החוק הראשון של ניוטון הנו מקרה פרטי של החוק השני. אם הכוח הפועל על הגוף הוא אפס, הרי בהכרח תאוצת הגוף (שמסתו שונה מאפס) היא גם אפס\n");break;
            case 3: st=st+" השלישי";
            textt.setText("\n" +
                    "החוק השלישי של ניוטון, הנקרא גם חוק הפעולה והתגובה, קובע:\n" +
                    "\n" +
                    "\n" +
                    "\"לכל פעולה קיימת תגובה הנגדית לה בכיוונה ושווה לה בעוצמתה \"\n" +
                    "\n" +
                    "החוק השלישי הוא חוק הפעולה והתגובה לפיו עבור כל כוח שגוף א' מפעיל על גוף ב' קיים כוח שווה בגודלו אך הפוך בכיוונו שגוף ב' מפעיל על גוף א'.\n" +
                    "\n" +
                    "גם חוק זה ניתן להסביר בעזרת דוגמאות פשוטות מחיי היום-יום. למשל, כאשר כבאי מכבה שריפה בעזרת צינור מים בעל זרם חזק, הוא מרגיש את כוח הרתיעה לאחור של זרם המים. כוח הנובע מלחץ-המים דוחף את המים החוצה מקצה הצינור. כנגד כוח זה נוצר כוח רתיעה נגדי בכיוון הפועל על הצינור ודוחף אותו אחורה. דוגמה נוספת היא כוח הרתיעה לאחור הנוצר בעת ירי מנשק חם. כאשר יורים אש חיה מאקדח או מרובה, למשל, שריפת אבק-השריפה שבתחמיש גורמת לפליטת גזים בלחץ גבוה. אותם גזים בלחץ גבוה גורמים להתפרקות התחמיש לתרמיל וקליע. הקליע עף קדימה במהירות גדולה. לפעולה זו קיימת פעולה נגדית של רתיעה לאחור של כל כלי-הנשק\n");break;
        }
        tv.setText(st);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;


    }

    public void credits(MenuItem item) {
        Intent t=new Intent(this,Credits.class);
        startActivity(t);
    }

    public void back(View view) {
        finish();
    }

    public void next(View view) {
        Intent t= new Intent(this, Practice.class);
        startActivity(t);
    }
}


