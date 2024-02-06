package com.example.androidbasics

class TutorialCodes {

    /* TODO Activity Lifecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("onStart")
    }
    override fun onResume() {
        super.onResume()
        println("onResume")
    }
    override fun onPause() {
        super.onPause()
        println("onPause")
    }
    override fun onStop() {
        super.onStop()
        println("onStop")
    }
    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }

    */

    /* TODO constraintLayout
      val btnApply = findViewById<Button>(R.id.btnApply)
      btnApply.setOnClickListener{
          val firstName = findViewById<EditText>(R.id.etFirstName).text.toString()
          val lastName = findViewById<EditText>(R.id.etLastName).text.toString()
          val birthDate = findViewById<EditText>(R.id.etBirthDate).text.toString()
          val country = findViewById<EditText>(R.id.etCountry).text.toString()

          Log.d("MainActivity", "$firstName $lastName, born on $birthDate, from $country just applied to the formula")
         */

    /* TODO textView
    val btnCount = findViewById<Button>(R.id.btnCount)
    val tvCount = findViewById<TextView>(R.id.tvCount)
    var count = 0
    btnCount.setOnClickListener{
        count++
        tvCount.text = "Let's count together: $count"
    }
     */

    /* TODO editText
    val btnAdd = findViewById<Button>(R.id.btnAdd)
    val tvResult = findViewById<TextView>(R.id.tvResult)
    val firstNumber = findViewById<EditText>(R.id.etFirstNumber).text.toString().toInt()
    val secondNumber = findViewById<EditText>(R.id.etSecondNumber).text.toString().toInt()
    var result = 0
    btnAdd.setOnClickListener {
        result = firstNumber + secondNumber
        tvResult.text = result.toString()
    }
     */

    /* TODO imageView
    val btnAddImage = findViewById<Button>(R.id.btnAddImage)
    val ivImage = findViewById<ImageView>(R.id.ivImage)
    btnAddImage.setOnClickListener {
        ivImage.setImageResource(R.drawable.duck)
    }
     */

    /*  TODO Toast
    val btnShowToast = findViewById<Button>(R.id.btnShowToast)
    btnShowToast.setOnClickListener {
        Toast.makeText(applicationContext, "Hi, i'm a toast", Toast.LENGTH_LONG).show()
    }
     TODO Custom Toast
    btnShowToast.setOnClickListener {
        Toast(this).apply {
            duration = Toast.LENGTH_LONG
            view = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.clToast))
            show()
        }
    }

     */

    /* TODO Checkbox and RadioButton
    val btnOrder = findViewById<Button>(R.id.btnOrder)
    val radioGroup = findViewById<RadioGroup>(R.id.rgMeat)
    val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
    val cbSalad = findViewById<CheckBox>(R.id.cbSalad)
    val cbOnions = findViewById<CheckBox>(R.id.cbOnions)
    val tvOrder = findViewById<TextView>(R.id.tvOrder)
    btnOrder.setOnClickListener {
        val checkedMeatRadioButton = radioGroup.checkedRadioButtonId
        val meat = findViewById<RadioButton>(checkedMeatRadioButton)
        val cheese = cbCheese.isChecked
        val salad = cbSalad.isChecked
        val onions = cbOnions.isChecked
        val orderString = "You order a burger with:\n" +
                "${meat.text}" +
                (if(cheese) "\nCheese" else "") +
                (if(salad) "\nSalad" else "") +
                (if(onions) "\nOnions" else "")
        tvOrder.text = orderString
    }

     */

    /* TODO Intent
    val btnOpenActivity = findViewById<Button>(R.id.btnOpenActivity)
    btnOpenActivity.setOnClickListener {
        Intent(this,SecondActivity::class.java).also {
            startActivity(it)
        }
    }

     */

    /* TODO Passing data
    val etName = findViewById<EditText>(R.id.etName)
    val etAge = findViewById<EditText>(R.id.etAge)
    val etCountry = findViewById<EditText>(R.id.etCountry)
    val btnApply = findViewById<Button>(R.id.btnApply)
    btnApply.setOnClickListener {
        val name = etName.text.toString()
        val age = etAge.text.toString().toInt()
        val country = etCountry.text.toString()
        val person = Person(name, age, country)
        Intent(this, SecondActivity::class.java).also {
            it.putExtra("EXTRA_PERSON",person)
            //it.putExtra("EXTRA_NAME",name)
            //it.putExtra("EXTRA_AGE",age)
            //it.putExtra("EXTRA_COUNTRY", country)
            startActivity(it)
        }
    }
     */

    /* TODO Permissions

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        val btnRequestPermissions = findViewById<Button>(R.id.btnRequestPermissions)
        btnRequestPermissions.setOnClickListener {
            requestPermissions()
        }
    }

    private fun hasWriteExternalStoragePermission() =
        ActivityCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED

    private fun hasLocationForegroundPermission() =
        ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED

    private fun hasWriteLocationBackgroundPermission() =
        ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED

    private fun requestPermissions() {
        var permissionToRequest = mutableListOf<String>()
        if(!hasWriteExternalStoragePermission()) {
            permissionToRequest.add(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if(!hasLocationForegroundPermission()) {
            permissionToRequest.add(android.Manifest.permission.ACCESS_COARSE_LOCATION)
        }
        if(!hasWriteLocationBackgroundPermission() && hasLocationForegroundPermission()) {
            permissionToRequest.add(android.Manifest.permission.ACCESS_BACKGROUND_LOCATION)
        }

        if(permissionToRequest.isNotEmpty()) {
            ActivityCompat.requestPermissions(this, permissionToRequest.toTypedArray(), 0)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 0 && grantResults.isNotEmpty()) {
            for (i in grantResults.indices) {
                if(grantResults[i] == PackageManager.PERMISSION_GRANTED)
                    Log.d("PermissionsRequest", "${permissions[i]} granted.")
            }
        }
    }
     */

    /* TODO Implicit Intent
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        val btnTakePhoto = findViewById<Button>(R.id.btnTakePhoto)
        btnTakePhoto.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also{
                it.type = "image/*"
                startActivityForResult(it,0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val ivPhoto = findViewById<ImageView>(R.id.imPhoto)
        if(resultCode == Activity.RESULT_OK && requestCode == 0) {
            val uri = data?.data
            ivPhoto.setImageURI(uri)
        }
    }

    */
     */

    /* TODO Toolbar Menu

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.miAddContact -> Toast.makeText(this, "You're clicked on Add Contact", Toast.LENGTH_SHORT).show()
            R.id.miFavorites -> Toast.makeText(this, "You're clicked on Favorite", Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this, "You're clicked on Settings", Toast.LENGTH_SHORT).show()
            R.id.miFeedback -> Toast.makeText(this, "You're clicked on Feedback", Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish()
        }
        return true
    }
     */

    /* TODO Alert Dialog

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add John to your contact list?")
            .setIcon(R.drawable.ic_add_custom_contact)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this,"You added John to your contact list",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(this,"You didn't add John to your contact list",Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog1 = findViewById<Button>(R.id.btnFirstDialog)
        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First Item", "Second Item", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose between this options")
            .setSingleChoiceItems(options, 0) {dialogInterface, i ->
                Toast.makeText(this,"You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this,"You accepted the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this,"You declined the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog2 = findViewById<Button>(R.id.btnSecondDialog)
        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of this options")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) { _, i, isChecked ->
                if(isChecked) {
                    Toast.makeText(this,"You checked on ${options[i]}",Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this,"You unchecked on ${options[i]}",Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this,"You accepted the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this,"You declined the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog3 = findViewById<Button>(R.id.btnThirdDialog)
        btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
     */


    /* TODO Spinner

     val spMonth = findViewById<Spinner>(R.id.spMonths)

        val customList = listOf("First", "Second", "Third", "Fourth")
        val adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, customList)
        //spMonth.adapter = adapter


        spMonth.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity,
                    "You selected ${adapterView?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
     */

    /* TODO RecyclerView

         var todoList = mutableListOf(
            Todo("Follow AndroidDevs", false),
            Todo("Learn about RecyclerView", true),
            Todo("Feed my cat", false),
            Todo("Prank my boss", false),
            Todo("Eat some curry", false),
            Todo("Ask my crush out", false),
            Todo("Take a shower", false),
        )

        val adapter = TodoAdapter(todoList)
        val rvTodos = findViewById<RecyclerView>(R.id.rvTodos)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        val etTodo = findViewById<EditText>(R.id.etTodo)
        val btnTodo = findViewById<Button>(R.id.btnAddTodo)
        btnTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }
     */

    /* TODO Fragment

    val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        val btnFragment1 = findViewById<Button>(R.id.btnFragment1)
        val btnFragment2 = findViewById<Button>(R.id.btnFragment2)

        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
     */

    /* TODO BottomNav

    val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

        setCurrentFragment(firstFragment)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.miHome -> setCurrentFragment(firstFragment)
                R.id.miMessages -> setCurrentFragment(secondFragment)
                R.id.miProfile -> setCurrentFragment(thirdFragment)
            }
            true
        }

        bottomNavigationView.getOrCreateBadge(R.id.miMessages).apply {
            number = 10
            isVisible = true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply() {
            replace(R.id.flFragment, fragment)
            commit()
        }
     */

    /* TODO Swipable Views

    val images = listOf(
            R.drawable.akali,
            R.drawable.duck,
            R.drawable.duck2,
            R.drawable.joker,
            R.drawable.maxresdefault,
            R.drawable.monogat,
            R.drawable.per3
        )

        val adapter = ViewPagerAdapter(images)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = adapter

        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(-10f)
        viewPager.endFakeDrag()
     */

    /* TODO TabLayout (in activity LinearLayout)

    val images = listOf(
            R.drawable.akali,
            R.drawable.duck,
            R.drawable.duck2,
            R.drawable.joker,
            R.drawable.maxresdefault,
            R.drawable.monogat,
            R.drawable.per3
        )

        val adapter = ViewPagerAdapter(images)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = adapter

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Selected ${tab?.text}",Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Unselected ${tab?.text}",Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity,"Reselected ${tab?.text}",Toast.LENGTH_SHORT).show()
            }
        })
     */

    /* TODO Navigation Drawer  (in activity DrawerLayout)

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navView = findViewById<NavigationView>(R.id.navView)
        navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.miItem1 -> Toast.makeText(applicationContext, "Clicked Item 1", Toast.LENGTH_SHORT).show()
                R.id.miItem2 -> Toast.makeText(applicationContext, "Clicked Item 2", Toast.LENGTH_SHORT).show()
                R.id.miItem3 -> Toast.makeText(applicationContext, "Clicked Item 3", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
     */

    /*TODO: Shared Preferences

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        //Only for small data

        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnLoad = findViewById<Button>(R.id.btnLoad)
        val cbAdult = findViewById<CheckBox>(R.id.cbAdult)
        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val isAdult = cbAdult.isChecked

            editor.apply{
                putString("name", name)
                putInt("age", age)
                putBoolean("isAdult", isAdult)
                apply()
            }
        }

        btnLoad.setOnClickListener {
            val name = sharedPref.getString("name", null)
            val age = sharedPref.getInt("age", 0)
            val isAdult = sharedPref.getBoolean("isAdult", false)

            etName.setText(name)
            etAge.setText(age.toString())
            cbAdult.isChecked = isAdult
        }
     */

    /* TODO: Notification

    val CHANNEL_ID = "channelID"
    val CHANNEL_NAME = "channelName"
    val NOTIFICATION_ID = 0


    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        val btnShowNotify = findViewById<Button>(R.id.btnShowNotify)
        createNotificationChannel()

        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)

        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Awesome notification")
            .setContentText("This is the context text")
            .setSmallIcon(R.drawable.ic_notification)
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
        Log.d("channel","build success")


        val notificationManager = NotificationManagerCompat.from(this)

        btnShowNotify.setOnClickListener{
            notificationManager.notify( NOTIFICATION_ID, notification.build() )
            Log.d("channel","notify")
        }
    }

    fun createNotificationChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT).apply{
                lightColor = Color.GREEN
                enableLights(true)
            }
            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
            Log.d("channel","created")
        }
    }
     */

    /*  TODO: INTENT SERVICE

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        val btnStop = findViewById<Button>(R.id.btnStop)
        val tvInfo = findViewById<TextView>(R.id.tvInfo)

        btnStart.setOnClickListener{
            Intent(this, MyIntentService::class.java).also{
                startService(it)
                tvInfo.text = "Service running"
            }
        }

        btnStop.setOnClickListener {
            MyIntentService.stopService()
            tvInfo.text = "Service stopped"
        }
    }
     */

    /*  TODO: SERVICES

         override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        val btnStop = findViewById<Button>(R.id.btnStop)
        val btnSend = findViewById<Button>(R.id.btnSendData)
        val tvInfo = findViewById<TextView>(R.id.tvInfo)
        val etData = findViewById<EditText>(R.id.etData)

        btnStart.setOnClickListener{
            Intent(this, MyService::class.java).also{
                startService(it)
                tvInfo.text = "Service running"
            }
        }

        btnStop.setOnClickListener {
            Intent(this, MyService::class.java).also{
                stopService(it)
                tvInfo.text = "Service stopped"
            }
        }

        btnSend.setOnClickListener {
            Intent(this, MyService::class.java).also{
                val dataString = etData.text.toString()
                it.putExtra("EXTRA_DATA",dataString)
                startService(it)
            }
        }
    }
     */

    /* TODO: Drag and Drop  (in activity LinearLayout -> inside 2 LinearLayouts)

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        val dragView = findViewById<View>(R.id.dragView)
        val llTop = findViewById<LinearLayout>(R.id.llTop)
        val llBottom = findViewById<LinearLayout>(R.id.llBottom)
        llTop.setOnDragListener(dragListener)
        llBottom.setOnDragListener(dragListener)
        dragView.setOnLongClickListener {
            val clipText = "This is clipData text"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            it.visibility = View.INVISIBLE
            true
        }

    }

    val dragListener = View.OnDragListener{ view, event ->
        when(event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DRAG_LOCATION -> {
                true
            }
            DragEvent.ACTION_DRAG_EXITED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val item = event.clipData.getItemAt(0)
                val dragData = item.text
                Toast.makeText(this,dragData,Toast.LENGTH_SHORT).show()

                view.invalidate()

                val v = event.localState as View
                val owner = v.parent as ViewGroup
                owner.removeView(v)
                val destination = view as LinearLayout
                destination.addView(v)
                v.visibility = View.VISIBLE
                true
            }
            DragEvent.ACTION_DRAG_ENDED -> {
                view.invalidate()
                true
            }
            else -> false
        }
    }
     */

    /* TODO: Broadcast Receivers

     lateinit var receiver : AirplaneModeChangedReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        receiver = AirplaneModeChangedReceiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it)
        }

    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
     */

    /* TODO: Uri

    val resourseUri = Uri.parse("android.resource://$packageName/drawable/duck") //Resourse Uri
        val duckBytes = contentResolver.openInputStream(resourseUri)?.use {
            it.readBytes()
        }
        println("Duck size: ${duckBytes?.size}")


        val file = File(filesDir, "duck.jpg") //File Uri
        FileOutputStream(file).use {
            it.write(duckBytes)
        }
        println(file.toUri())

        val contentUri = Uri.parse("content://com.example.provider/data")

        val dataUri = Uri.parse("data:text/plain;charset=UTF-8,Hello%20World")
    */

    /* TODO: Content Provider(Концепция понятна, но кода нет :(  )

     */

}

