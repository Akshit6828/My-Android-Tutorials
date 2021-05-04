package com.akshit.staticlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    TextView t1,t2,t3,t4,t5;
    String getpoetname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        t1=findViewById(R.id.poetname);
        t2=findViewById(R.id.born);
        t3=findViewById(R.id.died);
        t4=findViewById(R.id.occupation);
        t5=findViewById(R.id.awards);
        rg=(RadioGroup)findViewById(R.id.rgroup);
        Bundle b= getIntent().getExtras();
        Intent i1=getIntent();
        getpoetname=b.getString("poet_name_key");
        t1.setText(getpoetname);
        t2.setVisibility(View.GONE);
        t3.setVisibility(View.GONE);
        t4.setVisibility(View.GONE);
        t5.setVisibility(View.GONE);

    }

    public void rbClick(View view) {
        int radiobuttonid= rg.getCheckedRadioButtonId();
        rb =findViewById(radiobuttonid);
        if(getpoetname.equals("Mahadevi Verma"))
        {
            if(rb.getText().toString().equals("OverView"))
            {
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t1.setText("Mahadevi Verma");
                t2.setText("Born: 26 March 1907 at Farrukhabad, United Provinces of Agra and Oudh, British India");
                t3.setText("Died: 11 September 1987 (aged 80 at Prayagraj, Uttar Pradesh, India");
                t4.setText("Occupation: Novelist, poet, short-story writer");
                t5.setText("Awards:\n"+"1956: Padma Bhushan\n" + "1982: Bharatiya Gyanpeeth\n" + "1988: Padma Vibhushan");
            }
            else if(radiobuttonid==-1)
            {
                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                Toast.makeText(this, "Nothing Selected", Toast.LENGTH_LONG).show();

            }
            else if(rb.getText().toString().equals("Explore"))
            {
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t3.setVisibility(View.VISIBLE);

                t3.setText("Mahadevi Verma (26 March 1907 – 11 September 1987) was a Hindi poet, freedom fighter and educationist from India. She is widely regarded as the modern Meera.She was a major poet of the \"Chhayavaad\" a literary movement of romanticism in modern Hindi poetry ranging from 1914–1938 and a prominent poet in Hindi Kavi sammelans (Gatherings of poets). She was the Principal, and then the Vice-Chancellor of Prayag Mahila Vidyapeeth, a woman's residential college in Prayagraj");
            }
        }
        else if(getpoetname.equals("Munshi PremChandar"))
        {
            if(rb.getText().toString().equals("OverView"))
            {
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t2.setText("Born : 31 July 1880 in Lamhi, Benares State, British India (present-day Uttar Pradesh, India)");
                t3.setText("Died: 8 October 1936 (aged 56) in Benares, Benares State, British India (present-day Varanasi, Uttar Pradesh, India)");
                t4.setText("Occupation: Writer, Novelist");
                t5.setText("Awards/Notable Works:\n"+" Godaan, Bazaar-e-Husn\n"+"Karmabhoomi\n"+" Shatranj ke khiladi\n"+"Mansarovar\n"+"Idgah");
            }
            else if(radiobuttonid==-1)
            {
                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                Toast.makeText(this, "Nothing Selected", Toast.LENGTH_LONG).show();
            }
            else if(rb.getText().toString().equals("Explore"))
            {
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t3.setText("Dhanpat Rai Shrivastava 31st July 1880 - 8th October 1936), better known by his pen name Munshi Premchand , was an Indian writer famous for his modern Hindustani literature. He is one of the most celebrated writers of the Indian subcontinent,and is regarded as one of the foremost Hindi writers of the early twentieth century.His novels include Godaan, Karmabhoomi, Gaban, Mansarovar, Idgah. He published his first collection of five short stories in 1907 in a book called Soz-e Watan.");
            }

        }
        else if(getpoetname.equals("Gulzar"))
        {
            if(rb.getText().toString().equals("OverView"))
            {
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t1.setText("Gulzar");
                t2.setText("Born: Sampooran Singh Kalra on 18 August 1934 (age 85) Dina, Punjab (Present-day Pakistan)");
                t3.setText("Age: 85 ");
                t4.setText("Occupation:  Lyricist,Poet,Author,Screenwriter,Film director,Film producer");
                t5.setText("Awards:\n"+" Sahitya Akademi Award (2002)\n"+"Padma Bhushan (2004)\n"+"Dadasaheb Phalke Award (2013)\n"+" Academy Award for Best Original Song (2008)");
            }
            else if(radiobuttonid==-1)
            {

                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                Toast.makeText(this, "Nothing Selected", Toast.LENGTH_LONG).show();
            }
            else if(rb.getText().toString().equals("Explore"))
            {
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t3.setText("Sampooran Singh Kalra (born 18 August 1934), known professionally as Gulzar and also Gulzar saab, is an Indian lyricist, poet, author, screenwriter, and film director.He started his career with music director S.D. Burman as a lyricist in the 1963 film Bandini and worked with many music directors including R. D. Burman, Salil Chowdhury, Vishal Bhardwaj and A. R. Rahman. He was awarded Padma Bhushan in 2004, the third-highest civilian award in India, the Sahitya Akademi Award and the Dadasaheb Phalke Award — the highest award in Indian cinema. He has won several Indian National Film Awards, 21 Filmfare Awards, one Academy Award and one Grammy Award");
            }

        }
        else if(getpoetname.equals("Mailthili Sharan Gupt"))
        {
            if(rb.getText().toString().equals("OverView"))
            {
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t1.setText("Mailthili Sharan Gupt");
                t2.setText("Born:3 August 1886, Jhansi");
                t3.setText("Died: 12 December 1964, India ");
                t4.setText("Occupation:\n"+" Translator\n"+"Poet\n"+"Politician\n"+"Playwriter");
                t5.setText("Awards: Padma Bhushan");
            }
            else if(radiobuttonid==-1)
            {
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                Toast.makeText(this, "Nothing Selected", Toast.LENGTH_LONG).show();
            }
            else if(rb.getText().toString().equals("Explore"))
            {
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t3.setText("Maithili Sharan Gupt was one of the most important modern Hindi poets. He is considered one among the pioneers of Khari Boli poetry and wrote in Khari Boli dialect, at a time when most Hindi poets favoured the use of Braj Bhasha dialect. He was a recipient of the third highest Indian civilian honour of Padma Bhushan.");
            }

        }
        else if(getpoetname.equals("Kabir Das"))
        {
            if(rb.getText().toString().equals("OverView"))
            {
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t1.setText("Kabir Das");
                t2.setText("Born: Varanasi");
                t3.setText("Died: Maghar");
                t4.setText("Occupation: Lyricist,Poet,Philosper,Weaver");
                t5.setText("Poetry: \n" + "Authenticity\n" + "Philosophy\n" + "Influence of Islam\n" + "Persecution and social impact");
            }
            else if(radiobuttonid==-1)
            {
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                Toast.makeText(this, "Nothing Selected", Toast.LENGTH_LONG).show();
            }
            else if(rb.getText().toString().equals("Explore"))
            {
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t3.setText("Kabir Das was a 15th-century Indian mystic poet and saint, whose writings influenced Hinduism's Bhakti movement and his verses are found in Sikhism's scripture Guru Granth Sahib. His early life was in a Muslim family, but he was strongly influenced by his teacher, the Hindu bhakti leader Ramananda");
            }

        }
    }




}

