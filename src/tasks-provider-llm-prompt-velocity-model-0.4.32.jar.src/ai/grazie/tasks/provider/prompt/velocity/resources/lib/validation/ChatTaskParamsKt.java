/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib.validation;@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\016\n\002\b\002\n\002\020\"\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\030\002\n\000\032\030\020\n\032\0020\013*\0020\0132\f\020\f\032\b\022\004\022\0020\0160\r\032\032\020\017\032\0020\020*\0020\0212\f\020\f\032\b\022\004\022\0020\0160\rH\002\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\024\020\003\032\b\022\004\022\0020\0010\004X\004¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\001XT¢\006\002\n\000\"\016\020\b\032\0020\001XT¢\006\002\n\000\"\016\020\t\032\0020\001XT¢\006\002\n\000¨\006\022"}, d2 = {"HISTORY_PROP", "", "FUNCTIONS_PROP", "REQUIRED_CHAT_TASK_PARAMS", "", "PROPERTIES_FIELD", "REQUIRED_FIELD", "TYPE_FIELD", "ITEMS_FIELD", "REF_FIELD", "validate", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/ChatTaskSchema;", "errorContext", "Lkotlin/Function0;", "", "verifyFunctionsProperty", "", "Lcom/fasterxml/jackson/databind/JsonNode;", "tasks-provider-llm-prompt-velocity-model"})
/*    */ @SourceDebugExtension({"SMAP\nchatTaskParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 chatTaskParams.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt\n+ 2 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n17#2,2:53\n29#2:55\n12#2,2:58\n29#2:60\n15#2:62\n17#2,2:64\n29#2:66\n12#2,2:68\n29#2:70\n15#2:72\n12#2,2:73\n29#2:75\n15#2:77\n17#2,2:78\n29#2:80\n17#2,2:82\n29#2:84\n12#2,2:86\n29#2:88\n15#2:90\n12#2,2:91\n29#2:93\n15#2:95\n1#3:56\n1#3:61\n1#3:67\n1#3:71\n1#3:76\n1#3:81\n1#3:85\n1#3:89\n1#3:94\n1863#4:57\n1864#4:63\n*S KotlinDebug\n*F\n+ 1 chatTaskParams.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt\n*L\n18#1:53,2\n18#1:55\n20#1:58,2\n20#1:60\n20#1:62\n26#1:64,2\n26#1:66\n28#1:68,2\n28#1:70\n28#1:72\n37#1:73,2\n37#1:75\n37#1:77\n39#1:78,2\n39#1:80\n40#1:82,2\n40#1:84\n41#1:86,2\n41#1:88\n41#1:90\n50#1:91,2\n50#1:93\n50#1:95\n18#1:56\n20#1:61\n26#1:67\n28#1:71\n37#1:76\n39#1:81\n40#1:85\n41#1:89\n50#1:94\n19#1:57\n19#1:63\n*E\n"})
/*    */ public final class ChatTaskParamsKt { @NotNull
/*    */   private static final String HISTORY_PROP = "history";
/*    */   @NotNull
/*    */   private static final String FUNCTIONS_PROP = "functions";
/*    */   
/*    */   static {
/*  9 */     String[] arrayOfString = new String[2]; arrayOfString[0] = "history"; arrayOfString[1] = "functions"; REQUIRED_CHAT_TASK_PARAMS = SetsKt.setOf((Object[])arrayOfString);
/*    */   }
/*    */   @NotNull
/*    */   private static final Set<String> REQUIRED_CHAT_TASK_PARAMS; @NotNull
/*    */   private static final String PROPERTIES_FIELD = "properties"; @NotNull
/*    */   private static final String REQUIRED_FIELD = "required"; @NotNull
/*    */   private static final String TYPE_FIELD = "type";
/*    */   @NotNull
/*    */   private static final String ITEMS_FIELD = "items";
/*    */   @NotNull
/*    */   private static final String REF_FIELD = "$ref";
/*    */   
/*    */   @NotNull
/*    */   public static final ChatTaskSchema validate(@NotNull ChatTaskSchema $this$validate, @NotNull Function0 errorContext) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'errorContext'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_0
/*    */     //   13: invokevirtual getTaskSchema : ()Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   16: ldc 'properties'
/*    */     //   18: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   21: dup
/*    */     //   22: ifnonnull -> 105
/*    */     //   25: pop
/*    */     //   26: aconst_null
/*    */     //   27: astore #4
/*    */     //   29: iconst_0
/*    */     //   30: istore #5
/*    */     //   32: iconst_0
/*    */     //   33: istore #6
/*    */     //   35: aload_1
/*    */     //   36: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   41: dup
/*    */     //   42: ifnull -> 78
/*    */     //   45: astore #7
/*    */     //   47: iconst_0
/*    */     //   48: istore #8
/*    */     //   50: aload #7
/*    */     //   52: astore #16
/*    */     //   54: iconst_0
/*    */     //   55: istore #9
/*    */     //   57: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt.REQUIRED_CHAT_TASK_PARAMS : Ljava/util/Set;
/*    */     //   60: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
/*    */     //   65: aload #16
/*    */     //   67: swap
/*    */     //   68: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   73: nop
/*    */     //   74: dup
/*    */     //   75: ifnonnull -> 91
/*    */     //   78: pop
/*    */     //   79: iconst_0
/*    */     //   80: istore #9
/*    */     //   82: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt.REQUIRED_CHAT_TASK_PARAMS : Ljava/util/Set;
/*    */     //   85: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
/*    */     //   90: nop
/*    */     //   91: aload #4
/*    */     //   93: invokestatic velocityLibraryException : (Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Void;
/*    */     //   96: pop
/*    */     //   97: new kotlin/KotlinNothingValueException
/*    */     //   100: dup
/*    */     //   101: invokespecial <init> : ()V
/*    */     //   104: athrow
/*    */     //   105: astore_2
/*    */     //   106: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt.REQUIRED_CHAT_TASK_PARAMS : Ljava/util/Set;
/*    */     //   109: checkcast java/lang/Iterable
/*    */     //   112: astore_3
/*    */     //   113: iconst_0
/*    */     //   114: istore #4
/*    */     //   116: aload_3
/*    */     //   117: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   122: astore #5
/*    */     //   124: aload #5
/*    */     //   126: invokeinterface hasNext : ()Z
/*    */     //   131: ifeq -> 281
/*    */     //   134: aload #5
/*    */     //   136: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   141: astore #6
/*    */     //   143: aload #6
/*    */     //   145: checkcast java/lang/String
/*    */     //   148: astore #7
/*    */     //   150: iconst_0
/*    */     //   151: istore #8
/*    */     //   153: aload_2
/*    */     //   154: aload #7
/*    */     //   156: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   159: ifnull -> 166
/*    */     //   162: iconst_1
/*    */     //   163: goto -> 167
/*    */     //   166: iconst_0
/*    */     //   167: istore #9
/*    */     //   169: iconst_0
/*    */     //   170: istore #10
/*    */     //   172: iload #9
/*    */     //   174: ifne -> 249
/*    */     //   177: iconst_0
/*    */     //   178: istore #11
/*    */     //   180: aload_1
/*    */     //   181: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   186: dup
/*    */     //   187: ifnull -> 222
/*    */     //   190: astore #12
/*    */     //   192: iconst_0
/*    */     //   193: istore #13
/*    */     //   195: aload #12
/*    */     //   197: astore #14
/*    */     //   199: iconst_0
/*    */     //   200: istore #15
/*    */     //   202: aload #7
/*    */     //   204: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   209: aload #14
/*    */     //   211: swap
/*    */     //   212: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   217: nop
/*    */     //   218: dup
/*    */     //   219: ifnonnull -> 234
/*    */     //   222: pop
/*    */     //   223: iconst_0
/*    */     //   224: istore #15
/*    */     //   226: aload #7
/*    */     //   228: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   233: nop
/*    */     //   234: aconst_null
/*    */     //   235: iconst_2
/*    */     //   236: aconst_null
/*    */     //   237: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*    */     //   240: pop
/*    */     //   241: new kotlin/KotlinNothingValueException
/*    */     //   244: dup
/*    */     //   245: invokespecial <init> : ()V
/*    */     //   248: athrow
/*    */     //   249: nop
/*    */     //   250: aload #7
/*    */     //   252: ldc 'functions'
/*    */     //   254: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   257: ifeq -> 276
/*    */     //   260: aload_2
/*    */     //   261: aload #7
/*    */     //   263: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   266: dup
/*    */     //   267: ldc 'get(...)'
/*    */     //   269: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   272: aload_1
/*    */     //   273: invokestatic verifyFunctionsProperty : (Lcom/fasterxml/jackson/databind/JsonNode;Lkotlin/jvm/functions/Function0;)V
/*    */     //   276: nop
/*    */     //   277: nop
/*    */     //   278: goto -> 124
/*    */     //   281: nop
/*    */     //   282: aload_0
/*    */     //   283: invokevirtual getTaskSchema : ()Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   286: ldc 'required'
/*    */     //   288: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   291: dup
/*    */     //   292: ifnonnull -> 375
/*    */     //   295: pop
/*    */     //   296: aconst_null
/*    */     //   297: astore #5
/*    */     //   299: iconst_0
/*    */     //   300: istore #6
/*    */     //   302: iconst_0
/*    */     //   303: istore #7
/*    */     //   305: aload_1
/*    */     //   306: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   311: dup
/*    */     //   312: ifnull -> 348
/*    */     //   315: astore #8
/*    */     //   317: iconst_0
/*    */     //   318: istore #9
/*    */     //   320: aload #8
/*    */     //   322: astore #16
/*    */     //   324: iconst_0
/*    */     //   325: istore #10
/*    */     //   327: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt.REQUIRED_CHAT_TASK_PARAMS : Ljava/util/Set;
/*    */     //   330: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
/*    */     //   335: aload #16
/*    */     //   337: swap
/*    */     //   338: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   343: nop
/*    */     //   344: dup
/*    */     //   345: ifnonnull -> 361
/*    */     //   348: pop
/*    */     //   349: iconst_0
/*    */     //   350: istore #10
/*    */     //   352: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt.REQUIRED_CHAT_TASK_PARAMS : Ljava/util/Set;
/*    */     //   355: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
/*    */     //   360: nop
/*    */     //   361: aload #5
/*    */     //   363: invokestatic velocityLibraryException : (Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Void;
/*    */     //   366: pop
/*    */     //   367: new kotlin/KotlinNothingValueException
/*    */     //   370: dup
/*    */     //   371: invokespecial <init> : ()V
/*    */     //   374: athrow
/*    */     //   375: astore_3
/*    */     //   376: aload_3
/*    */     //   377: invokevirtual elements : ()Ljava/util/Iterator;
/*    */     //   380: dup
/*    */     //   381: ldc 'elements(...)'
/*    */     //   383: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   386: invokestatic asSequence : (Ljava/util/Iterator;)Lkotlin/sequences/Sequence;
/*    */     //   389: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   394: invokestatic map : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*    */     //   397: invokestatic toSet : (Lkotlin/sequences/Sequence;)Ljava/util/Set;
/*    */     //   400: astore #4
/*    */     //   402: aload #4
/*    */     //   404: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt.REQUIRED_CHAT_TASK_PARAMS : Ljava/util/Set;
/*    */     //   407: checkcast java/util/Collection
/*    */     //   410: invokeinterface containsAll : (Ljava/util/Collection;)Z
/*    */     //   415: istore #5
/*    */     //   417: iconst_0
/*    */     //   418: istore #6
/*    */     //   420: iload #5
/*    */     //   422: ifne -> 515
/*    */     //   425: iconst_0
/*    */     //   426: istore #7
/*    */     //   428: aload_1
/*    */     //   429: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   434: dup
/*    */     //   435: ifnull -> 479
/*    */     //   438: astore #8
/*    */     //   440: iconst_0
/*    */     //   441: istore #9
/*    */     //   443: aload #8
/*    */     //   445: astore #16
/*    */     //   447: iconst_0
/*    */     //   448: istore #10
/*    */     //   450: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt.REQUIRED_CHAT_TASK_PARAMS : Ljava/util/Set;
/*    */     //   453: aload #4
/*    */     //   455: checkcast java/lang/Iterable
/*    */     //   458: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
/*    */     //   461: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
/*    */     //   466: aload #16
/*    */     //   468: swap
/*    */     //   469: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   474: nop
/*    */     //   475: dup
/*    */     //   476: ifnonnull -> 500
/*    */     //   479: pop
/*    */     //   480: iconst_0
/*    */     //   481: istore #10
/*    */     //   483: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/ChatTaskParamsKt.REQUIRED_CHAT_TASK_PARAMS : Ljava/util/Set;
/*    */     //   486: aload #4
/*    */     //   488: checkcast java/lang/Iterable
/*    */     //   491: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
/*    */     //   494: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
/*    */     //   499: nop
/*    */     //   500: aconst_null
/*    */     //   501: iconst_2
/*    */     //   502: aconst_null
/*    */     //   503: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*    */     //   506: pop
/*    */     //   507: new kotlin/KotlinNothingValueException
/*    */     //   510: dup
/*    */     //   511: invokespecial <init> : ()V
/*    */     //   514: athrow
/*    */     //   515: nop
/*    */     //   516: aload_0
/*    */     //   517: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 12
/*    */     //   #53	-> 26
/*    */     //   #54	-> 32
/*    */     //   #55	-> 35
/*    */     //   #56	-> 47
/*    */     //   #55	-> 50
/*    */     //   #18	-> 57
/*    */     //   #55	-> 68
/*    */     //   #55	-> 73
/*    */     //   #55	-> 74
/*    */     //   #18	-> 82
/*    */     //   #55	-> 90
/*    */     //   #54	-> 91
/*    */     //   #19	-> 106
/*    */     //   #57	-> 116
/*    */     //   #20	-> 153
/*    */     //   #58	-> 172
/*    */     //   #59	-> 177
/*    */     //   #60	-> 180
/*    */     //   #61	-> 192
/*    */     //   #60	-> 195
/*    */     //   #20	-> 202
/*    */     //   #60	-> 212
/*    */     //   #60	-> 217
/*    */     //   #60	-> 218
/*    */     //   #20	-> 226
/*    */     //   #60	-> 233
/*    */     //   #59	-> 234
/*    */     //   #62	-> 249
/*    */     //   #21	-> 250
/*    */     //   #22	-> 260
/*    */     //   #24	-> 276
/*    */     //   #57	-> 277
/*    */     //   #63	-> 281
/*    */     //   #26	-> 282
/*    */     //   #64	-> 296
/*    */     //   #65	-> 302
/*    */     //   #66	-> 305
/*    */     //   #67	-> 317
/*    */     //   #66	-> 320
/*    */     //   #26	-> 327
/*    */     //   #66	-> 338
/*    */     //   #66	-> 343
/*    */     //   #66	-> 344
/*    */     //   #26	-> 352
/*    */     //   #66	-> 360
/*    */     //   #65	-> 361
/*    */     //   #27	-> 376
/*    */     //   #28	-> 402
/*    */     //   #68	-> 420
/*    */     //   #69	-> 425
/*    */     //   #70	-> 428
/*    */     //   #71	-> 440
/*    */     //   #70	-> 443
/*    */     //   #28	-> 450
/*    */     //   #70	-> 469
/*    */     //   #70	-> 474
/*    */     //   #70	-> 475
/*    */     //   #28	-> 483
/*    */     //   #70	-> 499
/*    */     //   #69	-> 500
/*    */     //   #72	-> 515
/*    */     //   #30	-> 516
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   57	8	9	$i$a$-velocityLibraryException$default-ChatTaskParamsKt$validate$props$1	I
/*    */     //   82	8	9	$i$a$-velocityLibraryException$default-ChatTaskParamsKt$validate$props$1	I
/*    */     //   50	23	8	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   47	26	7	it$iv$iv	Ljava/lang/Object;
/*    */     //   35	56	6	$i$f$buildMessage	I
/*    */     //   32	73	5	$i$f$velocityLibraryException	I
/*    */     //   29	76	4	cause$iv	Ljava/lang/Throwable;
/*    */     //   202	7	15	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$validate$1$1	I
/*    */     //   226	7	15	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$validate$1$1	I
/*    */     //   195	22	13	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   192	25	12	it$iv$iv	Ljava/lang/Object;
/*    */     //   180	54	11	$i$f$buildMessage	I
/*    */     //   172	78	10	$i$f$checkOrVelocityLibraryException	I
/*    */     //   169	81	9	condition$iv	Z
/*    */     //   153	124	8	$i$a$-forEach-ChatTaskParamsKt$validate$1	I
/*    */     //   150	127	7	it	Ljava/lang/String;
/*    */     //   143	135	6	element$iv	Ljava/lang/Object;
/*    */     //   116	166	4	$i$f$forEach	I
/*    */     //   113	169	3	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   327	8	10	$i$a$-velocityLibraryException$default-ChatTaskParamsKt$validate$required$1	I
/*    */     //   352	8	10	$i$a$-velocityLibraryException$default-ChatTaskParamsKt$validate$required$1	I
/*    */     //   320	23	9	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   317	26	8	it$iv$iv	Ljava/lang/Object;
/*    */     //   305	56	7	$i$f$buildMessage	I
/*    */     //   302	73	6	$i$f$velocityLibraryException	I
/*    */     //   299	76	5	cause$iv	Ljava/lang/Throwable;
/*    */     //   450	16	10	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$validate$2	I
/*    */     //   483	16	10	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$validate$2	I
/*    */     //   443	31	9	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   440	34	8	it$iv$iv	Ljava/lang/Object;
/*    */     //   428	72	7	$i$f$buildMessage	I
/*    */     //   420	96	6	$i$f$checkOrVelocityLibraryException	I
/*    */     //   417	99	5	condition$iv	Z
/*    */     //   106	412	2	props	Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   376	142	3	required	Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   402	116	4	requiredFields	Ljava/util/Set;
/*    */     //   0	518	0	$this$validate	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/ChatTaskSchema;
/*    */     //   0	518	1	errorContext	Lkotlin/jvm/functions/Function0;
/*    */   }
/*    */   
/*    */   private static final String validate$lambda$4(JsonNode it) {
/* 27 */     return it.textValue();
/*    */   }
/*    */   
/*    */   private static final void verifyFunctionsProperty(JsonNode $this$verifyFunctionsProperty, Function0 errorContext) {
/*    */     // Byte code:
/*    */     //   0: iconst_0
/*    */     //   1: istore_2
/*    */     //   2: aload_0
/*    */     //   3: ldc 'type'
/*    */     //   5: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   8: dup
/*    */     //   9: ifnull -> 388
/*    */     //   12: astore #5
/*    */     //   14: iconst_0
/*    */     //   15: istore #6
/*    */     //   17: aload #5
/*    */     //   19: invokevirtual getNodeType : ()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*    */     //   22: getstatic com/fasterxml/jackson/databind/node/JsonNodeType.STRING : Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*    */     //   25: if_acmpne -> 45
/*    */     //   28: aload #5
/*    */     //   30: invokevirtual textValue : ()Ljava/lang/String;
/*    */     //   33: ldc 'array'
/*    */     //   35: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   38: ifeq -> 45
/*    */     //   41: iconst_1
/*    */     //   42: goto -> 46
/*    */     //   45: iconst_0
/*    */     //   46: istore #7
/*    */     //   48: iconst_0
/*    */     //   49: istore #8
/*    */     //   51: iload #7
/*    */     //   53: ifne -> 118
/*    */     //   56: iconst_0
/*    */     //   57: istore #9
/*    */     //   59: aload_1
/*    */     //   60: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   65: dup
/*    */     //   66: ifnull -> 96
/*    */     //   69: astore #10
/*    */     //   71: iconst_0
/*    */     //   72: istore #11
/*    */     //   74: aload #10
/*    */     //   76: astore #12
/*    */     //   78: iconst_0
/*    */     //   79: istore #13
/*    */     //   81: ldc 'properties.functions.type: 'array' expected'
/*    */     //   83: aload #12
/*    */     //   85: swap
/*    */     //   86: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   91: nop
/*    */     //   92: dup
/*    */     //   93: ifnonnull -> 103
/*    */     //   96: pop
/*    */     //   97: iconst_0
/*    */     //   98: istore #13
/*    */     //   100: ldc 'properties.functions.type: 'array' expected'
/*    */     //   102: nop
/*    */     //   103: aconst_null
/*    */     //   104: iconst_2
/*    */     //   105: aconst_null
/*    */     //   106: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*    */     //   109: pop
/*    */     //   110: new kotlin/KotlinNothingValueException
/*    */     //   113: dup
/*    */     //   114: invokespecial <init> : ()V
/*    */     //   117: athrow
/*    */     //   118: nop
/*    */     //   119: aload_0
/*    */     //   120: ldc 'items'
/*    */     //   122: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   125: dup
/*    */     //   126: ifnonnull -> 197
/*    */     //   129: pop
/*    */     //   130: aconst_null
/*    */     //   131: astore #9
/*    */     //   133: iconst_0
/*    */     //   134: istore #10
/*    */     //   136: iconst_0
/*    */     //   137: istore #11
/*    */     //   139: aload_1
/*    */     //   140: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   145: dup
/*    */     //   146: ifnull -> 176
/*    */     //   149: astore #13
/*    */     //   151: iconst_0
/*    */     //   152: istore #14
/*    */     //   154: aload #13
/*    */     //   156: astore #12
/*    */     //   158: iconst_0
/*    */     //   159: istore #15
/*    */     //   161: ldc 'properties.functions: missing items declaration'
/*    */     //   163: aload #12
/*    */     //   165: swap
/*    */     //   166: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   171: nop
/*    */     //   172: dup
/*    */     //   173: ifnonnull -> 183
/*    */     //   176: pop
/*    */     //   177: iconst_0
/*    */     //   178: istore #15
/*    */     //   180: ldc 'properties.functions: missing items declaration'
/*    */     //   182: nop
/*    */     //   183: aload #9
/*    */     //   185: invokestatic velocityLibraryException : (Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Void;
/*    */     //   188: pop
/*    */     //   189: new kotlin/KotlinNothingValueException
/*    */     //   192: dup
/*    */     //   193: invokespecial <init> : ()V
/*    */     //   196: athrow
/*    */     //   197: astore #7
/*    */     //   199: aload #7
/*    */     //   201: ldc 'type'
/*    */     //   203: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   206: dup
/*    */     //   207: ifnonnull -> 278
/*    */     //   210: pop
/*    */     //   211: aconst_null
/*    */     //   212: astore #10
/*    */     //   214: iconst_0
/*    */     //   215: istore #11
/*    */     //   217: iconst_0
/*    */     //   218: istore #13
/*    */     //   220: aload_1
/*    */     //   221: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   226: dup
/*    */     //   227: ifnull -> 257
/*    */     //   230: astore #14
/*    */     //   232: iconst_0
/*    */     //   233: istore #15
/*    */     //   235: aload #14
/*    */     //   237: astore #12
/*    */     //   239: iconst_0
/*    */     //   240: istore #16
/*    */     //   242: ldc 'properties.functions.items: should be of plain string type'
/*    */     //   244: aload #12
/*    */     //   246: swap
/*    */     //   247: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   252: nop
/*    */     //   253: dup
/*    */     //   254: ifnonnull -> 264
/*    */     //   257: pop
/*    */     //   258: iconst_0
/*    */     //   259: istore #16
/*    */     //   261: ldc 'properties.functions.items: should be of plain string type'
/*    */     //   263: nop
/*    */     //   264: aload #10
/*    */     //   266: invokestatic velocityLibraryException : (Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Void;
/*    */     //   269: pop
/*    */     //   270: new kotlin/KotlinNothingValueException
/*    */     //   273: dup
/*    */     //   274: invokespecial <init> : ()V
/*    */     //   277: athrow
/*    */     //   278: astore #8
/*    */     //   280: aload #8
/*    */     //   282: invokevirtual getNodeType : ()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*    */     //   285: getstatic com/fasterxml/jackson/databind/node/JsonNodeType.STRING : Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*    */     //   288: if_acmpne -> 308
/*    */     //   291: aload #8
/*    */     //   293: invokevirtual textValue : ()Ljava/lang/String;
/*    */     //   296: ldc 'string'
/*    */     //   298: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   301: ifeq -> 308
/*    */     //   304: iconst_1
/*    */     //   305: goto -> 309
/*    */     //   308: iconst_0
/*    */     //   309: istore #9
/*    */     //   311: iconst_0
/*    */     //   312: istore #10
/*    */     //   314: iload #9
/*    */     //   316: ifne -> 381
/*    */     //   319: iconst_0
/*    */     //   320: istore #11
/*    */     //   322: aload_1
/*    */     //   323: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   328: dup
/*    */     //   329: ifnull -> 359
/*    */     //   332: astore #13
/*    */     //   334: iconst_0
/*    */     //   335: istore #14
/*    */     //   337: aload #13
/*    */     //   339: astore #12
/*    */     //   341: iconst_0
/*    */     //   342: istore #15
/*    */     //   344: ldc 'properties.functions.items.type: 'string' expected'
/*    */     //   346: aload #12
/*    */     //   348: swap
/*    */     //   349: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   354: nop
/*    */     //   355: dup
/*    */     //   356: ifnonnull -> 366
/*    */     //   359: pop
/*    */     //   360: iconst_0
/*    */     //   361: istore #15
/*    */     //   363: ldc 'properties.functions.items.type: 'string' expected'
/*    */     //   365: nop
/*    */     //   366: aconst_null
/*    */     //   367: iconst_2
/*    */     //   368: aconst_null
/*    */     //   369: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*    */     //   372: pop
/*    */     //   373: new kotlin/KotlinNothingValueException
/*    */     //   376: dup
/*    */     //   377: invokespecial <init> : ()V
/*    */     //   380: athrow
/*    */     //   381: nop
/*    */     //   382: iconst_1
/*    */     //   383: istore_2
/*    */     //   384: nop
/*    */     //   385: goto -> 390
/*    */     //   388: pop
/*    */     //   389: nop
/*    */     //   390: aload_0
/*    */     //   391: ldc '$ref'
/*    */     //   393: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   396: dup
/*    */     //   397: ifnull -> 410
/*    */     //   400: pop
/*    */     //   401: iconst_0
/*    */     //   402: istore #6
/*    */     //   404: iconst_1
/*    */     //   405: istore_2
/*    */     //   406: nop
/*    */     //   407: goto -> 412
/*    */     //   410: pop
/*    */     //   411: nop
/*    */     //   412: iload_2
/*    */     //   413: istore_3
/*    */     //   414: iconst_0
/*    */     //   415: istore #4
/*    */     //   417: iload_3
/*    */     //   418: ifne -> 483
/*    */     //   421: iconst_0
/*    */     //   422: istore #5
/*    */     //   424: aload_1
/*    */     //   425: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   430: dup
/*    */     //   431: ifnull -> 461
/*    */     //   434: astore #6
/*    */     //   436: iconst_0
/*    */     //   437: istore #7
/*    */     //   439: aload #6
/*    */     //   441: astore #17
/*    */     //   443: iconst_0
/*    */     //   444: istore #8
/*    */     //   446: ldc 'properties.functions: should be a reference or explicit array of string '
/*    */     //   448: aload #17
/*    */     //   450: swap
/*    */     //   451: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   456: nop
/*    */     //   457: dup
/*    */     //   458: ifnonnull -> 468
/*    */     //   461: pop
/*    */     //   462: iconst_0
/*    */     //   463: istore #8
/*    */     //   465: ldc 'properties.functions: should be a reference or explicit array of string '
/*    */     //   467: nop
/*    */     //   468: aconst_null
/*    */     //   469: iconst_2
/*    */     //   470: aconst_null
/*    */     //   471: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*    */     //   474: pop
/*    */     //   475: new kotlin/KotlinNothingValueException
/*    */     //   478: dup
/*    */     //   479: invokespecial <init> : ()V
/*    */     //   482: athrow
/*    */     //   483: nop
/*    */     //   484: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #36	-> 2
/*    */     //   #37	-> 17
/*    */     //   #73	-> 51
/*    */     //   #74	-> 56
/*    */     //   #75	-> 59
/*    */     //   #76	-> 71
/*    */     //   #75	-> 74
/*    */     //   #37	-> 81
/*    */     //   #75	-> 86
/*    */     //   #75	-> 91
/*    */     //   #75	-> 92
/*    */     //   #37	-> 100
/*    */     //   #75	-> 102
/*    */     //   #74	-> 103
/*    */     //   #77	-> 118
/*    */     //   #39	-> 119
/*    */     //   #78	-> 130
/*    */     //   #79	-> 136
/*    */     //   #80	-> 139
/*    */     //   #81	-> 151
/*    */     //   #80	-> 154
/*    */     //   #39	-> 161
/*    */     //   #80	-> 166
/*    */     //   #80	-> 171
/*    */     //   #80	-> 172
/*    */     //   #39	-> 180
/*    */     //   #80	-> 182
/*    */     //   #79	-> 183
/*    */     //   #40	-> 199
/*    */     //   #82	-> 211
/*    */     //   #83	-> 217
/*    */     //   #84	-> 220
/*    */     //   #85	-> 232
/*    */     //   #84	-> 235
/*    */     //   #40	-> 242
/*    */     //   #84	-> 247
/*    */     //   #84	-> 252
/*    */     //   #84	-> 253
/*    */     //   #40	-> 261
/*    */     //   #84	-> 263
/*    */     //   #83	-> 264
/*    */     //   #41	-> 280
/*    */     //   #86	-> 314
/*    */     //   #87	-> 319
/*    */     //   #88	-> 322
/*    */     //   #89	-> 334
/*    */     //   #88	-> 337
/*    */     //   #41	-> 344
/*    */     //   #88	-> 349
/*    */     //   #88	-> 354
/*    */     //   #88	-> 355
/*    */     //   #41	-> 363
/*    */     //   #88	-> 365
/*    */     //   #87	-> 366
/*    */     //   #90	-> 381
/*    */     //   #43	-> 382
/*    */     //   #44	-> 384
/*    */     //   #36	-> 385
/*    */     //   #36	-> 388
/*    */     //   #46	-> 390
/*    */     //   #47	-> 404
/*    */     //   #48	-> 406
/*    */     //   #46	-> 407
/*    */     //   #46	-> 410
/*    */     //   #50	-> 412
/*    */     //   #91	-> 417
/*    */     //   #92	-> 421
/*    */     //   #93	-> 424
/*    */     //   #94	-> 436
/*    */     //   #93	-> 439
/*    */     //   #50	-> 446
/*    */     //   #93	-> 451
/*    */     //   #93	-> 456
/*    */     //   #93	-> 457
/*    */     //   #50	-> 465
/*    */     //   #93	-> 467
/*    */     //   #92	-> 468
/*    */     //   #95	-> 483
/*    */     //   #51	-> 484
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   81	2	13	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$verifyFunctionsProperty$1$1	I
/*    */     //   100	2	13	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$verifyFunctionsProperty$1$1	I
/*    */     //   74	17	11	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   71	20	10	it$iv$iv	Ljava/lang/Object;
/*    */     //   59	44	9	$i$f$buildMessage	I
/*    */     //   51	68	8	$i$f$checkOrVelocityLibraryException	I
/*    */     //   48	71	7	condition$iv	Z
/*    */     //   161	2	15	$i$a$-velocityLibraryException$default-ChatTaskParamsKt$verifyFunctionsProperty$1$items$1	I
/*    */     //   180	2	15	$i$a$-velocityLibraryException$default-ChatTaskParamsKt$verifyFunctionsProperty$1$items$1	I
/*    */     //   154	17	14	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   151	20	13	it$iv$iv	Ljava/lang/Object;
/*    */     //   139	44	11	$i$f$buildMessage	I
/*    */     //   136	61	10	$i$f$velocityLibraryException	I
/*    */     //   133	64	9	cause$iv	Ljava/lang/Throwable;
/*    */     //   242	2	16	$i$a$-velocityLibraryException$default-ChatTaskParamsKt$verifyFunctionsProperty$1$itemsType$1	I
/*    */     //   261	2	16	$i$a$-velocityLibraryException$default-ChatTaskParamsKt$verifyFunctionsProperty$1$itemsType$1	I
/*    */     //   235	17	15	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   232	20	14	it$iv$iv	Ljava/lang/Object;
/*    */     //   220	44	13	$i$f$buildMessage	I
/*    */     //   217	61	11	$i$f$velocityLibraryException	I
/*    */     //   214	64	10	cause$iv	Ljava/lang/Throwable;
/*    */     //   344	2	15	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$verifyFunctionsProperty$1$2	I
/*    */     //   363	2	15	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$verifyFunctionsProperty$1$2	I
/*    */     //   337	17	14	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   334	20	13	it$iv$iv	Ljava/lang/Object;
/*    */     //   322	44	11	$i$f$buildMessage	I
/*    */     //   314	68	10	$i$f$checkOrVelocityLibraryException	I
/*    */     //   311	71	9	condition$iv	Z
/*    */     //   17	368	6	$i$a$-let-ChatTaskParamsKt$verifyFunctionsProperty$1	I
/*    */     //   199	186	7	items	Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   280	105	8	itemsType	Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   14	371	5	typeField	Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   404	3	6	$i$a$-let-ChatTaskParamsKt$verifyFunctionsProperty$2	I
/*    */     //   446	2	8	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$verifyFunctionsProperty$3	I
/*    */     //   465	2	8	$i$a$-checkOrVelocityLibraryException-ChatTaskParamsKt$verifyFunctionsProperty$3	I
/*    */     //   439	17	7	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*    */     //   436	20	6	it$iv$iv	Ljava/lang/Object;
/*    */     //   424	44	5	$i$f$buildMessage	I
/*    */     //   417	67	4	$i$f$checkOrVelocityLibraryException	I
/*    */     //   414	70	3	condition$iv	Z
/*    */     //   2	483	2	hasTypeOrRef	Z
/*    */     //   0	485	0	$this$verifyFunctionsProperty	Lcom/fasterxml/jackson/databind/JsonNode;
/*    */     //   0	485	1	errorContext	Lkotlin/jvm/functions/Function0;
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\validation\ChatTaskParamsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */