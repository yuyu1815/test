/*     */ package kotlinx.serialization.json.internal;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\022\n\000\n\002\020\031\n\000\n\002\020\b\n\000\n\002\020\002\n\000\n\002\020\t\n\002\b\002\n\002\020\f\n\002\b\002\n\002\020\016\n\002\b\022\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\026J\020\020\020\032\0020\r2\006\020\021\032\0020\022H\026J\020\020\023\032\0020\r2\006\020\024\032\0020\025H\026J\020\020\026\032\0020\r2\006\020\024\032\0020\025H\026J\030\020\027\032\0020\r2\006\020\030\032\0020\0132\006\020\031\032\0020\025H\002J\030\020\032\032\0020\0132\006\020\033\032\0020\0132\006\020\034\032\0020\013H\002J\b\020\035\032\0020\rH\026J\b\020\036\032\0020\rH\002J\021\020\037\032\0020\r2\006\020 \032\0020\013H\bJ\021\020\023\032\0020\r2\006\020!\032\0020\013H\bJ\t\020\"\032\0020\013H\bJ\030\020#\032\0020\r2\006\020\031\032\0020\t2\006\020$\032\0020\013H\002J\020\020%\032\0020\r2\006\020&\032\0020\013H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000R\016\020\n\032\0020\013X\016¢\006\002\n\000¨\006'"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "stream", "Ljava/io/OutputStream;", "<init>", "(Ljava/io/OutputStream;)V", "buffer", "", "charArray", "", "indexInBuffer", "", "writeLong", "", "value", "", "writeChar", "char", "", "write", "text", "", "writeQuoted", "appendStringSlowPath", "currentSize", "string", "ensureTotalCapacity", "oldSize", "additional", "release", "flush", "ensure", "bytesCount", "byte", "rest", "writeUtf8", "count", "writeUtf8CodePoint", "codePoint", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJvmJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n130#1:269\n117#1:271\n130#1:272\n118#1,3:273\n125#1,2:276\n130#1:278\n125#1,2:279\n117#1:281\n130#1:282\n118#1,3:283\n125#1,2:286\n125#1,2:288\n117#1:290\n130#1:291\n118#1,3:292\n125#1,2:295\n125#1,2:297\n125#1,2:299\n117#1:301\n130#1:302\n118#1,3:303\n125#1,2:306\n117#1:308\n130#1:309\n118#1,3:310\n125#1,2:313\n125#1,2:315\n125#1,2:317\n125#1,2:319\n117#1:321\n130#1:322\n118#1,3:323\n125#1,2:326\n117#1:328\n130#1:329\n118#1,3:330\n125#1,2:333\n125#1,2:335\n117#1:337\n130#1:338\n118#1,3:339\n125#1,2:342\n117#1:344\n130#1:345\n118#1,3:346\n125#1,2:349\n125#1,2:351\n125#1,2:353\n117#1:355\n130#1:356\n118#1,3:357\n125#1,2:360\n125#1,2:362\n125#1,2:364\n125#1,2:366\n1#2:270\n*S KotlinDebug\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n*L\n117#1:269\n148#1:271\n148#1:272\n148#1:273,3\n149#1:276,2\n151#1:278\n158#1:279,2\n165#1:281\n165#1:282\n165#1:283,3\n166#1:286,2\n167#1:288,2\n173#1:290\n173#1:291\n173#1:292,3\n174#1:295,2\n175#1:297,2\n176#1:299,2\n186#1:301\n186#1:302\n186#1:303,3\n187#1:306,2\n196#1:308\n196#1:309\n196#1:310,3\n197#1:313,2\n198#1:315,2\n199#1:317,2\n200#1:319,2\n215#1:321\n215#1:322\n215#1:323,3\n216#1:326,2\n221#1:328\n221#1:329\n221#1:330,3\n222#1:333,2\n223#1:335,2\n228#1:337\n228#1:338\n228#1:339,3\n229#1:342,2\n234#1:344\n234#1:345\n234#1:346,3\n235#1:349,2\n236#1:351,2\n237#1:353,2\n242#1:355\n242#1:356\n242#1:357,3\n243#1:360,2\n244#1:362,2\n245#1:364,2\n246#1:366,2\n*E\n"})
/*     */ public final class JsonToJavaStreamWriter implements InternalJsonWriter { @NotNull
/*     */   private final OutputStream stream; @NotNull
/*     */   private final byte[] buffer; public JsonToJavaStreamWriter(@NotNull OutputStream stream) {
/*   6 */     this.stream = stream;
/*   7 */     this.buffer = ByteArrayPool.INSTANCE.take();
/*   8 */     this.charArray = CharArrayPool.INSTANCE.take();
/*     */   } @NotNull
/*     */   private char[] charArray; private int indexInBuffer;
/*     */   public void writeLong(long value) {
/*  12 */     write(String.valueOf(value));
/*     */   }
/*     */   
/*     */   public void writeChar(char char) {
/*  16 */     writeUtf8CodePoint(char);
/*     */   }
/*     */   
/*     */   public void write(@NotNull String text) {
/*  20 */     Intrinsics.checkNotNullParameter(text, "text"); int length = text.length();
/*  21 */     ensureTotalCapacity(0, length);
/*  22 */     String str = text; char[] arrayOfChar = this.charArray; boolean bool1 = false, bool2 = false; str.getChars(bool2, length, arrayOfChar, bool1);
/*  23 */     writeUtf8(this.charArray, length);
/*     */   }
/*     */   
/*     */   public void writeQuoted(@NotNull String text) {
/*  27 */     Intrinsics.checkNotNullParameter(text, "text"); ensureTotalCapacity(0, text.length() + 2);
/*  28 */     char[] arr = this.charArray;
/*  29 */     arr[0] = '"';
/*  30 */     int length = text.length();
/*  31 */     String str = text; int j = 1; boolean bool = false; str.getChars(bool, length, arr, j);
/*  32 */     for (int i = 1; i < j; i++) {
/*  33 */       int ch = arr[i];
/*     */       
/*  35 */       if (ch < (StringOpsKt.getESCAPE_MARKERS()).length && StringOpsKt.getESCAPE_MARKERS()[ch] != 0) {
/*     */         
/*  37 */         appendStringSlowPath(i, text);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/*  43 */     arr[length + 1] = '"';
/*     */     
/*  45 */     writeUtf8(arr, length + 2);
/*  46 */     flush();
/*     */   }
/*     */   
/*     */   private final void appendStringSlowPath(int currentSize, String string) {
/*  50 */     int sz = currentSize;
/*  51 */     for (int i = currentSize - 1, j = string.length(); i < j; i++) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  56 */       sz = ensureTotalCapacity(sz, 2);
/*  57 */       int ch = string.charAt(i);
/*     */       
/*  59 */       if (ch < (StringOpsKt.getESCAPE_MARKERS()).length) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  66 */         byte marker = StringOpsKt.getESCAPE_MARKERS()[ch];
/*  67 */         if (marker == 0) {
/*  68 */           this.charArray[sz++] = (char)ch;
/*     */         
/*     */         }
/*  71 */         else if (marker == 1) {
/*  72 */           Intrinsics.checkNotNull(StringOpsKt.getESCAPE_STRINGS()[ch]); String escapedString = StringOpsKt.getESCAPE_STRINGS()[ch];
/*  73 */           sz = ensureTotalCapacity(sz, escapedString.length());
/*  74 */           String str1 = escapedString; char[] arrayOfChar = this.charArray; boolean bool = false; int k = escapedString.length(); str1.getChars(bool, k, arrayOfChar, sz);
/*  75 */           sz += escapedString.length();
/*     */         }
/*     */         else {
/*     */           
/*  79 */           this.charArray[sz] = '\\';
/*  80 */           this.charArray[sz + 1] = (char)marker;
/*  81 */           sz += 2;
/*     */         } 
/*     */       } else {
/*     */         
/*  85 */         this.charArray[sz++] = (char)ch;
/*     */       } 
/*     */     } 
/*  88 */     ensureTotalCapacity(sz, 1);
/*  89 */     this.charArray[sz++] = '"';
/*  90 */     writeUtf8(this.charArray, sz);
/*  91 */     flush();
/*     */   }
/*     */   
/*     */   private final int ensureTotalCapacity(int oldSize, int additional) {
/*  95 */     int newSize = oldSize + additional;
/*  96 */     if (this.charArray.length <= newSize) {
/*  97 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.charArray, RangesKt.coerceAtLeast(newSize, oldSize * 2)), "copyOf(...)"); this.charArray = Arrays.copyOf(this.charArray, RangesKt.coerceAtLeast(newSize, oldSize * 2));
/*     */     } 
/*  99 */     return oldSize;
/*     */   }
/*     */   
/*     */   public void release() {
/* 103 */     flush();
/* 104 */     CharArrayPool.INSTANCE.release(this.charArray);
/* 105 */     ByteArrayPool.INSTANCE.release(this.buffer);
/*     */   }
/*     */   
/*     */   private final void flush() {
/* 109 */     this.stream.write(this.buffer, 0, this.indexInBuffer);
/* 110 */     this.indexInBuffer = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void ensure(int bytesCount) {
/* 117 */     int $i$f$ensure = 0; JsonToJavaStreamWriter this_$iv = this; int $i$f$rest = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 269 */     if (this_$iv.buffer.length - this_$iv.indexInBuffer < bytesCount) {
/*     */       flush();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void write(int byte) {
/*     */     int $i$f$write = 0, i = this.indexInBuffer;
/*     */     this.indexInBuffer = i + 1;
/*     */     this.buffer[i] = (byte)byte;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int rest() {
/*     */     int $i$f$rest = 0;
/*     */     return this.buffer.length - this.indexInBuffer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void writeUtf8(char[] string, int count) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iflt -> 8
/*     */     //   4: iconst_1
/*     */     //   5: goto -> 9
/*     */     //   8: iconst_0
/*     */     //   9: ifne -> 32
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: ldc 'count < 0'
/*     */     //   17: astore #4
/*     */     //   19: new java/lang/IllegalArgumentException
/*     */     //   22: dup
/*     */     //   23: aload #4
/*     */     //   25: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   28: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   31: athrow
/*     */     //   32: iload_2
/*     */     //   33: aload_1
/*     */     //   34: arraylength
/*     */     //   35: if_icmpgt -> 42
/*     */     //   38: iconst_1
/*     */     //   39: goto -> 43
/*     */     //   42: iconst_0
/*     */     //   43: ifne -> 93
/*     */     //   46: iconst_0
/*     */     //   47: istore #4
/*     */     //   49: new java/lang/StringBuilder
/*     */     //   52: dup
/*     */     //   53: invokespecial <init> : ()V
/*     */     //   56: ldc 'count > string.length: '
/*     */     //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   61: iload_2
/*     */     //   62: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   65: ldc ' > '
/*     */     //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   70: aload_1
/*     */     //   71: arraylength
/*     */     //   72: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   75: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   78: astore #4
/*     */     //   80: new java/lang/IllegalArgumentException
/*     */     //   83: dup
/*     */     //   84: aload #4
/*     */     //   86: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   89: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   92: athrow
/*     */     //   93: iconst_0
/*     */     //   94: istore_3
/*     */     //   95: iload_3
/*     */     //   96: iload_2
/*     */     //   97: if_icmpge -> 1013
/*     */     //   100: aload_1
/*     */     //   101: iload_3
/*     */     //   102: caload
/*     */     //   103: istore #4
/*     */     //   105: nop
/*     */     //   106: iload #4
/*     */     //   108: sipush #128
/*     */     //   111: if_icmpge -> 279
/*     */     //   114: aload_0
/*     */     //   115: astore #5
/*     */     //   117: iconst_1
/*     */     //   118: istore #6
/*     */     //   120: iconst_0
/*     */     //   121: istore #7
/*     */     //   123: aload #5
/*     */     //   125: astore #8
/*     */     //   127: iconst_0
/*     */     //   128: istore #9
/*     */     //   130: aload #8
/*     */     //   132: getfield buffer : [B
/*     */     //   135: arraylength
/*     */     //   136: aload #8
/*     */     //   138: getfield indexInBuffer : I
/*     */     //   141: isub
/*     */     //   142: iload #6
/*     */     //   144: if_icmpge -> 152
/*     */     //   147: aload #5
/*     */     //   149: invokespecial flush : ()V
/*     */     //   152: nop
/*     */     //   153: aload_0
/*     */     //   154: astore #5
/*     */     //   156: iconst_0
/*     */     //   157: istore #6
/*     */     //   159: aload #5
/*     */     //   161: getfield buffer : [B
/*     */     //   164: aload #5
/*     */     //   166: getfield indexInBuffer : I
/*     */     //   169: istore #7
/*     */     //   171: aload #5
/*     */     //   173: iload #7
/*     */     //   175: iconst_1
/*     */     //   176: iadd
/*     */     //   177: putfield indexInBuffer : I
/*     */     //   180: iload #7
/*     */     //   182: iload #4
/*     */     //   184: i2b
/*     */     //   185: bastore
/*     */     //   186: nop
/*     */     //   187: iinc #3, 1
/*     */     //   190: iload_3
/*     */     //   191: aload_0
/*     */     //   192: astore #6
/*     */     //   194: iconst_0
/*     */     //   195: istore #7
/*     */     //   197: aload #6
/*     */     //   199: getfield buffer : [B
/*     */     //   202: arraylength
/*     */     //   203: aload #6
/*     */     //   205: getfield indexInBuffer : I
/*     */     //   208: isub
/*     */     //   209: iadd
/*     */     //   210: istore #6
/*     */     //   212: iload_2
/*     */     //   213: iload #6
/*     */     //   215: invokestatic min : (II)I
/*     */     //   218: istore #5
/*     */     //   220: iload_3
/*     */     //   221: iload #5
/*     */     //   223: if_icmpge -> 95
/*     */     //   226: aload_1
/*     */     //   227: iload_3
/*     */     //   228: caload
/*     */     //   229: istore #4
/*     */     //   231: iload #4
/*     */     //   233: sipush #128
/*     */     //   236: if_icmpge -> 95
/*     */     //   239: aload_0
/*     */     //   240: astore #6
/*     */     //   242: iconst_0
/*     */     //   243: istore #7
/*     */     //   245: aload #6
/*     */     //   247: getfield buffer : [B
/*     */     //   250: aload #6
/*     */     //   252: getfield indexInBuffer : I
/*     */     //   255: istore #8
/*     */     //   257: aload #6
/*     */     //   259: iload #8
/*     */     //   261: iconst_1
/*     */     //   262: iadd
/*     */     //   263: putfield indexInBuffer : I
/*     */     //   266: iload #8
/*     */     //   268: iload #4
/*     */     //   270: i2b
/*     */     //   271: bastore
/*     */     //   272: nop
/*     */     //   273: iinc #3, 1
/*     */     //   276: goto -> 220
/*     */     //   279: iload #4
/*     */     //   281: sipush #2048
/*     */     //   284: if_icmpge -> 424
/*     */     //   287: aload_0
/*     */     //   288: astore #5
/*     */     //   290: iconst_2
/*     */     //   291: istore #6
/*     */     //   293: iconst_0
/*     */     //   294: istore #7
/*     */     //   296: aload #5
/*     */     //   298: astore #8
/*     */     //   300: iconst_0
/*     */     //   301: istore #9
/*     */     //   303: aload #8
/*     */     //   305: getfield buffer : [B
/*     */     //   308: arraylength
/*     */     //   309: aload #8
/*     */     //   311: getfield indexInBuffer : I
/*     */     //   314: isub
/*     */     //   315: iload #6
/*     */     //   317: if_icmpge -> 325
/*     */     //   320: aload #5
/*     */     //   322: invokespecial flush : ()V
/*     */     //   325: nop
/*     */     //   326: aload_0
/*     */     //   327: astore #5
/*     */     //   329: iload #4
/*     */     //   331: bipush #6
/*     */     //   333: ishr
/*     */     //   334: sipush #192
/*     */     //   337: ior
/*     */     //   338: istore #6
/*     */     //   340: iconst_0
/*     */     //   341: istore #7
/*     */     //   343: aload #5
/*     */     //   345: getfield buffer : [B
/*     */     //   348: aload #5
/*     */     //   350: getfield indexInBuffer : I
/*     */     //   353: istore #8
/*     */     //   355: aload #5
/*     */     //   357: iload #8
/*     */     //   359: iconst_1
/*     */     //   360: iadd
/*     */     //   361: putfield indexInBuffer : I
/*     */     //   364: iload #8
/*     */     //   366: iload #6
/*     */     //   368: i2b
/*     */     //   369: bastore
/*     */     //   370: nop
/*     */     //   371: aload_0
/*     */     //   372: astore #5
/*     */     //   374: iload #4
/*     */     //   376: bipush #63
/*     */     //   378: iand
/*     */     //   379: sipush #128
/*     */     //   382: ior
/*     */     //   383: istore #6
/*     */     //   385: iconst_0
/*     */     //   386: istore #7
/*     */     //   388: aload #5
/*     */     //   390: getfield buffer : [B
/*     */     //   393: aload #5
/*     */     //   395: getfield indexInBuffer : I
/*     */     //   398: istore #8
/*     */     //   400: aload #5
/*     */     //   402: iload #8
/*     */     //   404: iconst_1
/*     */     //   405: iadd
/*     */     //   406: putfield indexInBuffer : I
/*     */     //   409: iload #8
/*     */     //   411: iload #6
/*     */     //   413: i2b
/*     */     //   414: bastore
/*     */     //   415: nop
/*     */     //   416: iload_3
/*     */     //   417: iinc #3, 1
/*     */     //   420: pop
/*     */     //   421: goto -> 95
/*     */     //   424: iload #4
/*     */     //   426: ldc 55296
/*     */     //   428: if_icmplt -> 438
/*     */     //   431: iload #4
/*     */     //   433: ldc 57343
/*     */     //   435: if_icmple -> 623
/*     */     //   438: aload_0
/*     */     //   439: astore #5
/*     */     //   441: iconst_3
/*     */     //   442: istore #6
/*     */     //   444: iconst_0
/*     */     //   445: istore #7
/*     */     //   447: aload #5
/*     */     //   449: astore #8
/*     */     //   451: iconst_0
/*     */     //   452: istore #9
/*     */     //   454: aload #8
/*     */     //   456: getfield buffer : [B
/*     */     //   459: arraylength
/*     */     //   460: aload #8
/*     */     //   462: getfield indexInBuffer : I
/*     */     //   465: isub
/*     */     //   466: iload #6
/*     */     //   468: if_icmpge -> 476
/*     */     //   471: aload #5
/*     */     //   473: invokespecial flush : ()V
/*     */     //   476: nop
/*     */     //   477: aload_0
/*     */     //   478: astore #5
/*     */     //   480: iload #4
/*     */     //   482: bipush #12
/*     */     //   484: ishr
/*     */     //   485: sipush #224
/*     */     //   488: ior
/*     */     //   489: istore #6
/*     */     //   491: iconst_0
/*     */     //   492: istore #7
/*     */     //   494: aload #5
/*     */     //   496: getfield buffer : [B
/*     */     //   499: aload #5
/*     */     //   501: getfield indexInBuffer : I
/*     */     //   504: istore #8
/*     */     //   506: aload #5
/*     */     //   508: iload #8
/*     */     //   510: iconst_1
/*     */     //   511: iadd
/*     */     //   512: putfield indexInBuffer : I
/*     */     //   515: iload #8
/*     */     //   517: iload #6
/*     */     //   519: i2b
/*     */     //   520: bastore
/*     */     //   521: nop
/*     */     //   522: aload_0
/*     */     //   523: astore #5
/*     */     //   525: iload #4
/*     */     //   527: bipush #6
/*     */     //   529: ishr
/*     */     //   530: bipush #63
/*     */     //   532: iand
/*     */     //   533: sipush #128
/*     */     //   536: ior
/*     */     //   537: istore #6
/*     */     //   539: iconst_0
/*     */     //   540: istore #7
/*     */     //   542: aload #5
/*     */     //   544: getfield buffer : [B
/*     */     //   547: aload #5
/*     */     //   549: getfield indexInBuffer : I
/*     */     //   552: istore #8
/*     */     //   554: aload #5
/*     */     //   556: iload #8
/*     */     //   558: iconst_1
/*     */     //   559: iadd
/*     */     //   560: putfield indexInBuffer : I
/*     */     //   563: iload #8
/*     */     //   565: iload #6
/*     */     //   567: i2b
/*     */     //   568: bastore
/*     */     //   569: nop
/*     */     //   570: aload_0
/*     */     //   571: astore #5
/*     */     //   573: iload #4
/*     */     //   575: bipush #63
/*     */     //   577: iand
/*     */     //   578: sipush #128
/*     */     //   581: ior
/*     */     //   582: istore #6
/*     */     //   584: iconst_0
/*     */     //   585: istore #7
/*     */     //   587: aload #5
/*     */     //   589: getfield buffer : [B
/*     */     //   592: aload #5
/*     */     //   594: getfield indexInBuffer : I
/*     */     //   597: istore #8
/*     */     //   599: aload #5
/*     */     //   601: iload #8
/*     */     //   603: iconst_1
/*     */     //   604: iadd
/*     */     //   605: putfield indexInBuffer : I
/*     */     //   608: iload #8
/*     */     //   610: iload #6
/*     */     //   612: i2b
/*     */     //   613: bastore
/*     */     //   614: nop
/*     */     //   615: iload_3
/*     */     //   616: iinc #3, 1
/*     */     //   619: pop
/*     */     //   620: goto -> 95
/*     */     //   623: iload_3
/*     */     //   624: iconst_1
/*     */     //   625: iadd
/*     */     //   626: iload_2
/*     */     //   627: if_icmpge -> 638
/*     */     //   630: aload_1
/*     */     //   631: iload_3
/*     */     //   632: iconst_1
/*     */     //   633: iadd
/*     */     //   634: caload
/*     */     //   635: goto -> 639
/*     */     //   638: iconst_0
/*     */     //   639: istore #5
/*     */     //   641: iload #4
/*     */     //   643: ldc 56319
/*     */     //   645: if_icmpgt -> 674
/*     */     //   648: ldc 56320
/*     */     //   650: iload #5
/*     */     //   652: if_icmpgt -> 670
/*     */     //   655: iload #5
/*     */     //   657: ldc 57344
/*     */     //   659: if_icmpge -> 666
/*     */     //   662: iconst_1
/*     */     //   663: goto -> 671
/*     */     //   666: iconst_0
/*     */     //   667: goto -> 671
/*     */     //   670: iconst_0
/*     */     //   671: ifne -> 759
/*     */     //   674: aload_0
/*     */     //   675: astore #6
/*     */     //   677: iconst_1
/*     */     //   678: istore #7
/*     */     //   680: iconst_0
/*     */     //   681: istore #8
/*     */     //   683: aload #6
/*     */     //   685: astore #9
/*     */     //   687: iconst_0
/*     */     //   688: istore #10
/*     */     //   690: aload #9
/*     */     //   692: getfield buffer : [B
/*     */     //   695: arraylength
/*     */     //   696: aload #9
/*     */     //   698: getfield indexInBuffer : I
/*     */     //   701: isub
/*     */     //   702: iload #7
/*     */     //   704: if_icmpge -> 712
/*     */     //   707: aload #6
/*     */     //   709: invokespecial flush : ()V
/*     */     //   712: nop
/*     */     //   713: aload_0
/*     */     //   714: astore #6
/*     */     //   716: bipush #63
/*     */     //   718: istore #7
/*     */     //   720: iconst_0
/*     */     //   721: istore #8
/*     */     //   723: aload #6
/*     */     //   725: getfield buffer : [B
/*     */     //   728: aload #6
/*     */     //   730: getfield indexInBuffer : I
/*     */     //   733: istore #9
/*     */     //   735: aload #6
/*     */     //   737: iload #9
/*     */     //   739: iconst_1
/*     */     //   740: iadd
/*     */     //   741: putfield indexInBuffer : I
/*     */     //   744: iload #9
/*     */     //   746: iload #7
/*     */     //   748: i2b
/*     */     //   749: bastore
/*     */     //   750: nop
/*     */     //   751: iload_3
/*     */     //   752: iinc #3, 1
/*     */     //   755: pop
/*     */     //   756: goto -> 95
/*     */     //   759: ldc 65536
/*     */     //   761: iload #4
/*     */     //   763: sipush #1023
/*     */     //   766: iand
/*     */     //   767: bipush #10
/*     */     //   769: ishl
/*     */     //   770: iload #5
/*     */     //   772: sipush #1023
/*     */     //   775: iand
/*     */     //   776: ior
/*     */     //   777: iadd
/*     */     //   778: istore #6
/*     */     //   780: aload_0
/*     */     //   781: astore #7
/*     */     //   783: iconst_4
/*     */     //   784: istore #8
/*     */     //   786: iconst_0
/*     */     //   787: istore #9
/*     */     //   789: aload #7
/*     */     //   791: astore #10
/*     */     //   793: iconst_0
/*     */     //   794: istore #11
/*     */     //   796: aload #10
/*     */     //   798: getfield buffer : [B
/*     */     //   801: arraylength
/*     */     //   802: aload #10
/*     */     //   804: getfield indexInBuffer : I
/*     */     //   807: isub
/*     */     //   808: iload #8
/*     */     //   810: if_icmpge -> 818
/*     */     //   813: aload #7
/*     */     //   815: invokespecial flush : ()V
/*     */     //   818: nop
/*     */     //   819: aload_0
/*     */     //   820: astore #7
/*     */     //   822: iload #6
/*     */     //   824: bipush #18
/*     */     //   826: ishr
/*     */     //   827: sipush #240
/*     */     //   830: ior
/*     */     //   831: istore #8
/*     */     //   833: iconst_0
/*     */     //   834: istore #9
/*     */     //   836: aload #7
/*     */     //   838: getfield buffer : [B
/*     */     //   841: aload #7
/*     */     //   843: getfield indexInBuffer : I
/*     */     //   846: istore #10
/*     */     //   848: aload #7
/*     */     //   850: iload #10
/*     */     //   852: iconst_1
/*     */     //   853: iadd
/*     */     //   854: putfield indexInBuffer : I
/*     */     //   857: iload #10
/*     */     //   859: iload #8
/*     */     //   861: i2b
/*     */     //   862: bastore
/*     */     //   863: nop
/*     */     //   864: aload_0
/*     */     //   865: astore #7
/*     */     //   867: iload #6
/*     */     //   869: bipush #12
/*     */     //   871: ishr
/*     */     //   872: bipush #63
/*     */     //   874: iand
/*     */     //   875: sipush #128
/*     */     //   878: ior
/*     */     //   879: istore #8
/*     */     //   881: iconst_0
/*     */     //   882: istore #9
/*     */     //   884: aload #7
/*     */     //   886: getfield buffer : [B
/*     */     //   889: aload #7
/*     */     //   891: getfield indexInBuffer : I
/*     */     //   894: istore #10
/*     */     //   896: aload #7
/*     */     //   898: iload #10
/*     */     //   900: iconst_1
/*     */     //   901: iadd
/*     */     //   902: putfield indexInBuffer : I
/*     */     //   905: iload #10
/*     */     //   907: iload #8
/*     */     //   909: i2b
/*     */     //   910: bastore
/*     */     //   911: nop
/*     */     //   912: aload_0
/*     */     //   913: astore #7
/*     */     //   915: iload #6
/*     */     //   917: bipush #6
/*     */     //   919: ishr
/*     */     //   920: bipush #63
/*     */     //   922: iand
/*     */     //   923: sipush #128
/*     */     //   926: ior
/*     */     //   927: istore #8
/*     */     //   929: iconst_0
/*     */     //   930: istore #9
/*     */     //   932: aload #7
/*     */     //   934: getfield buffer : [B
/*     */     //   937: aload #7
/*     */     //   939: getfield indexInBuffer : I
/*     */     //   942: istore #10
/*     */     //   944: aload #7
/*     */     //   946: iload #10
/*     */     //   948: iconst_1
/*     */     //   949: iadd
/*     */     //   950: putfield indexInBuffer : I
/*     */     //   953: iload #10
/*     */     //   955: iload #8
/*     */     //   957: i2b
/*     */     //   958: bastore
/*     */     //   959: nop
/*     */     //   960: aload_0
/*     */     //   961: astore #7
/*     */     //   963: iload #6
/*     */     //   965: bipush #63
/*     */     //   967: iand
/*     */     //   968: sipush #128
/*     */     //   971: ior
/*     */     //   972: istore #8
/*     */     //   974: iconst_0
/*     */     //   975: istore #9
/*     */     //   977: aload #7
/*     */     //   979: getfield buffer : [B
/*     */     //   982: aload #7
/*     */     //   984: getfield indexInBuffer : I
/*     */     //   987: istore #10
/*     */     //   989: aload #7
/*     */     //   991: iload #10
/*     */     //   993: iconst_1
/*     */     //   994: iadd
/*     */     //   995: putfield indexInBuffer : I
/*     */     //   998: iload #10
/*     */     //   1000: iload #8
/*     */     //   1002: i2b
/*     */     //   1003: bastore
/*     */     //   1004: nop
/*     */     //   1005: iinc #3, 2
/*     */     //   1008: iload_3
/*     */     //   1009: pop
/*     */     //   1010: goto -> 95
/*     */     //   1013: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #137	-> 0
/*     */     //   #270	-> 12
/*     */     //   #137	-> 15
/*     */     //   #137	-> 17
/*     */     //   #138	-> 32
/*     */     //   #270	-> 46
/*     */     //   #138	-> 49
/*     */     //   #138	-> 78
/*     */     //   #141	-> 93
/*     */     //   #142	-> 95
/*     */     //   #143	-> 100
/*     */     //   #143	-> 103
/*     */     //   #145	-> 105
/*     */     //   #146	-> 106
/*     */     //   #148	-> 114
/*     */     //   #271	-> 123
/*     */     //   #272	-> 130
/*     */     //   #271	-> 142
/*     */     //   #273	-> 147
/*     */     //   #275	-> 152
/*     */     //   #149	-> 153
/*     */     //   #276	-> 159
/*     */     //   #277	-> 186
/*     */     //   #150	-> 187
/*     */     //   #151	-> 190
/*     */     //   #278	-> 197
/*     */     //   #151	-> 209
/*     */     //   #151	-> 218
/*     */     //   #155	-> 220
/*     */     //   #156	-> 226
/*     */     //   #156	-> 229
/*     */     //   #157	-> 231
/*     */     //   #158	-> 239
/*     */     //   #279	-> 245
/*     */     //   #280	-> 272
/*     */     //   #159	-> 273
/*     */     //   #163	-> 279
/*     */     //   #165	-> 287
/*     */     //   #281	-> 296
/*     */     //   #282	-> 303
/*     */     //   #281	-> 315
/*     */     //   #283	-> 320
/*     */     //   #285	-> 325
/*     */     //   #166	-> 326
/*     */     //   #286	-> 343
/*     */     //   #287	-> 370
/*     */     //   #167	-> 371
/*     */     //   #288	-> 388
/*     */     //   #289	-> 415
/*     */     //   #168	-> 416
/*     */     //   #171	-> 424
/*     */     //   #173	-> 438
/*     */     //   #290	-> 447
/*     */     //   #291	-> 454
/*     */     //   #290	-> 466
/*     */     //   #292	-> 471
/*     */     //   #294	-> 476
/*     */     //   #174	-> 477
/*     */     //   #295	-> 494
/*     */     //   #296	-> 521
/*     */     //   #175	-> 522
/*     */     //   #297	-> 542
/*     */     //   #298	-> 569
/*     */     //   #176	-> 570
/*     */     //   #299	-> 587
/*     */     //   #300	-> 614
/*     */     //   #177	-> 615
/*     */     //   #184	-> 623
/*     */     //   #184	-> 638
/*     */     //   #185	-> 641
/*     */     //   #186	-> 674
/*     */     //   #301	-> 683
/*     */     //   #302	-> 690
/*     */     //   #301	-> 702
/*     */     //   #303	-> 707
/*     */     //   #305	-> 712
/*     */     //   #187	-> 713
/*     */     //   #306	-> 723
/*     */     //   #307	-> 750
/*     */     //   #188	-> 751
/*     */     //   #193	-> 759
/*     */     //   #196	-> 780
/*     */     //   #308	-> 789
/*     */     //   #309	-> 796
/*     */     //   #308	-> 808
/*     */     //   #310	-> 813
/*     */     //   #312	-> 818
/*     */     //   #197	-> 819
/*     */     //   #313	-> 836
/*     */     //   #314	-> 863
/*     */     //   #198	-> 864
/*     */     //   #315	-> 884
/*     */     //   #316	-> 911
/*     */     //   #199	-> 912
/*     */     //   #317	-> 932
/*     */     //   #318	-> 959
/*     */     //   #200	-> 960
/*     */     //   #319	-> 977
/*     */     //   #320	-> 1004
/*     */     //   #201	-> 1005
/*     */     //   #206	-> 1013
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   15	2	4	$i$a$-require-JsonToJavaStreamWriter$writeUtf8$1	I
/*     */     //   49	29	4	$i$a$-require-JsonToJavaStreamWriter$writeUtf8$2	I
/*     */     //   130	12	9	$i$f$rest	I
/*     */     //   127	15	8	this_$iv$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   123	30	7	$i$f$ensure	I
/*     */     //   120	33	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   120	33	6	bytesCount$iv	I
/*     */     //   159	28	6	$i$f$write	I
/*     */     //   156	31	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   197	12	7	$i$f$rest	I
/*     */     //   194	15	6	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   245	28	7	$i$f$write	I
/*     */     //   242	31	6	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   220	59	5	runLimit	I
/*     */     //   303	12	9	$i$f$rest	I
/*     */     //   300	15	8	this_$iv$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   296	30	7	$i$f$ensure	I
/*     */     //   293	33	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   293	33	6	bytesCount$iv	I
/*     */     //   343	28	7	$i$f$write	I
/*     */     //   340	31	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   340	31	6	byte$iv	I
/*     */     //   388	28	7	$i$f$write	I
/*     */     //   385	31	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   385	31	6	byte$iv	I
/*     */     //   454	12	9	$i$f$rest	I
/*     */     //   451	15	8	this_$iv$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   447	30	7	$i$f$ensure	I
/*     */     //   444	33	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   444	33	6	bytesCount$iv	I
/*     */     //   494	28	7	$i$f$write	I
/*     */     //   491	31	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   491	31	6	byte$iv	I
/*     */     //   542	28	7	$i$f$write	I
/*     */     //   539	31	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   539	31	6	byte$iv	I
/*     */     //   587	28	7	$i$f$write	I
/*     */     //   584	31	5	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   584	31	6	byte$iv	I
/*     */     //   690	12	10	$i$f$rest	I
/*     */     //   687	15	9	this_$iv$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   683	30	8	$i$f$ensure	I
/*     */     //   680	33	6	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   680	33	7	bytesCount$iv	I
/*     */     //   723	28	8	$i$f$write	I
/*     */     //   720	31	6	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   720	31	7	byte$iv	I
/*     */     //   796	12	11	$i$f$rest	I
/*     */     //   793	15	10	this_$iv$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   789	30	9	$i$f$ensure	I
/*     */     //   786	33	7	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   786	33	8	bytesCount$iv	I
/*     */     //   836	28	9	$i$f$write	I
/*     */     //   833	31	7	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   833	31	8	byte$iv	I
/*     */     //   884	28	9	$i$f$write	I
/*     */     //   881	31	7	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   881	31	8	byte$iv	I
/*     */     //   932	28	9	$i$f$write	I
/*     */     //   929	31	7	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   929	31	8	byte$iv	I
/*     */     //   977	28	9	$i$f$write	I
/*     */     //   974	31	7	this_$iv	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   974	31	8	byte$iv	I
/*     */     //   780	229	6	codePoint	I
/*     */     //   641	369	5	low	I
/*     */     //   105	905	4	c	I
/*     */     //   95	919	3	i	I
/*     */     //   0	1014	0	this	Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;
/*     */     //   0	1014	1	string	[C
/*     */     //   0	1014	2	count	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void writeUtf8CodePoint(int codePoint) {
/*     */     JsonToJavaStreamWriter jsonToJavaStreamWriter1 = this;
/*     */     int n = 1, i5 = 0;
/* 321 */     JsonToJavaStreamWriter jsonToJavaStreamWriter3 = jsonToJavaStreamWriter1; int $i$f$rest = 0;
/* 322 */     if (jsonToJavaStreamWriter3.buffer.length - jsonToJavaStreamWriter3.indexInBuffer < n)
/* 323 */       jsonToJavaStreamWriter1.flush(); 
/*     */     JsonToJavaStreamWriter this_$iv = this;
/*     */     int $i$f$write = 0;
/* 326 */     i5 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i5 + 1; this_$iv.buffer[i5] = (byte)codePoint; this_$iv = this; int m = 2;
/*     */     i5 = 0;
/* 328 */     jsonToJavaStreamWriter3 = this_$iv; $i$f$rest = 0;
/* 329 */     if (jsonToJavaStreamWriter3.buffer.length - jsonToJavaStreamWriter3.indexInBuffer < m)
/* 330 */       this_$iv.flush(); 
/*     */     this_$iv = this;
/*     */     int k = codePoint >> 6 | 0xC0, i4 = 0;
/* 333 */     int i8 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i8 + 1; this_$iv.buffer[i8] = (byte)k; this_$iv = this; k = codePoint & 0x3F | 0x80;
/*     */     i4 = 0;
/* 335 */     i8 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i8 + 1; this_$iv.buffer[i8] = (byte)k; this_$iv = this;
/*     */     int j = 1, i3 = 0;
/* 337 */     JsonToJavaStreamWriter jsonToJavaStreamWriter2 = this_$iv; $i$f$rest = 0;
/* 338 */     if (jsonToJavaStreamWriter2.buffer.length - jsonToJavaStreamWriter2.indexInBuffer < j)
/* 339 */       this_$iv.flush(); 
/*     */     this_$iv = this;
/*     */     int i = 63, i2 = 0;
/* 342 */     int i7 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i7 + 1; this_$iv.buffer[i7] = (byte)i; this_$iv = this;
/*     */     int bytesCount$iv = 3, $i$f$ensure = 0;
/* 344 */     JsonToJavaStreamWriter this_$iv$iv = this_$iv; $i$f$rest = 0;
/* 345 */     if (this_$iv$iv.buffer.length - this_$iv$iv.indexInBuffer < bytesCount$iv)
/* 346 */       this_$iv.flush(); 
/*     */     this_$iv = this;
/*     */     int byte$iv = codePoint >> 12 | 0xE0, i1 = 0;
/* 349 */     int i6 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i6 + 1; this_$iv.buffer[i6] = (byte)byte$iv; this_$iv = this; byte$iv = codePoint >> 6 & 0x3F | 0x80;
/*     */     i1 = 0;
/* 351 */     i6 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i6 + 1; this_$iv.buffer[i6] = (byte)byte$iv; this_$iv = this; byte$iv = codePoint & 0x3F | 0x80;
/*     */     i1 = 0;
/* 353 */     i6 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i6 + 1; this_$iv.buffer[i6] = (byte)byte$iv; if (codePoint <= 1114111) {
/*     */       this_$iv = this; int i10 = 4, i12 = 0;
/* 355 */       JsonToJavaStreamWriter jsonToJavaStreamWriter = this_$iv; $i$f$rest = 0;
/* 356 */       if (jsonToJavaStreamWriter.buffer.length - jsonToJavaStreamWriter.indexInBuffer < i10)
/* 357 */         this_$iv.flush(); 
/*     */       this_$iv = this;
/*     */       int i9 = codePoint >> 18 | 0xF0, i11 = 0;
/* 360 */       int i13 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i13 + 1; this_$iv.buffer[i13] = (byte)i9; this_$iv = this; i9 = codePoint >> 12 & 0x3F | 0x80;
/*     */       i11 = 0;
/* 362 */       i13 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i13 + 1; this_$iv.buffer[i13] = (byte)i9; this_$iv = this; i9 = codePoint >> 6 & 0x3F | 0x80;
/*     */       i11 = 0;
/* 364 */       i13 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i13 + 1; this_$iv.buffer[i13] = (byte)i9; this_$iv = this; i9 = codePoint & 0x3F | 0x80;
/*     */       i11 = 0;
/* 366 */       i13 = this_$iv.indexInBuffer; this_$iv.indexInBuffer = i13 + 1; this_$iv.buffer[i13] = (byte)i9;
/*     */     } else {
/*     */       throw new JsonEncodingException("Unexpected code point: " + codePoint);
/*     */     } 
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonToJavaStreamWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */