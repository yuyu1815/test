/*    */ package com.intellij.ml.llm.matterhorn.requests;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B5\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\016\b\002\020\t\032\b\022\004\022\0020\n0\005¢\006\004\b\013\020\fB!\b\026\022\006\020\002\032\0020\003\022\006\020\r\032\0020\003\022\006\020\007\032\0020\b¢\006\004\b\013\020\016J\026\020\017\032\0020\0202\006\020\021\032\0020\022H@¢\006\002\020\023R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\024\020\t\032\b\022\004\022\0020\n0\005X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "systemMessage", "", "messages", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "tools", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;)V", "userMessage", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)V", "execute", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ public final class SimpleRequest implements GrazieRequest {
/*    */   @NotNull
/*    */   private final String systemMessage;
/*    */   
/*    */   public SimpleRequest(@NotNull String systemMessage, @NotNull List<MatterhornChatElement> messages, @NotNull ModelParameters modelParameters, @NotNull List<MatterhornTool> tools) {
/*  7 */     this.systemMessage = systemMessage;
/*  8 */     this.messages = messages;
/*  9 */     this.modelParameters = modelParameters;
/* 10 */     this.tools = tools;
/*    */   }
/*    */   @NotNull
/*    */   private final List<MatterhornChatElement> messages; @NotNull
/*    */   private final ModelParameters modelParameters; @NotNull
/*    */   private final List<MatterhornTool> tools;
/*    */   public SimpleRequest(@NotNull String systemMessage, @NotNull String userMessage, @NotNull ModelParameters modelParameters) {
/* 17 */     this(systemMessage, CollectionsKt.listOf(new MatterhornChatMessage(userMessage, MatterhornChatMessageKind.User, null, null, 12, null)), modelParameters, null, 8, null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/requests/SimpleRequest$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/requests/SimpleRequest$execute$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 568, 0 -> 104, 1 -> 146, 2 -> 243, 3 -> 321, 4 -> 436, 5 -> 511
/*    */     //   104: aload #6
/*    */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   109: aload_1
/*    */     //   110: aload_0
/*    */     //   111: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   114: aload #7
/*    */     //   116: aload #7
/*    */     //   118: aload_0
/*    */     //   119: putfield L$0 : Ljava/lang/Object;
/*    */     //   122: aload #7
/*    */     //   124: aload_1
/*    */     //   125: putfield L$1 : Ljava/lang/Object;
/*    */     //   128: aload #7
/*    */     //   130: iconst_1
/*    */     //   131: putfield label : I
/*    */     //   134: invokevirtual logModelParameters : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   137: dup
/*    */     //   138: aload #8
/*    */     //   140: if_acmpne -> 171
/*    */     //   143: aload #8
/*    */     //   145: areturn
/*    */     //   146: aload #7
/*    */     //   148: getfield L$1 : Ljava/lang/Object;
/*    */     //   151: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   154: astore_1
/*    */     //   155: aload #7
/*    */     //   157: getfield L$0 : Ljava/lang/Object;
/*    */     //   160: checkcast com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   163: astore_0
/*    */     //   164: aload #6
/*    */     //   166: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   169: aload #6
/*    */     //   171: pop
/*    */     //   172: aload_0
/*    */     //   173: getfield systemMessage : Ljava/lang/String;
/*    */     //   176: iconst_2
/*    */     //   177: newarray char
/*    */     //   179: astore #4
/*    */     //   181: aload #4
/*    */     //   183: iconst_0
/*    */     //   184: bipush #10
/*    */     //   186: castore
/*    */     //   187: aload #4
/*    */     //   189: iconst_1
/*    */     //   190: bipush #32
/*    */     //   192: castore
/*    */     //   193: aload #4
/*    */     //   195: invokestatic trimEnd : (Ljava/lang/String;[C)Ljava/lang/String;
/*    */     //   198: astore_3
/*    */     //   199: aload_1
/*    */     //   200: aload_3
/*    */     //   201: aload_0
/*    */     //   202: getfield tools : Ljava/util/List;
/*    */     //   205: aload #7
/*    */     //   207: aload #7
/*    */     //   209: aload_0
/*    */     //   210: putfield L$0 : Ljava/lang/Object;
/*    */     //   213: aload #7
/*    */     //   215: aload_1
/*    */     //   216: putfield L$1 : Ljava/lang/Object;
/*    */     //   219: aload #7
/*    */     //   221: aload_3
/*    */     //   222: putfield L$2 : Ljava/lang/Object;
/*    */     //   225: aload #7
/*    */     //   227: iconst_2
/*    */     //   228: putfield label : I
/*    */     //   231: invokevirtual logHeadMessage : (Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   234: dup
/*    */     //   235: aload #8
/*    */     //   237: if_acmpne -> 277
/*    */     //   240: aload #8
/*    */     //   242: areturn
/*    */     //   243: aload #7
/*    */     //   245: getfield L$2 : Ljava/lang/Object;
/*    */     //   248: checkcast java/lang/String
/*    */     //   251: astore_3
/*    */     //   252: aload #7
/*    */     //   254: getfield L$1 : Ljava/lang/Object;
/*    */     //   257: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   260: astore_1
/*    */     //   261: aload #7
/*    */     //   263: getfield L$0 : Ljava/lang/Object;
/*    */     //   266: checkcast com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   269: astore_0
/*    */     //   270: aload #6
/*    */     //   272: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   275: aload #6
/*    */     //   277: pop
/*    */     //   278: aload_1
/*    */     //   279: aload_0
/*    */     //   280: getfield messages : Ljava/util/List;
/*    */     //   283: aload #7
/*    */     //   285: aload #7
/*    */     //   287: aload_0
/*    */     //   288: putfield L$0 : Ljava/lang/Object;
/*    */     //   291: aload #7
/*    */     //   293: aload_1
/*    */     //   294: putfield L$1 : Ljava/lang/Object;
/*    */     //   297: aload #7
/*    */     //   299: aload_3
/*    */     //   300: putfield L$2 : Ljava/lang/Object;
/*    */     //   303: aload #7
/*    */     //   305: iconst_3
/*    */     //   306: putfield label : I
/*    */     //   309: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   312: dup
/*    */     //   313: aload #8
/*    */     //   315: if_acmpne -> 355
/*    */     //   318: aload #8
/*    */     //   320: areturn
/*    */     //   321: aload #7
/*    */     //   323: getfield L$2 : Ljava/lang/Object;
/*    */     //   326: checkcast java/lang/String
/*    */     //   329: astore_3
/*    */     //   330: aload #7
/*    */     //   332: getfield L$1 : Ljava/lang/Object;
/*    */     //   335: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   338: astore_1
/*    */     //   339: aload #7
/*    */     //   341: getfield L$0 : Ljava/lang/Object;
/*    */     //   344: checkcast com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   347: astore_0
/*    */     //   348: aload #6
/*    */     //   350: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   353: aload #6
/*    */     //   355: pop
/*    */     //   356: new com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   359: dup
/*    */     //   360: aload_3
/*    */     //   361: aload_0
/*    */     //   362: getfield messages : Ljava/util/List;
/*    */     //   365: checkcast java/lang/Iterable
/*    */     //   368: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   371: aload_0
/*    */     //   372: getfield tools : Ljava/util/List;
/*    */     //   375: checkcast java/lang/Iterable
/*    */     //   378: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   381: aconst_null
/*    */     //   382: aconst_null
/*    */     //   383: bipush #24
/*    */     //   385: aconst_null
/*    */     //   386: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   389: astore #4
/*    */     //   391: aload_1
/*    */     //   392: aload #4
/*    */     //   394: aload_0
/*    */     //   395: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   398: aload #7
/*    */     //   400: aload #7
/*    */     //   402: aload_0
/*    */     //   403: putfield L$0 : Ljava/lang/Object;
/*    */     //   406: aload #7
/*    */     //   408: aload_1
/*    */     //   409: putfield L$1 : Ljava/lang/Object;
/*    */     //   412: aload #7
/*    */     //   414: aconst_null
/*    */     //   415: putfield L$2 : Ljava/lang/Object;
/*    */     //   418: aload #7
/*    */     //   420: iconst_4
/*    */     //   421: putfield label : I
/*    */     //   424: invokevirtual sendToGrazie : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   427: dup
/*    */     //   428: aload #8
/*    */     //   430: if_acmpne -> 461
/*    */     //   433: aload #8
/*    */     //   435: areturn
/*    */     //   436: aload #7
/*    */     //   438: getfield L$1 : Ljava/lang/Object;
/*    */     //   441: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   444: astore_1
/*    */     //   445: aload #7
/*    */     //   447: getfield L$0 : Ljava/lang/Object;
/*    */     //   450: checkcast com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   453: astore_0
/*    */     //   454: aload #6
/*    */     //   456: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   459: aload #6
/*    */     //   461: checkcast java/util/List
/*    */     //   464: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   467: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   470: astore #5
/*    */     //   472: aload_1
/*    */     //   473: aload #5
/*    */     //   475: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   478: aload #7
/*    */     //   480: aload #7
/*    */     //   482: aload_0
/*    */     //   483: putfield L$0 : Ljava/lang/Object;
/*    */     //   486: aload #7
/*    */     //   488: aload #5
/*    */     //   490: putfield L$1 : Ljava/lang/Object;
/*    */     //   493: aload #7
/*    */     //   495: iconst_5
/*    */     //   496: putfield label : I
/*    */     //   499: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   502: dup
/*    */     //   503: aload #8
/*    */     //   505: if_acmpne -> 537
/*    */     //   508: aload #8
/*    */     //   510: areturn
/*    */     //   511: aload #7
/*    */     //   513: getfield L$1 : Ljava/lang/Object;
/*    */     //   516: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   519: astore #5
/*    */     //   521: aload #7
/*    */     //   523: getfield L$0 : Ljava/lang/Object;
/*    */     //   526: checkcast com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   529: astore_0
/*    */     //   530: aload #6
/*    */     //   532: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   535: aload #6
/*    */     //   537: pop
/*    */     //   538: new com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   541: dup
/*    */     //   542: aload_0
/*    */     //   543: getfield systemMessage : Ljava/lang/String;
/*    */     //   546: aload_0
/*    */     //   547: getfield messages : Ljava/util/List;
/*    */     //   550: checkcast java/util/Collection
/*    */     //   553: aload #5
/*    */     //   555: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;
/*    */     //   558: aconst_null
/*    */     //   559: aconst_null
/*    */     //   560: aconst_null
/*    */     //   561: bipush #28
/*    */     //   563: aconst_null
/*    */     //   564: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   567: areturn
/*    */     //   568: new java/lang/IllegalStateException
/*    */     //   571: dup
/*    */     //   572: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   574: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   577: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 60
/*    */     //   #20	-> 109
/*    */     //   #19	-> 143
/*    */     //   #22	-> 171
/*    */     //   #23	-> 199
/*    */     //   #19	-> 240
/*    */     //   #24	-> 277
/*    */     //   #19	-> 318
/*    */     //   #26	-> 355
/*    */     //   #27	-> 391
/*    */     //   #19	-> 433
/*    */     //   #27	-> 461
/*    */     //   #28	-> 472
/*    */     //   #19	-> 508
/*    */     //   #30	-> 537
/*    */     //   #19	-> 568
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   109	37	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   164	79	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   270	51	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   348	88	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   454	57	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   530	38	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   109	37	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   155	88	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   261	60	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   339	97	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   445	57	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   199	44	3	systemMsg	Ljava/lang/String;
/*    */     //   252	69	3	systemMsg	Ljava/lang/String;
/*    */     //   330	61	3	systemMsg	Ljava/lang/String;
/*    */     //   391	36	4	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   472	39	5	assistantMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   521	47	5	assistantMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   0	578	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	518	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	511	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SimpleRequest.kt", l = {20, 23, 24, 27, 28}, i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"}, n = {"this", "context", "this", "context", "systemMsg", "this", "context", "systemMsg", "this", "context", "this", "assistantMessage"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.SimpleRequest")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class SimpleRequest$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     SimpleRequest$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SimpleRequest.this.execute(null, (Continuation<? super MatterhornChat>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\SimpleRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */