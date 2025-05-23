/*     */ package kotlinx.serialization.json.internal;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\r\032\0020\016H\002J\036\020\r\032\0020\016*\016\022\004\022\0020\020\022\004\022\0020\0160\017H@¢\006\002\020\021J\027\020\022\032\0020\0232\f\020\024\032\b\022\004\022\0020\0160\025H\bJ\b\020\026\032\0020\016H\002J\020\020\027\032\0020\0302\006\020\031\032\0020\tH\002J\006\020\032\032\0020\016J\b\020\033\032\0020\016H\002R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\tX\004¢\006\002\n\000R\016\020\013\032\0020\fX\016¢\006\002\n\000¨\006\034"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/AbstractJsonLexer;)V", "isLenient", "", "trailingCommaAllowed", "stackDepth", "", "readObject", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readObjectImpl", "Lkotlinx/serialization/json/JsonObject;", "reader", "Lkotlin/Function0;", "readArray", "readValue", "Lkotlinx/serialization/json/JsonPrimitive;", "isString", "read", "readDeepRecursive", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n517#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
/*     */ public final class JsonTreeReader {
/*     */   @NotNull
/*     */   private final AbstractJsonLexer lexer;
/*     */   private final boolean isLenient;
/*     */   
/*     */   public JsonTreeReader(@NotNull JsonConfiguration configuration, @NotNull AbstractJsonLexer lexer) {
/*  13 */     this.lexer = lexer;
/*     */     
/*  15 */     this.isLenient = configuration.isLenient();
/*  16 */     this.trailingCommaAllowed = configuration.getAllowTrailingComma();
/*     */   } private final boolean trailingCommaAllowed; private int stackDepth;
/*     */   private final JsonElement readObject() {
/*  19 */     JsonTreeReader this_$iv = this; int $i$f$readObjectImpl = 0;
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
/* 122 */     byte lastToken$iv = this_$iv.lexer.consumeNextToken((byte)6);
/* 123 */     if (this_$iv.lexer.peekNextToken() == 4) { AbstractJsonLexer.fail$default(this_$iv.lexer, "Unexpected leading comma", 0, null, 6, null); throw new KotlinNothingValueException(); }
/* 124 */      LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>();
/* 125 */     while (this_$iv.lexer.canConsumeValue()) {
/*     */       
/* 127 */       String key$iv = this_$iv.isLenient ? this_$iv.lexer.consumeStringLenient() : this_$iv.lexer.consumeString();
/* 128 */       this_$iv.lexer.consumeNextToken((byte)5);
/* 129 */       int $i$a$-readObjectImpl-JsonTreeReader$readObject$1 = 0; JsonElement element$iv = read();
/* 130 */       result$iv.put(key$iv, element$iv);
/*     */       
/* 132 */       lastToken$iv = this_$iv.lexer.consumeNextToken();
/* 133 */       byte b = lastToken$iv;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     if (lastToken$iv == 6) {
/* 141 */       this_$iv.lexer.consumeNextToken((byte)7);
/* 142 */     } else if (lastToken$iv == 4) {
/* 143 */       if (!this_$iv.trailingCommaAllowed) { JsonExceptionsKt.invalidTrailingComma$default(this_$iv.lexer, null, 1, null); throw new KotlinNothingValueException(); }
/* 144 */        this_$iv.lexer.consumeNextToken((byte)7);
/*     */     } 
/* 146 */     return (JsonElement)new JsonObject(result$iv);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object readObject(DeepRecursiveScope $this$readObject, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof kotlinx/serialization/json/internal/JsonTreeReader$readObject$2
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast kotlinx/serialization/json/internal/JsonTreeReader$readObject$2
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #11
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new kotlinx/serialization/json/internal/JsonTreeReader$readObject$2
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lkotlinx/serialization/json/internal/JsonTreeReader;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 445, 0 -> 88, 1 -> 250
/*     */     //   88: aload #10
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: astore_3
/*     */     //   95: iconst_0
/*     */     //   96: istore #4
/*     */     //   98: aload_3
/*     */     //   99: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   102: bipush #6
/*     */     //   104: invokevirtual consumeNextToken : (B)B
/*     */     //   107: istore #5
/*     */     //   109: aload_3
/*     */     //   110: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   113: invokevirtual peekNextToken : ()B
/*     */     //   116: iconst_4
/*     */     //   117: if_icmpne -> 143
/*     */     //   120: aload_3
/*     */     //   121: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   124: ldc 'Unexpected leading comma'
/*     */     //   126: iconst_0
/*     */     //   127: aconst_null
/*     */     //   128: bipush #6
/*     */     //   130: aconst_null
/*     */     //   131: invokestatic fail$default : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   134: pop
/*     */     //   135: new kotlin/KotlinNothingValueException
/*     */     //   138: dup
/*     */     //   139: invokespecial <init> : ()V
/*     */     //   142: athrow
/*     */     //   143: new java/util/LinkedHashMap
/*     */     //   146: dup
/*     */     //   147: invokespecial <init> : ()V
/*     */     //   150: astore #6
/*     */     //   152: aload_3
/*     */     //   153: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   156: invokevirtual canConsumeValue : ()Z
/*     */     //   159: ifeq -> 370
/*     */     //   162: aload_3
/*     */     //   163: getfield isLenient : Z
/*     */     //   166: ifeq -> 179
/*     */     //   169: aload_3
/*     */     //   170: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   173: invokevirtual consumeStringLenient : ()Ljava/lang/String;
/*     */     //   176: goto -> 186
/*     */     //   179: aload_3
/*     */     //   180: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   183: invokevirtual consumeString : ()Ljava/lang/String;
/*     */     //   186: astore #7
/*     */     //   188: aload_3
/*     */     //   189: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   192: iconst_5
/*     */     //   193: invokevirtual consumeNextToken : (B)B
/*     */     //   196: pop
/*     */     //   197: iconst_0
/*     */     //   198: istore #8
/*     */     //   200: aload_1
/*     */     //   201: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   204: aload #11
/*     */     //   206: aload #11
/*     */     //   208: aload_1
/*     */     //   209: putfield L$0 : Ljava/lang/Object;
/*     */     //   212: aload #11
/*     */     //   214: aload_3
/*     */     //   215: putfield L$1 : Ljava/lang/Object;
/*     */     //   218: aload #11
/*     */     //   220: aload #6
/*     */     //   222: putfield L$2 : Ljava/lang/Object;
/*     */     //   225: aload #11
/*     */     //   227: aload #7
/*     */     //   229: putfield L$3 : Ljava/lang/Object;
/*     */     //   232: aload #11
/*     */     //   234: iconst_1
/*     */     //   235: putfield label : I
/*     */     //   238: invokevirtual callRecursive : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   241: dup
/*     */     //   242: aload #12
/*     */     //   244: if_acmpne -> 301
/*     */     //   247: aload #12
/*     */     //   249: areturn
/*     */     //   250: iconst_0
/*     */     //   251: istore #4
/*     */     //   253: iconst_0
/*     */     //   254: istore #8
/*     */     //   256: aload #11
/*     */     //   258: getfield L$3 : Ljava/lang/Object;
/*     */     //   261: checkcast java/lang/String
/*     */     //   264: astore #7
/*     */     //   266: aload #11
/*     */     //   268: getfield L$2 : Ljava/lang/Object;
/*     */     //   271: checkcast java/util/LinkedHashMap
/*     */     //   274: astore #6
/*     */     //   276: aload #11
/*     */     //   278: getfield L$1 : Ljava/lang/Object;
/*     */     //   281: checkcast kotlinx/serialization/json/internal/JsonTreeReader
/*     */     //   284: astore_3
/*     */     //   285: aload #11
/*     */     //   287: getfield L$0 : Ljava/lang/Object;
/*     */     //   290: checkcast kotlin/DeepRecursiveScope
/*     */     //   293: astore_1
/*     */     //   294: aload #10
/*     */     //   296: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   299: aload #10
/*     */     //   301: checkcast kotlinx/serialization/json/JsonElement
/*     */     //   304: astore #8
/*     */     //   306: aload #6
/*     */     //   308: checkcast java/util/Map
/*     */     //   311: aload #7
/*     */     //   313: aload #8
/*     */     //   315: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   320: pop
/*     */     //   321: aload_3
/*     */     //   322: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   325: invokevirtual consumeNextToken : ()B
/*     */     //   328: istore #5
/*     */     //   330: iload #5
/*     */     //   332: istore #9
/*     */     //   334: iload #9
/*     */     //   336: iconst_4
/*     */     //   337: if_icmpeq -> 152
/*     */     //   340: iload #9
/*     */     //   342: bipush #7
/*     */     //   344: if_icmpeq -> 370
/*     */     //   347: aload_3
/*     */     //   348: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   351: ldc 'Expected end of the object or comma'
/*     */     //   353: iconst_0
/*     */     //   354: aconst_null
/*     */     //   355: bipush #6
/*     */     //   357: aconst_null
/*     */     //   358: invokestatic fail$default : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   361: pop
/*     */     //   362: new kotlin/KotlinNothingValueException
/*     */     //   365: dup
/*     */     //   366: invokespecial <init> : ()V
/*     */     //   369: athrow
/*     */     //   370: iload #5
/*     */     //   372: bipush #6
/*     */     //   374: if_icmpne -> 390
/*     */     //   377: aload_3
/*     */     //   378: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   381: bipush #7
/*     */     //   383: invokevirtual consumeNextToken : (B)B
/*     */     //   386: pop
/*     */     //   387: goto -> 432
/*     */     //   390: iload #5
/*     */     //   392: iconst_4
/*     */     //   393: if_icmpne -> 432
/*     */     //   396: aload_3
/*     */     //   397: getfield trailingCommaAllowed : Z
/*     */     //   400: ifne -> 422
/*     */     //   403: aload_3
/*     */     //   404: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   407: aconst_null
/*     */     //   408: iconst_1
/*     */     //   409: aconst_null
/*     */     //   410: invokestatic invalidTrailingComma$default : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   413: pop
/*     */     //   414: new kotlin/KotlinNothingValueException
/*     */     //   417: dup
/*     */     //   418: invokespecial <init> : ()V
/*     */     //   421: athrow
/*     */     //   422: aload_3
/*     */     //   423: getfield lexer : Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   426: bipush #7
/*     */     //   428: invokevirtual consumeNextToken : (B)B
/*     */     //   431: pop
/*     */     //   432: new kotlinx/serialization/json/JsonObject
/*     */     //   435: dup
/*     */     //   436: aload #6
/*     */     //   438: checkcast java/util/Map
/*     */     //   441: invokespecial <init> : (Ljava/util/Map;)V
/*     */     //   444: areturn
/*     */     //   445: new java/lang/IllegalStateException
/*     */     //   448: dup
/*     */     //   449: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   451: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   454: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #23	-> 60
/*     */     //   #24	-> 93
/*     */     //   #147	-> 98
/*     */     //   #148	-> 109
/*     */     //   #149	-> 143
/*     */     //   #149	-> 150
/*     */     //   #150	-> 152
/*     */     //   #152	-> 162
/*     */     //   #153	-> 188
/*     */     //   #154	-> 197
/*     */     //   #24	-> 200
/*     */     //   #23	-> 247
/*     */     //   #24	-> 301
/*     */     //   #154	-> 304
/*     */     //   #155	-> 306
/*     */     //   #157	-> 321
/*     */     //   #158	-> 330
/*     */     //   #159	-> 334
/*     */     //   #160	-> 340
/*     */     //   #161	-> 347
/*     */     //   #165	-> 370
/*     */     //   #166	-> 377
/*     */     //   #167	-> 390
/*     */     //   #168	-> 396
/*     */     //   #169	-> 422
/*     */     //   #171	-> 432
/*     */     //   #24	-> 444
/*     */     //   #23	-> 445
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	2	0	this	Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */     //   93	50	1	$this$readObject	Lkotlin/DeepRecursiveScope;
/*     */     //   143	107	1	$this$readObject	Lkotlin/DeepRecursiveScope;
/*     */     //   294	10	1	$this$readObject	Lkotlin/DeepRecursiveScope;
/*     */     //   304	36	1	$this$readObject	Lkotlin/DeepRecursiveScope;
/*     */     //   95	48	3	this_$iv	Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */     //   143	107	3	this_$iv	Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */     //   285	19	3	this_$iv	Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */     //   304	66	3	this_$iv	Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */     //   370	20	3	this_$iv	Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */     //   390	32	3	this_$iv	Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */     //   422	10	3	this_$iv	Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */     //   109	34	5	lastToken$iv	B
/*     */     //   143	19	5	lastToken$iv	B
/*     */     //   330	17	5	lastToken$iv	B
/*     */     //   370	7	5	lastToken$iv	B
/*     */     //   390	6	5	lastToken$iv	B
/*     */     //   152	98	6	result$iv	Ljava/util/LinkedHashMap;
/*     */     //   276	28	6	result$iv	Ljava/util/LinkedHashMap;
/*     */     //   304	43	6	result$iv	Ljava/util/LinkedHashMap;
/*     */     //   370	52	6	result$iv	Ljava/util/LinkedHashMap;
/*     */     //   422	22	6	result$iv	Ljava/util/LinkedHashMap;
/*     */     //   188	62	7	key$iv	Ljava/lang/String;
/*     */     //   266	104	7	key$iv	Ljava/lang/String;
/*     */     //   306	64	8	element$iv	Lkotlinx/serialization/json/JsonElement;
/*     */     //   200	50	8	$i$a$-readObjectImpl-JsonTreeReader$readObject$3	I
/*     */     //   98	152	4	$i$f$readObjectImpl	I
/*     */     //   0	455	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	395	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	388	10	$result	Ljava/lang/Object;
/*     */     //   256	48	8	$i$a$-readObjectImpl-JsonTreeReader$readObject$3	I
/*     */     //   253	191	4	$i$f$readObjectImpl	I
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final JsonElement readArray() {
/*     */     byte lastToken = this.lexer.consumeNextToken();
/*     */     if (this.lexer.peekNextToken() == 4) {
/*     */       AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     ArrayList<JsonElement> result = new ArrayList();
/*     */     while (this.lexer.canConsumeValue()) {
/*     */       JsonElement element = read();
/*     */       result.add(element);
/*     */       lastToken = this.lexer.consumeNextToken();
/*     */       if (lastToken != 4) {
/*     */         AbstractJsonLexer abstractJsonLexer = this.lexer;
/*     */         boolean condition$iv = (lastToken == 9);
/* 172 */         int position$iv = abstractJsonLexer.currentPosition, $i$f$require$kotlinx_serialization_json = 0;
/* 173 */         if (!condition$iv) { AbstractJsonLexer abstractJsonLexer1 = abstractJsonLexer; int $i$a$-require$kotlinx_serialization_json$default-JsonTreeReader$readArray$1 = 0; AbstractJsonLexer.fail$default(abstractJsonLexer1, "Expected end of the array or comma", position$iv, null, 4, null); throw new KotlinNothingValueException(); }
/*     */       
/*     */       } 
/*     */     } 
/*     */     if (lastToken == 8) {
/*     */       this.lexer.consumeNextToken((byte)9);
/*     */     } else if (lastToken == 4) {
/*     */       if (!this.trailingCommaAllowed) {
/*     */         JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       this.lexer.consumeNextToken((byte)9);
/*     */     } 
/*     */     return (JsonElement)new JsonArray(result);
/*     */   }
/*     */   
/*     */   private final JsonObject readObjectImpl(Function0 reader) {
/*     */     int $i$f$readObjectImpl = 0;
/*     */     byte lastToken = this.lexer.consumeNextToken((byte)6);
/*     */     if (this.lexer.peekNextToken() == 4) {
/*     */       AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     LinkedHashMap<Object, Object> result = new LinkedHashMap<>();
/*     */     while (this.lexer.canConsumeValue()) {
/*     */       String key = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
/*     */       this.lexer.consumeNextToken((byte)5);
/*     */       JsonElement element = (JsonElement)reader.invoke();
/*     */       result.put(key, element);
/*     */       lastToken = this.lexer.consumeNextToken();
/*     */       byte b = lastToken;
/*     */       if (b != 4) {
/*     */         if (b != 7) {
/*     */           AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
/*     */           throw new KotlinNothingValueException();
/*     */         } 
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     if (lastToken == 6) {
/*     */       this.lexer.consumeNextToken((byte)7);
/*     */     } else if (lastToken == 4) {
/*     */       if (!this.trailingCommaAllowed) {
/*     */         JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       this.lexer.consumeNextToken((byte)7);
/*     */     } 
/*     */     return new JsonObject(result);
/*     */   }
/*     */   
/*     */   private final JsonPrimitive readValue(boolean isString) {
/*     */     String string = (this.isLenient || !isString) ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
/*     */     if (!isString && Intrinsics.areEqual(string, "null"))
/*     */       return (JsonPrimitive)JsonNull.INSTANCE; 
/*     */     return (JsonPrimitive)new JsonLiteral(string, isString, null, 4, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final JsonElement read() {
/*     */     byte token = this.lexer.peekNextToken();
/*     */     this.stackDepth++;
/*     */     JsonElement result = (this.stackDepth == 200) ? readDeepRecursive() : readObject();
/*     */     this.stackDepth--;
/*     */     if (token == 8) {
/*     */     
/*     */     } else {
/*     */       AbstractJsonLexer.fail$default(this.lexer, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(token), 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     return (token == 1) ? (JsonElement)readValue(true) : ((token == 0) ? (JsonElement)readValue(false) : ((token == 6) ? result : (JsonElement)"JD-Core does not support Kotlin"));
/*     */   }
/*     */   
/*     */   private final JsonElement readDeepRecursive() {
/*     */     return (JsonElement)DeepRecursiveKt.invoke(new DeepRecursiveFunction(new JsonTreeReader$readDeepRecursive$1(null)), Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JsonTreeReader.kt", l = {115}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\020\000\032\0020\001*\016\022\004\022\0020\003\022\004\022\0020\0010\0022\006\020\004\032\0020\003H\n"}, d2 = {"<anonymous>", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "it"})
/*     */   static final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {
/*     */     int label;
/*     */     
/*     */     JsonTreeReader$readDeepRecursive$1(Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #4
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 178, 0 -> 32, 1 -> 124
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlin/DeepRecursiveScope
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield this$0 : Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */       //   48: invokestatic access$getLexer$p : (Lkotlinx/serialization/json/internal/JsonTreeReader;)Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */       //   51: invokevirtual peekNextToken : ()B
/*     */       //   54: istore_3
/*     */       //   55: iload_3
/*     */       //   56: iconst_1
/*     */       //   57: if_icmpne -> 74
/*     */       //   60: aload_0
/*     */       //   61: getfield this$0 : Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */       //   64: iconst_1
/*     */       //   65: invokestatic access$readValue : (Lkotlinx/serialization/json/internal/JsonTreeReader;Z)Lkotlinx/serialization/json/JsonPrimitive;
/*     */       //   68: checkcast kotlinx/serialization/json/JsonElement
/*     */       //   71: goto -> 177
/*     */       //   74: iload_3
/*     */       //   75: ifne -> 92
/*     */       //   78: aload_0
/*     */       //   79: getfield this$0 : Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */       //   82: iconst_0
/*     */       //   83: invokestatic access$readValue : (Lkotlinx/serialization/json/internal/JsonTreeReader;Z)Lkotlinx/serialization/json/JsonPrimitive;
/*     */       //   86: checkcast kotlinx/serialization/json/JsonElement
/*     */       //   89: goto -> 177
/*     */       //   92: iload_3
/*     */       //   93: bipush #6
/*     */       //   95: if_icmpne -> 135
/*     */       //   98: aload_0
/*     */       //   99: getfield this$0 : Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */       //   102: aload_2
/*     */       //   103: aload_0
/*     */       //   104: checkcast kotlin/coroutines/Continuation
/*     */       //   107: aload_0
/*     */       //   108: iconst_1
/*     */       //   109: putfield label : I
/*     */       //   112: invokestatic access$readObject : (Lkotlinx/serialization/json/internal/JsonTreeReader;Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   115: dup
/*     */       //   116: aload #4
/*     */       //   118: if_acmpne -> 129
/*     */       //   121: aload #4
/*     */       //   123: areturn
/*     */       //   124: aload_1
/*     */       //   125: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   128: aload_1
/*     */       //   129: checkcast kotlinx/serialization/json/JsonElement
/*     */       //   132: goto -> 177
/*     */       //   135: iload_3
/*     */       //   136: bipush #8
/*     */       //   138: if_icmpne -> 151
/*     */       //   141: aload_0
/*     */       //   142: getfield this$0 : Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */       //   145: invokestatic access$readArray : (Lkotlinx/serialization/json/internal/JsonTreeReader;)Lkotlinx/serialization/json/JsonElement;
/*     */       //   148: goto -> 177
/*     */       //   151: aload_0
/*     */       //   152: getfield this$0 : Lkotlinx/serialization/json/internal/JsonTreeReader;
/*     */       //   155: invokestatic access$getLexer$p : (Lkotlinx/serialization/json/internal/JsonTreeReader;)Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */       //   158: ldc 'Can't begin reading element, unexpected token'
/*     */       //   160: iconst_0
/*     */       //   161: aconst_null
/*     */       //   162: bipush #6
/*     */       //   164: aconst_null
/*     */       //   165: invokestatic fail$default : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;
/*     */       //   168: pop
/*     */       //   169: new kotlin/KotlinNothingValueException
/*     */       //   172: dup
/*     */       //   173: invokespecial <init> : ()V
/*     */       //   176: athrow
/*     */       //   177: areturn
/*     */       //   178: new java/lang/IllegalStateException
/*     */       //   181: dup
/*     */       //   182: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   184: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   187: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #111	-> 3
/*     */       //   #112	-> 44
/*     */       //   #113	-> 55
/*     */       //   #114	-> 74
/*     */       //   #115	-> 92
/*     */       //   #111	-> 121
/*     */       //   #115	-> 129
/*     */       //   #116	-> 135
/*     */       //   #117	-> 151
/*     */       //   #118	-> 177
/*     */       //   #111	-> 178
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	30	2	$this$DeepRecursiveFunction	Lkotlin/DeepRecursiveScope;
/*     */       //   74	18	2	$this$DeepRecursiveFunction	Lkotlin/DeepRecursiveScope;
/*     */       //   92	23	2	$this$DeepRecursiveFunction	Lkotlin/DeepRecursiveScope;
/*     */       //   0	188	0	this	Lkotlinx/serialization/json/internal/JsonTreeReader$readDeepRecursive$1;
/*     */       //   36	142	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Object invoke(DeepRecursiveScope p1, Unit p2, Continuation<? super JsonTreeReader$readDeepRecursive$1> p3) {
/*     */       JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(p3);
/*     */       jsonTreeReader$readDeepRecursive$1.L$0 = p1;
/*     */       return jsonTreeReader$readDeepRecursive$1.invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JsonTreeReader.kt", l = {24}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, m = "readObject", c = "kotlinx.serialization.json.internal.JsonTreeReader")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JsonTreeReader$readObject$2 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     JsonTreeReader$readObject$2(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JsonTreeReader.this.readObject(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonTreeReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */