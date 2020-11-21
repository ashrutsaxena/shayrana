package ashrut.saxena.destrution.shayar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class quotes extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        next = findViewById(R.id.button7);



        listItems = new ArrayList<>();
        ListItem item1 = new ListItem("SHAYARI", "PASSION IN MY MIND, WANTED TO DO SOMETHING GREAT THE PEOPLE WHO ARE SAYING ANYTHING BEHIND MY BACK  WANTED TO SHUT THEMSELVES WITH MY GREAT WORK", "");
        ListItem item50 = new ListItem("SHAYARI", "LIFE IS A BLOODY GAME,DO NOT LEAVE THE GAME , GO AND HELL WITH IT!!", "");
        ListItem item2 = new ListItem("SHAYARI", "PEOPLE WITH GREAT PASSION CAN MAKE THE IMPOSSIBLE HAPPEN", "");
        ListItem item3 = new ListItem("SHAYARI", "WHEN YOU TAKE FULL RESPONSIBILITY FOR THE SHIT YOU EXPERIENCE YOUR CHOICES WILL CHANGE", "");
        ListItem item4 = new ListItem("SHAYARI", "YOUR PRESENT CIRCUMSTANCES DON'T DETERMINE WHERE YOU CAN GO THEY MERELY DETERMINE WHERE YOU START", "");
        ListItem item5 = new ListItem("SHAYARI", "BE KIND TO EVERYONE,EVERYONE YOU MEET IS FIGHTING A HARD BATTLE", "");
        ListItem item6 = new ListItem("SHAYARI", "I AM A GREAT PLAYER , WHEN I COME TO PLAY , THERE IS NO ONE WHO CAN COMPETE WITH MY SKILLS AND MY PASSION", "");
        ListItem item7 = new ListItem("SHAYARI", "TIME TO THINK FOR YOURSELF RATHER THAN THINKING FOR OTHERS ,YOUR LIFE YOUR GOALS YOUR SUCCESS", "");
        ListItem item8 = new ListItem("SHAYARI", "IF YOU DON'T LEAVE YOUR PAST IN PAST,IT WILL DESTROY YOUR FUTURE.LIVE FOR WHAT TODAY HAS TO OFFER NOT FOR WHAT YESTERDAY HAS TAKEN FROM YOU", "");
        ListItem item9 = new ListItem("SHAYARI", "EGO A THREE LETTER WORD WHICH DESTROYED YEARS OF FRIENDSHIPS......", "");
        ListItem item10 = new ListItem("SHAYARI", "SOMETIMES GOD DOESN'T CHANGE YOUR SITUATION BECAUSE HE WANTS YOU TO LEARN HOW TO TACKLE WITH THAT SITUATION", "");
        ListItem item11 = new ListItem("SHAYARI", "MAKE PEACE WITH THE THINGS THAT HURT YOU AND THEY WILL NO LONGER HAVE CONTROL ON YOUR EMOTIONS", "");
        ListItem item12 = new ListItem("SHAYARI", "DEATH IS NOT THE GREATEST LOSS OF LIFE . THE GREATEST LOSS IS WHAT DIES INSIDE US WHILE WE LIVE..", "");
        ListItem item13 = new ListItem("SHAYARI", "THE REAL KINDNESS IS WHEN YOU ARE READY TO GIVE UP ON SOMETHING THAT YOU REALLY NEED..", "");
        ListItem item14 = new ListItem("SHAYARI", "VALUE EVERY PERSON IN YOUR LIFE OTHERWISE YOU WILL LOOSE YOUR VALUE IN THEIR LIFE.", "");
        ListItem item15 = new ListItem("SHAYARI", "LIVE LIKE A KING AND DIE LIKE A WORRIOR", "");
        ListItem item16 = new ListItem("SHAYARI", "IF I AM HERE WITH YOU THEN VALUE AND RESPECT ME BECAUSE IF ONCE I LEFT I WILL NOT RETURN BACK.", "");
        ListItem item17 = new ListItem("SHAYARI", "NO MATTER WHAT HAPPENS TODAY,NO MATTER HOW GOOD OR BAD MAY BE,KEEP MOVING FORWARD", "");
        ListItem item18 = new ListItem("SHAYARI", "LIFE IS LIKE A CRICKET,DEFEAT IS NOT DECLARED WHEN YOU GET OUT BUT WHEN YOU LOOSE HOPE TO WIN", "");
        ListItem item19 = new ListItem("SHAYARI", "YOUR LIFE HAS PURPOSE,YOUR STORY IS IMPORTANT,YOUR DREAM COUNT,YOUR VOICE MATTERS,YOU WERE BORN TO MAKE IMPACT", "");
        ListItem item20 = new ListItem("SHAYARI", "YOU DON'T LOOSE FRIENDS,YOU LOOSE UNDERCOVER HATERS.REAL FRIENDS CAN NEVER BE LOST", "");
        ListItem item21 = new ListItem("SHAYARI", "THE TAUNTS YOU RECEIVE TODAY ,WILL EVENTUALLY HELP YOU TO BUILD YOURSELF IN THE FUTURE", "");
        ListItem item22 = new ListItem("SHAYARI", "WITH TIME YOU GET TO KNOW THAT HOW THE WORLD IS AND HOW TO FIGHT AND LIVE IN THIS COMPETETIVE WORLD", "");
        ListItem item23 = new ListItem("SHAYARI", "LIFE WILL ALWAYS GIVE YOU ANOTHER OPPORTUNITY TO PROVE YOURSELF WHAT YOU WANTED TO,SO USE IT WELL EFFECTIVELY", "");
        ListItem item24 = new ListItem("SHAYARI", "BE THE PERSON WHO YOU WANTED TO BECOME , NOT THAT PERSON WHO EVERYONE DEMANDS OF..", "");
        ListItem item25 = new ListItem("SHAYARI", "NEVER MAKE A PERMANENT DECISION BASED ON TEMPORARY FEELINGS", "");
        ListItem item26 = new ListItem("SHAYARI", "NEVER GET DISTRACTED FROM YOUR PATH IRRESPECTIVE OF WHATEVER BAD HAPPENS TO YOUR LIFE..BE FOCUSSED", "");
        ListItem item27 = new ListItem("SHAYARI", "ONLY MAKE THOSE FRIENDS WHO VALUE YOU IN THEIR LIFE ..MAKE QUALITY FRIENDS NOT QUANTITY FRIENDS..REMEMBER!!", "");
        ListItem item28 = new ListItem("SHAYARI", "SOMETIMES LISTEN WHAT YOUR HEART SAYS NOT EVERYTIME YOUR HEART IS RIGHT", "");
        ListItem item29 = new ListItem("SHAYARI", "IN SPAN OF KEEPING EVERYONE HAPPY YOU LOOSE YOUR OWN RESPECT FOR YOURSELF", "");
        ListItem item30 = new ListItem("SHAYARI", "LEARN TO EXPRESS GOOD THINGS IN A RIGHT WAY,SOMETIMES THINGS ARE EXPRESSED IN A BAD WAY", "");
        ListItem item31 = new ListItem("SHAYARI", "WORK ON YOUR TALENT..,DESTINY WILL FALL IN ITS PLACE,", "");
        ListItem item32 = new ListItem("SHAYARI", "I WANT TO MAKE MY DREAMS TRUE BECAUSE NO ONE ELSE WILL TAKE SO WORRIES TO FULL FILL MY DREAMS , SO WORK FOR YOURSELF NOT FOR OTHERS", "");
        ListItem item33 = new ListItem("SHAYARI", "IN LIFE PICK UP YOUR DREAMS SO THAT WHEN IT TURNS TO REALITY YOU ARE THE FIRST ONE TO NOTICE IT.", "");
        ListItem item34 = new ListItem("SHAYARI", "HE CAME ON STAGE AND WAS ASKED TO SPEAK ABOUT FRIENDSHIP . HE SAID A LINE AND A HUGE APPKAUDING , HE RECEIVED FOR HIMSELF.. HE SAID..IF ALL THE WORDS AVAILABLE ON EARTH BE COMBINED , THEN ALSO THEY CANNOT DEFINE THE FRIENDSHIP..IT CAN ONLY BE FELT FROM DEPTH OF YOUR HEART..", "");
        ListItem item35 = new ListItem("SHAYARI", "TIME CURES EVERY PAIN FROM YOUR LIFE. BUT SOME PAINS CANNOT BE CURED BY TIME.. THEY REAIN INSIDE HEART FOREVER AND LEAVE DEEP IMPACT ON OUR LIVES", "");
        ListItem item36 = new ListItem("SHAYARI", "TIME CAN CHANGE EVERYTHING FOR YOU..BUT THERE IS SOMETHING THAT NO ONE CAN CHANGE .. IT WILL LAST FOREVER..EITHER HAPPINESS,ANGER,FRUSTRATION,SADNESS OR DEPRESSION...,IT S ALL WHAT LIFE GIVES IT TO YOU ", "");
        ListItem item37 = new ListItem("SHAYARI", "THE ONE WHO CRITICIZED ME FOR THAT I COPY OTHERS..,THE ONE WHO CRITICIZED THAT I CANNOT DO ANYTHING,IF I HAVE NOT MADE THEM TO SALUTE ME ONE DAY THEN SAY..,DESTRUCTION NECESSARY NOW", "");
        ListItem item38 = new ListItem("SHAYARI", "DON'T MAKE SOMEONE A PRIORITY WHO DON'T VALUE YOUR FEELINGS , MAKE SOMEONE A PRIORITY WHO VALUES YOUR FEELINGS AND TAKES CARE OF YOU", "");
        ListItem item39 = new ListItem("SHAYARI", "EVERY SMALL MOMENT YOU SPENT WITH YOUR BEST FRIEND EVENTUALLY BECOMES A GREAT MEMORY", "");
        ListItem item40 = new ListItem("SHAYARI", "THE ONLY THING THAT HURTS AFTER LEAVING SCHOOL IS THAT YOU WILL NEVER MEET THOSE LOVELY FRIENDS AGAIN..", "");
        ListItem item41 = new ListItem("SHAYARI", "WHATEVER HAPPENS IN YOUR LIFE BUT NEVER LEAVE THAT PERSON WHO WAS WITH YOU WHEN NO ONE WAS STANDING BY YOU", "");
        ListItem item42 = new ListItem("SHAYARI", "IF LIFE IS A BLOODY GAME , THEN I AM THE MOST OLDEST PLAYER OF ALL TIME", "");
        ListItem item43 = new ListItem("SHAYARI", "ONLY ONCE IN YOUR LIFE WORK FOR YOUR PASSION WITHOUT THINKING WHATEVER HAPPENS , AFTER WORKING FOR IT..BUT MUST TRY ONCE!!", "");
        ListItem item44 = new ListItem("SHAYARI", "IF LIFE GIVES YOU CHANCE TO TURN BACK TO YOUR PAST,THEN ONLY TURN BACK TO SEE HOW MUCH YOU CAME AHEAD", "");
        ListItem item45 = new ListItem("SHAYARI", "IN YOUR LIFE YOU MEET DIFFERENT KINDS OF PEOPLE BUT ONLY THOSE PEOPLE WILL BE REMEMBERED LIFE TIME , WHO ALWAYS SUPPORTED YOU IN ANYWAY..", "");
        ListItem item46 = new ListItem("SHAYARI", "IF PARENTS CAN SACRIFICE THEIR DREAMS FOR THEIR CHILDREN'S HAPPINRESS , THEN WE AS A CHILDREN TOO CAN SACRIFICE OUR DREAMS FOR THE HAPPINESS OF OUR PARENTS", "");
        ListItem item47 = new ListItem("SHAYARI", "BEFORE CHOOSING ANY BAD PATH, JUST REMEMBER YOUR PARENTS ARE WAITING FOR YOU AT HOME", "");
        ListItem item48 = new ListItem("SHAYARI", "LIFE IS TOO SHORT TO FIGHT AND TAKE REVENGE FROM YOUR FRIENDS .. FORGIVE THEM AND BE WITH THEM IN THEIR TOUGH TIMES..", "");
        ListItem item49 = new ListItem("SHAYARI", "TIME AND PRIORITY CHANGES BUT ONE WHOSE PRIORITY DOESN'T CHANGES WITH TIME , YOU SHOULD ALWAYS REMAIN WITH THEM..", "");
        //for(int i=0;i<10;i++){
        // ListItem item=new ListItem(
        //"item"+(i+1),
        // "description",
        // "rating"
        // );

        listItems.add(item1);
        listItems.add(item50);
        listItems.add(item2);
        listItems.add(item3);
        listItems.add(item4);
        listItems.add(item5);
        listItems.add(item6);
        listItems.add(item7);
        listItems.add(item8);
        listItems.add(item9);
        listItems.add(item10);
        listItems.add(item11);
        listItems.add(item12);
        listItems.add(item13);
        listItems.add(item14);
        listItems.add(item15);
        listItems.add(item16);
        listItems.add(item17);
        listItems.add(item18);
        listItems.add(item19);
        listItems.add(item20);
        listItems.add(item21);
        listItems.add(item22);
        listItems.add(item23);
        listItems.add(item24);
        listItems.add(item25);
        listItems.add(item26);
        listItems.add(item27);
        listItems.add(item28);
        listItems.add(item29);
        listItems.add(item30);
        listItems.add(item31);
        listItems.add(item32);
        listItems.add(item33);
        listItems.add(item34);
        listItems.add(item35);
        listItems.add(item36);
        listItems.add(item37);
        listItems.add(item38);
        listItems.add(item39);
        listItems.add(item40);
        listItems.add(item41);
        listItems.add(item42);
        listItems.add(item43);
        listItems.add(item44);
        listItems.add(item45);
        listItems.add(item46);
        listItems.add(item47);
        listItems.add(item48);
        listItems.add(item49);



        // }
        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(quotes.this, last.class));
            }
        });

    }
}
