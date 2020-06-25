class MainActivity extends AppCompatActivity {
    String getValue;
    long value;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
    }
    public void startFactorial(View view){
        getValue=editText.getText().toString();
        value = Integer.parseInt(getValue);
        value = getFactorial(value);
        textView.setText(String.valueOf(value));
    }
    public long getFactorial(long findN){
        if(findN<2) return findN;
        else return (findN*getFactorial(findN-1));
    }
}
