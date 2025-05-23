/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\t\b\000\030\0002\0020\001B\001\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\003\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\016\b\002\020\n\032\b\022\004\022\0020\0130\003\022\006\020\f\032\0020\t\022\024\b\002\020\r\032\016\022\004\022\0020\017\022\004\022\0020\0200\016\022\006\020\021\032\0020\022\022\022\020\023\032\016\022\004\022\0020\025\022\004\022\0020\0260\024\022\006\020\027\032\0020\t\022\n\b\002\020\030\032\004\030\0010\031¢\006\004\b\032\020\033J*\020\034\032\b\022\004\022\0020\0360\0352\006\020\037\032\0020 2\f\020!\032\b\022\004\022\0020\0040\003H@¢\006\002\020\"J2\020#\032\0020$2\006\020\037\032\0020 2\f\020!\032\b\022\004\022\0020\0040\0032\f\020%\032\b\022\004\022\0020&0\003H@¢\006\002\020'J&\020(\032\0020)2\006\020*\032\0020)2\006\020\037\032\0020 2\006\020+\032\0020$H@¢\006\002\020,J!\020-\032\0020$*\0020$2\022\020.\032\016\022\004\022\0020\025\022\004\022\0020\0250\024H\bJ4\020/\032\016\022\004\022\0020\025\022\004\022\00201002\006\0202\032\0020\0252\006\0203\032\0020\0252\006\0204\032\0020\0252\006\0205\032\0020\025H\002J\034\0206\032\016\022\004\022\0020\025\022\004\022\00201002\006\0207\032\0020\025H\002J\026\0208\032\0020)2\006\020\037\032\0020 H@¢\006\002\0209R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\0130\003X\004¢\006\002\n\000R\016\020\f\032\0020\tX\004¢\006\002\n\000R\032\020\r\032\016\022\004\022\0020\017\022\004\022\0020\0200\016X\004¢\006\002\n\000R\016\020\021\032\0020\022X\004¢\006\002\n\000R\032\020\023\032\016\022\004\022\0020\025\022\004\022\0020\0260\024X\004¢\006\002\n\000R\016\020\027\032\0020\tX\004¢\006\002\n\000R\020\020\030\032\004\030\0010\031X\004¢\006\002\n\000¨\006:"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "system", "", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "user", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "maxRetries", "", "handlers", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler;", "reviewersCount", "toolsWithHandlers", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/MatterhornToolUsageHandler;", "toolChoice", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "completionCheck", "Lkotlin/Function1;", "", "", "maxCompletionRequests", "assistantAnswerFormat", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILjava/util/List;ILjava/util/Map;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Lkotlin/jvm/functions/Function1;ILcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;)V", "buildMessageParts", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "contents", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildUserMessage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "toolResults", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addChatMessage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "chat", "chatMessage", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformLastTextPartContent", "transform", "extractCodeFragment", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;", "text", "expectedPrefix", "expectedPostfix", "expectedFormat", "formatAnswer", "answerContent", "execute", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieRequestImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieRequestImpl.kt\ncom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,249:1\n79#1,7:260\n1557#2:250\n1628#2,3:251\n1246#2,4:256\n477#3:254\n423#3:255\n*S KotlinDebug\n*F\n+ 1 GrazieRequestImpl.kt\ncom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl\n*L\n159#1:260,7\n68#1:250\n68#1:251,3\n124#1:256,4\n124#1:254\n124#1:255\n*E\n"})
/*    */ public final class GrazieRequestImpl implements GrazieRequest { @NotNull
/*    */   private final List<GrazieRequest.Content> system; @NotNull
/*    */   private final List<GrazieRequest.Content> user; @NotNull
/*    */   private final ModelParameters modelParameters;
/*    */   private final int maxRetries;
/*    */   @NotNull
/*    */   private final List<AssistantMessageHandler> handlers;
/*    */   
/* 12 */   public GrazieRequestImpl(@NotNull List<GrazieRequest.Content> system, @NotNull List<GrazieRequest.Content> user, @NotNull ModelParameters modelParameters, int maxRetries, @NotNull List<AssistantMessageHandler> handlers, int reviewersCount, @NotNull Map<MatterhornTool, MatterhornToolUsageHandler> toolsWithHandlers, @NotNull MatterhornToolChoice toolChoice, @NotNull Function1<String, Boolean> completionCheck, int maxCompletionRequests, @Nullable AssistantAnswerFormat assistantAnswerFormat) { this.system = system;
/* 13 */     this.user = user;
/* 14 */     this.modelParameters = modelParameters;
/* 15 */     this.maxRetries = maxRetries;
/* 16 */     this.handlers = handlers;
/* 17 */     this.reviewersCount = reviewersCount;
/* 18 */     this.toolsWithHandlers = toolsWithHandlers;
/* 19 */     this.toolChoice = toolChoice;
/* 20 */     this.completionCheck = completionCheck;
/* 21 */     this.maxCompletionRequests = maxCompletionRequests;
/* 22 */     this.assistantAnswerFormat = assistantAnswerFormat; } private final int reviewersCount; @NotNull
/*    */   private final Map<MatterhornTool, MatterhornToolUsageHandler> toolsWithHandlers; @NotNull
/*    */   private final MatterhornToolChoice toolChoice; @NotNull
/*    */   private final Function1<String, Boolean> completionCheck; private final int maxCompletionRequests; @Nullable
/*    */   private final AssistantAnswerFormat assistantAnswerFormat; private final Object buildMessageParts(ExecutionContext context, List contents, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$buildMessageParts$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$buildMessageParts$1
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$buildMessageParts$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 423, 0 -> 88, 1 -> 206
/*    */     //   88: aload #11
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new java/util/ArrayList
/*    */     //   96: dup
/*    */     //   97: invokespecial <init> : ()V
/*    */     //   100: checkcast java/util/List
/*    */     //   103: astore #4
/*    */     //   105: new java/lang/StringBuilder
/*    */     //   108: dup
/*    */     //   109: invokespecial <init> : ()V
/*    */     //   112: astore #5
/*    */     //   114: aload_2
/*    */     //   115: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   120: astore #6
/*    */     //   122: aload #6
/*    */     //   124: invokeinterface hasNext : ()Z
/*    */     //   129: ifeq -> 413
/*    */     //   132: aload #6
/*    */     //   134: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   139: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content
/*    */     //   142: astore #7
/*    */     //   144: aload #7
/*    */     //   146: aload_1
/*    */     //   147: aload_0
/*    */     //   148: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   151: aload #12
/*    */     //   153: aload #12
/*    */     //   155: aload_0
/*    */     //   156: putfield L$0 : Ljava/lang/Object;
/*    */     //   159: aload #12
/*    */     //   161: aload_1
/*    */     //   162: putfield L$1 : Ljava/lang/Object;
/*    */     //   165: aload #12
/*    */     //   167: aload #4
/*    */     //   169: putfield L$2 : Ljava/lang/Object;
/*    */     //   172: aload #12
/*    */     //   174: aload #5
/*    */     //   176: putfield L$3 : Ljava/lang/Object;
/*    */     //   179: aload #12
/*    */     //   181: aload #6
/*    */     //   183: putfield L$4 : Ljava/lang/Object;
/*    */     //   186: aload #12
/*    */     //   188: iconst_1
/*    */     //   189: putfield label : I
/*    */     //   192: invokeinterface toChatMessagePart : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   197: dup
/*    */     //   198: aload #13
/*    */     //   200: if_acmpne -> 261
/*    */     //   203: aload #13
/*    */     //   205: areturn
/*    */     //   206: aload #12
/*    */     //   208: getfield L$4 : Ljava/lang/Object;
/*    */     //   211: checkcast java/util/Iterator
/*    */     //   214: astore #6
/*    */     //   216: aload #12
/*    */     //   218: getfield L$3 : Ljava/lang/Object;
/*    */     //   221: checkcast java/lang/StringBuilder
/*    */     //   224: astore #5
/*    */     //   226: aload #12
/*    */     //   228: getfield L$2 : Ljava/lang/Object;
/*    */     //   231: checkcast java/util/List
/*    */     //   234: astore #4
/*    */     //   236: aload #12
/*    */     //   238: getfield L$1 : Ljava/lang/Object;
/*    */     //   241: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   244: astore_1
/*    */     //   245: aload #12
/*    */     //   247: getfield L$0 : Ljava/lang/Object;
/*    */     //   250: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   253: astore_0
/*    */     //   254: aload #11
/*    */     //   256: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   259: aload #11
/*    */     //   261: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart
/*    */     //   264: dup
/*    */     //   265: ifnonnull -> 272
/*    */     //   268: pop
/*    */     //   269: goto -> 122
/*    */     //   272: astore #8
/*    */     //   274: aload #8
/*    */     //   276: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart
/*    */     //   279: ifeq -> 393
/*    */     //   282: aload #8
/*    */     //   284: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart
/*    */     //   287: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   290: iconst_2
/*    */     //   291: newarray char
/*    */     //   293: astore #10
/*    */     //   295: aload #10
/*    */     //   297: iconst_0
/*    */     //   298: bipush #10
/*    */     //   300: castore
/*    */     //   301: aload #10
/*    */     //   303: iconst_1
/*    */     //   304: bipush #32
/*    */     //   306: castore
/*    */     //   307: aload #10
/*    */     //   309: invokestatic trimEnd : (Ljava/lang/String;[C)Ljava/lang/String;
/*    */     //   312: astore #9
/*    */     //   314: aload #9
/*    */     //   316: checkcast java/lang/CharSequence
/*    */     //   319: invokeinterface length : ()I
/*    */     //   324: ifle -> 331
/*    */     //   327: iconst_1
/*    */     //   328: goto -> 332
/*    */     //   331: iconst_0
/*    */     //   332: ifeq -> 390
/*    */     //   335: aload #5
/*    */     //   337: checkcast java/lang/CharSequence
/*    */     //   340: invokeinterface length : ()I
/*    */     //   345: ifle -> 352
/*    */     //   348: iconst_1
/*    */     //   349: goto -> 353
/*    */     //   352: iconst_0
/*    */     //   353: ifeq -> 382
/*    */     //   356: nop
/*    */     //   357: aload #5
/*    */     //   359: bipush #10
/*    */     //   361: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   364: dup
/*    */     //   365: ldc 'append(...)'
/*    */     //   367: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   370: bipush #10
/*    */     //   372: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   375: dup
/*    */     //   376: ldc 'append(...)'
/*    */     //   378: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   381: pop
/*    */     //   382: aload #5
/*    */     //   384: aload #9
/*    */     //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   389: pop
/*    */     //   390: goto -> 122
/*    */     //   393: aload #5
/*    */     //   395: aload #4
/*    */     //   397: invokestatic buildMessageParts$flushTextPart : (Ljava/lang/StringBuilder;Ljava/util/List;)V
/*    */     //   400: aload #4
/*    */     //   402: aload #8
/*    */     //   404: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   409: pop
/*    */     //   410: goto -> 122
/*    */     //   413: aload #5
/*    */     //   415: aload #4
/*    */     //   417: invokestatic buildMessageParts$flushTextPart : (Ljava/lang/StringBuilder;Ljava/util/List;)V
/*    */     //   420: aload #4
/*    */     //   422: areturn
/*    */     //   423: new java/lang/IllegalStateException
/*    */     //   426: dup
/*    */     //   427: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   429: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   432: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 60
/*    */     //   #25	-> 93
/*    */     //   #25	-> 103
/*    */     //   #26	-> 105
/*    */     //   #35	-> 114
/*    */     //   #36	-> 144
/*    */     //   #24	-> 203
/*    */     //   #36	-> 261
/*    */     //   #38	-> 274
/*    */     //   #39	-> 282
/*    */     //   #40	-> 314
/*    */     //   #40	-> 332
/*    */     //   #41	-> 335
/*    */     //   #41	-> 353
/*    */     //   #42	-> 356
/*    */     //   #42	-> 357
/*    */     //   #43	-> 382
/*    */     //   #45	-> 390
/*    */     //   #47	-> 393
/*    */     //   #48	-> 400
/*    */     //   #50	-> 413
/*    */     //   #51	-> 420
/*    */     //   #24	-> 423
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	10	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   103	103	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   254	18	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   272	60	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   332	21	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   353	17	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   370	11	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   381	42	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   93	10	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   103	103	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   245	27	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   272	60	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   332	21	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   353	17	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   370	11	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   381	42	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   93	10	2	contents	Ljava/util/List;
/*    */     //   103	19	2	contents	Ljava/util/List;
/*    */     //   105	101	4	parts	Ljava/util/List;
/*    */     //   236	36	4	parts	Ljava/util/List;
/*    */     //   272	60	4	parts	Ljava/util/List;
/*    */     //   332	21	4	parts	Ljava/util/List;
/*    */     //   353	17	4	parts	Ljava/util/List;
/*    */     //   370	11	4	parts	Ljava/util/List;
/*    */     //   381	42	4	parts	Ljava/util/List;
/*    */     //   114	92	5	textPartBuilder	Ljava/lang/StringBuilder;
/*    */     //   226	46	5	textPartBuilder	Ljava/lang/StringBuilder;
/*    */     //   272	60	5	textPartBuilder	Ljava/lang/StringBuilder;
/*    */     //   332	21	5	textPartBuilder	Ljava/lang/StringBuilder;
/*    */     //   353	17	5	textPartBuilder	Ljava/lang/StringBuilder;
/*    */     //   370	11	5	textPartBuilder	Ljava/lang/StringBuilder;
/*    */     //   381	42	5	textPartBuilder	Ljava/lang/StringBuilder;
/*    */     //   144	53	7	content	Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;
/*    */     //   274	21	8	part	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;
/*    */     //   393	16	8	part	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;
/*    */     //   314	18	9	text	Ljava/lang/String;
/*    */     //   332	21	9	text	Ljava/lang/String;
/*    */     //   353	17	9	text	Ljava/lang/String;
/*    */     //   370	11	9	text	Ljava/lang/String;
/*    */     //   381	9	9	text	Ljava/lang/String;
/*    */     //   0	433	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	373	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	366	11	$result	Ljava/lang/Object;
/*    */   } private static final void buildMessageParts$flushTextPart(StringBuilder textPartBuilder, List<MatterhornChatMessageTextPart> parts) {
/* 29 */     if ((textPartBuilder.length() > 0)) {
/* 30 */       Intrinsics.checkNotNullExpressionValue(textPartBuilder.toString(), "toString(...)"); parts.add(new MatterhornChatMessageTextPart(textPartBuilder.toString()));
/* 31 */       StringsKt.clear(textPartBuilder);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Object buildUserMessage(ExecutionContext context, List contents, List toolResults, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$buildUserMessage$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$buildUserMessage$1
/*    */     //   13: astore #20
/*    */     //   15: aload #20
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #20
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$buildUserMessage$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #20
/*    */     //   53: aload #20
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #19
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #21
/*    */     //   65: aload #20
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 443, 0 -> 92, 1 -> 167
/*    */     //   92: aload #19
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_2
/*    */     //   98: invokeinterface isEmpty : ()Z
/*    */     //   103: ifeq -> 138
/*    */     //   106: aload_3
/*    */     //   107: checkcast java/util/Collection
/*    */     //   110: invokeinterface isEmpty : ()Z
/*    */     //   115: ifne -> 122
/*    */     //   118: iconst_1
/*    */     //   119: goto -> 123
/*    */     //   122: iconst_0
/*    */     //   123: ifeq -> 138
/*    */     //   126: new com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*    */     //   129: dup
/*    */     //   130: aload_3
/*    */     //   131: aconst_null
/*    */     //   132: iconst_2
/*    */     //   133: aconst_null
/*    */     //   134: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   137: areturn
/*    */     //   138: aload_0
/*    */     //   139: aload_1
/*    */     //   140: aload_2
/*    */     //   141: aload #20
/*    */     //   143: aload #20
/*    */     //   145: aload_3
/*    */     //   146: putfield L$0 : Ljava/lang/Object;
/*    */     //   149: aload #20
/*    */     //   151: iconst_1
/*    */     //   152: putfield label : I
/*    */     //   155: invokespecial buildMessageParts : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   158: dup
/*    */     //   159: aload #21
/*    */     //   161: if_acmpne -> 183
/*    */     //   164: aload #21
/*    */     //   166: areturn
/*    */     //   167: aload #20
/*    */     //   169: getfield L$0 : Ljava/lang/Object;
/*    */     //   172: checkcast java/util/List
/*    */     //   175: astore_3
/*    */     //   176: aload #19
/*    */     //   178: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   181: aload #19
/*    */     //   183: checkcast java/util/List
/*    */     //   186: astore #5
/*    */     //   188: aload #5
/*    */     //   190: invokestatic singleOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   193: astore #7
/*    */     //   195: aload #7
/*    */     //   197: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart
/*    */     //   200: ifeq -> 211
/*    */     //   203: aload #7
/*    */     //   205: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart
/*    */     //   208: goto -> 212
/*    */     //   211: aconst_null
/*    */     //   212: astore #6
/*    */     //   214: aload #6
/*    */     //   216: ifnull -> 282
/*    */     //   219: aload_3
/*    */     //   220: checkcast java/util/Collection
/*    */     //   223: invokeinterface isEmpty : ()Z
/*    */     //   228: ifne -> 235
/*    */     //   231: iconst_1
/*    */     //   232: goto -> 236
/*    */     //   235: iconst_0
/*    */     //   236: ifeq -> 258
/*    */     //   239: new com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*    */     //   242: dup
/*    */     //   243: aload_3
/*    */     //   244: aload #6
/*    */     //   246: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   249: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
/*    */     //   252: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   255: goto -> 281
/*    */     //   258: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   261: dup
/*    */     //   262: aload #6
/*    */     //   264: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   267: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */     //   270: aconst_null
/*    */     //   271: aconst_null
/*    */     //   272: bipush #12
/*    */     //   274: aconst_null
/*    */     //   275: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   278: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   281: areturn
/*    */     //   282: aload_3
/*    */     //   283: checkcast java/util/Collection
/*    */     //   286: invokeinterface isEmpty : ()Z
/*    */     //   291: ifne -> 298
/*    */     //   294: iconst_1
/*    */     //   295: goto -> 299
/*    */     //   298: iconst_0
/*    */     //   299: ifeq -> 430
/*    */     //   302: aload #5
/*    */     //   304: iconst_0
/*    */     //   305: aload_3
/*    */     //   306: checkcast java/lang/Iterable
/*    */     //   309: astore #7
/*    */     //   311: istore #17
/*    */     //   313: astore #16
/*    */     //   315: iconst_0
/*    */     //   316: istore #8
/*    */     //   318: aload #7
/*    */     //   320: astore #9
/*    */     //   322: new java/util/ArrayList
/*    */     //   325: dup
/*    */     //   326: aload #7
/*    */     //   328: bipush #10
/*    */     //   330: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   333: invokespecial <init> : (I)V
/*    */     //   336: checkcast java/util/Collection
/*    */     //   339: astore #10
/*    */     //   341: iconst_0
/*    */     //   342: istore #11
/*    */     //   344: aload #9
/*    */     //   346: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   351: astore #12
/*    */     //   353: aload #12
/*    */     //   355: invokeinterface hasNext : ()Z
/*    */     //   360: ifeq -> 407
/*    */     //   363: aload #12
/*    */     //   365: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   370: astore #13
/*    */     //   372: aload #10
/*    */     //   374: aload #13
/*    */     //   376: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolResult
/*    */     //   379: astore #14
/*    */     //   381: astore #18
/*    */     //   383: iconst_0
/*    */     //   384: istore #15
/*    */     //   386: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageToolResultPart
/*    */     //   389: dup
/*    */     //   390: aload #14
/*    */     //   392: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;)V
/*    */     //   395: aload #18
/*    */     //   397: swap
/*    */     //   398: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   403: pop
/*    */     //   404: goto -> 353
/*    */     //   407: aload #10
/*    */     //   409: checkcast java/util/List
/*    */     //   412: nop
/*    */     //   413: astore #18
/*    */     //   415: aload #16
/*    */     //   417: iload #17
/*    */     //   419: aload #18
/*    */     //   421: checkcast java/util/Collection
/*    */     //   424: invokeinterface addAll : (ILjava/util/Collection;)Z
/*    */     //   429: pop
/*    */     //   430: new com/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage
/*    */     //   433: dup
/*    */     //   434: aload #5
/*    */     //   436: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */     //   439: invokespecial <init> : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;)V
/*    */     //   442: areturn
/*    */     //   443: new java/lang/IllegalStateException
/*    */     //   446: dup
/*    */     //   447: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   449: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   452: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #54	-> 63
/*    */     //   #55	-> 97
/*    */     //   #55	-> 123
/*    */     //   #56	-> 126
/*    */     //   #58	-> 138
/*    */     //   #54	-> 164
/*    */     //   #59	-> 188
/*    */     //   #60	-> 214
/*    */     //   #61	-> 219
/*    */     //   #61	-> 236
/*    */     //   #62	-> 239
/*    */     //   #64	-> 258
/*    */     //   #61	-> 281
/*    */     //   #67	-> 282
/*    */     //   #67	-> 299
/*    */     //   #68	-> 302
/*    */     //   #250	-> 318
/*    */     //   #251	-> 344
/*    */     //   #252	-> 372
/*    */     //   #68	-> 386
/*    */     //   #252	-> 398
/*    */     //   #253	-> 407
/*    */     //   #250	-> 412
/*    */     //   #68	-> 424
/*    */     //   #70	-> 430
/*    */     //   #54	-> 443
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	26	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   123	3	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   138	20	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   97	26	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   123	3	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   138	20	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   97	26	2	contents	Ljava/util/List;
/*    */     //   123	3	2	contents	Ljava/util/List;
/*    */     //   138	20	2	contents	Ljava/util/List;
/*    */     //   97	26	3	toolResults	Ljava/util/List;
/*    */     //   123	15	3	toolResults	Ljava/util/List;
/*    */     //   138	29	3	toolResults	Ljava/util/List;
/*    */     //   176	60	3	toolResults	Ljava/util/List;
/*    */     //   236	22	3	toolResults	Ljava/util/List;
/*    */     //   282	17	3	toolResults	Ljava/util/List;
/*    */     //   299	16	3	toolResults	Ljava/util/List;
/*    */     //   188	31	5	parts	Ljava/util/List;
/*    */     //   282	17	5	parts	Ljava/util/List;
/*    */     //   299	96	5	parts	Ljava/util/List;
/*    */     //   395	18	5	parts	Ljava/util/List;
/*    */     //   413	30	5	parts	Ljava/util/List;
/*    */     //   214	22	6	singleTextPart	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart;
/*    */     //   236	22	6	singleTextPart	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart;
/*    */     //   258	23	6	singleTextPart	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart;
/*    */     //   315	26	7	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   341	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   341	68	10	destination$iv$iv	Ljava/util/Collection;
/*    */     //   372	32	13	item$iv$iv	Ljava/lang/Object;
/*    */     //   383	12	14	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;
/*    */     //   386	9	15	$i$a$-map-GrazieRequestImpl$buildUserMessage$2	I
/*    */     //   344	65	11	$i$f$mapTo	I
/*    */     //   318	95	8	$i$f$map	I
/*    */     //   0	453	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	390	20	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	383	19	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Object addChatMessage(MatterhornChat chat, ExecutionContext context, MatterhornChatElement chatMessage, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$addChatMessage$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$addChatMessage$1
/*    */     //   13: astore #6
/*    */     //   15: aload #6
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #6
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$addChatMessage$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #6
/*    */     //   53: aload #6
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #5
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #7
/*    */     //   65: aload #6
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 166, 0 -> 92, 1 -> 134
/*    */     //   92: aload #5
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_2
/*    */     //   98: aload_3
/*    */     //   99: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   102: aload #6
/*    */     //   104: aload #6
/*    */     //   106: aload_1
/*    */     //   107: putfield L$0 : Ljava/lang/Object;
/*    */     //   110: aload #6
/*    */     //   112: aload_3
/*    */     //   113: putfield L$1 : Ljava/lang/Object;
/*    */     //   116: aload #6
/*    */     //   118: iconst_1
/*    */     //   119: putfield label : I
/*    */     //   122: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   125: dup
/*    */     //   126: aload #7
/*    */     //   128: if_acmpne -> 159
/*    */     //   131: aload #7
/*    */     //   133: areturn
/*    */     //   134: aload #6
/*    */     //   136: getfield L$1 : Ljava/lang/Object;
/*    */     //   139: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   142: astore_3
/*    */     //   143: aload #6
/*    */     //   145: getfield L$0 : Ljava/lang/Object;
/*    */     //   148: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   151: astore_1
/*    */     //   152: aload #5
/*    */     //   154: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   157: aload #5
/*    */     //   159: pop
/*    */     //   160: aload_1
/*    */     //   161: aload_3
/*    */     //   162: invokevirtual withNewMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   165: areturn
/*    */     //   166: new java/lang/IllegalStateException
/*    */     //   169: dup
/*    */     //   170: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   172: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   175: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #73	-> 63
/*    */     //   #74	-> 97
/*    */     //   #73	-> 131
/*    */     //   #75	-> 159
/*    */     //   #73	-> 166
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	37	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   152	14	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   97	28	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   97	37	3	chatMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   143	23	3	chatMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   0	176	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	113	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	106	5	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final MatterhornChatElement transformLastTextPartContent(MatterhornChatElement $this$transformLastTextPartContent, Function1 transform) {
/* 79 */     int $i$f$transformLastTextPartContent = 0; MatterhornChatElement matterhornChatElement = $this$transformLastTextPartContent;
/*    */ 
/*    */     
/* 82 */     if (matterhornChatElement instanceof com.intellij.ml.llm.matterhorn.llm.MatterhornUserChatMessageWithToolResults) {  }
/* 83 */     else { if (matterhornChatElement instanceof MatterhornMultiPartChatMessage) {
/* 84 */         Object object1, object2 = CollectionsKt.lastOrNull((
/* 85 */             (MatterhornMultiPartChatMessage)$this$transformLastTextPartContent).getParts()); if (((object2 instanceof MatterhornChatMessageTextPart) ? object2 : null) == null) { (object2 instanceof MatterhornChatMessageTextPart) ? object2 : null; return $this$transformLastTextPartContent; }  return (MatterhornChatElement)MatterhornMultiPartChatMessage.copy$default((MatterhornMultiPartChatMessage)$this$transformLastTextPartContent, CollectionsKt.plus(((MatterhornMultiPartChatMessage)$this$transformLastTextPartContent).getParts().subList(0, ((MatterhornMultiPartChatMessage)$this$transformLastTextPartContent).getParts().size() - 1), object1.copy((String)transform.invoke(object1.getText()))), null, 2, null);
/*    */       } 
/*    */       throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (matterhornChatElement instanceof MatterhornAssistantChatMessageWithToolUses) ? (MatterhornChatElement)MatterhornAssistantChatMessageWithToolUses.copy$default((MatterhornAssistantChatMessageWithToolUses)$this$transformLastTextPartContent, null, (String)transform.invoke(((MatterhornAssistantChatMessageWithToolUses)$this$transformLastTextPartContent).getContent()), null, 5, null) : ((matterhornChatElement instanceof MatterhornChatMessage) ? (MatterhornChatElement)MatterhornChatMessage.copy$default((MatterhornChatMessage)$this$transformLastTextPartContent, (String)transform.invoke(((MatterhornChatMessage)$this$transformLastTextPartContent).getContent()), null, null, null, 14, null) : (MatterhornChatElement)"JD-Core does not support Kotlin");
/*    */   } private final Pair<String, ReviewResult> extractCodeFragment(String text, String expectedPrefix, String expectedPostfix, String expectedFormat) {
/* 91 */     String fragment = StringsKt.startsWith$default(text, expectedPrefix, false, 2, null) ? text : (String)CollectionsKt.firstOrNull(ExtractCodeRequest.Companion.extractCodeFragments(text));
/* 92 */     return (fragment != null && StringsKt.startsWith$default(fragment, expectedPrefix, false, 2, null) && StringsKt.endsWith$default(fragment, expectedPostfix, false, 2, null)) ? 
/* 93 */       TuplesKt.to(fragment, ReviewResult.Companion.getSuccess()) : 
/*    */       
/* 95 */       TuplesKt.to(text, new ReviewResult.Error("Expected " + expectedFormat));
/*    */   }
/*    */   
/*    */   private final Pair<String, ReviewResult> formatAnswer(String answerContent) {
/* 99 */     switch ((this.assistantAnswerFormat == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[this.assistantAnswerFormat.ordinal()]) { case true: case true: case true:  }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$execute$1
/*    */     //   11: astore #35
/*    */     //   13: aload #35
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #35
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #35
/*    */     //   50: aload #35
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #34
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #36
/*    */     //   62: aload #35
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 3767, 0 -> 128, 1 -> 187, 2 -> 354, 3 -> 505, 4 -> 817, 5 -> 1076, 6 -> 1341, 7 -> 1535, 8 -> 2152, 9 -> 2577, 10 -> 3241, 11 -> 3639
/*    */     //   128: aload #34
/*    */     //   130: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   133: aload_0
/*    */     //   134: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   137: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   140: invokevirtual getCapabilities : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   143: astore_3
/*    */     //   144: aload_1
/*    */     //   145: aload_0
/*    */     //   146: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   149: aload #35
/*    */     //   151: aload #35
/*    */     //   153: aload_0
/*    */     //   154: putfield L$0 : Ljava/lang/Object;
/*    */     //   157: aload #35
/*    */     //   159: aload_1
/*    */     //   160: putfield L$1 : Ljava/lang/Object;
/*    */     //   163: aload #35
/*    */     //   165: aload_3
/*    */     //   166: putfield L$2 : Ljava/lang/Object;
/*    */     //   169: aload #35
/*    */     //   171: iconst_1
/*    */     //   172: putfield label : I
/*    */     //   175: invokevirtual logModelParameters : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   178: dup
/*    */     //   179: aload #36
/*    */     //   181: if_acmpne -> 221
/*    */     //   184: aload #36
/*    */     //   186: areturn
/*    */     //   187: aload #35
/*    */     //   189: getfield L$2 : Ljava/lang/Object;
/*    */     //   192: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   195: astore_3
/*    */     //   196: aload #35
/*    */     //   198: getfield L$1 : Ljava/lang/Object;
/*    */     //   201: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   204: astore_1
/*    */     //   205: aload #35
/*    */     //   207: getfield L$0 : Ljava/lang/Object;
/*    */     //   210: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   213: astore_0
/*    */     //   214: aload #34
/*    */     //   216: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   219: aload #34
/*    */     //   221: pop
/*    */     //   222: aload_0
/*    */     //   223: getfield assistantAnswerFormat : Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;
/*    */     //   226: ifnull -> 300
/*    */     //   229: aload_3
/*    */     //   230: invokevirtual getSupportsAssistantMessageResuming : ()Z
/*    */     //   233: ifeq -> 300
/*    */     //   236: aload_0
/*    */     //   237: getfield assistantAnswerFormat : Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswerFormat;
/*    */     //   240: dup
/*    */     //   241: ifnonnull -> 249
/*    */     //   244: pop
/*    */     //   245: iconst_m1
/*    */     //   246: goto -> 257
/*    */     //   249: getstatic com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */     //   252: swap
/*    */     //   253: invokevirtual ordinal : ()I
/*    */     //   256: iaload
/*    */     //   257: tableswitch default -> 292, 1 -> 280, 2 -> 286
/*    */     //   280: ldc_w '{'
/*    */     //   283: goto -> 301
/*    */     //   286: ldc_w '['
/*    */     //   289: goto -> 301
/*    */     //   292: new kotlin/NoWhenBranchMatchedException
/*    */     //   295: dup
/*    */     //   296: invokespecial <init> : ()V
/*    */     //   299: athrow
/*    */     //   300: aconst_null
/*    */     //   301: astore #4
/*    */     //   303: aload_0
/*    */     //   304: aload_1
/*    */     //   305: aload_0
/*    */     //   306: getfield system : Ljava/util/List;
/*    */     //   309: aload #35
/*    */     //   311: aload #35
/*    */     //   313: aload_0
/*    */     //   314: putfield L$0 : Ljava/lang/Object;
/*    */     //   317: aload #35
/*    */     //   319: aload_1
/*    */     //   320: putfield L$1 : Ljava/lang/Object;
/*    */     //   323: aload #35
/*    */     //   325: aload_3
/*    */     //   326: putfield L$2 : Ljava/lang/Object;
/*    */     //   329: aload #35
/*    */     //   331: aload #4
/*    */     //   333: putfield L$3 : Ljava/lang/Object;
/*    */     //   336: aload #35
/*    */     //   338: iconst_2
/*    */     //   339: putfield label : I
/*    */     //   342: invokespecial buildMessageParts : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   345: dup
/*    */     //   346: aload #36
/*    */     //   348: if_acmpne -> 398
/*    */     //   351: aload #36
/*    */     //   353: areturn
/*    */     //   354: aload #35
/*    */     //   356: getfield L$3 : Ljava/lang/Object;
/*    */     //   359: checkcast java/lang/String
/*    */     //   362: astore #4
/*    */     //   364: aload #35
/*    */     //   366: getfield L$2 : Ljava/lang/Object;
/*    */     //   369: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   372: astore_3
/*    */     //   373: aload #35
/*    */     //   375: getfield L$1 : Ljava/lang/Object;
/*    */     //   378: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   381: astore_1
/*    */     //   382: aload #35
/*    */     //   384: getfield L$0 : Ljava/lang/Object;
/*    */     //   387: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   390: astore_0
/*    */     //   391: aload #34
/*    */     //   393: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   396: aload #34
/*    */     //   398: checkcast java/util/List
/*    */     //   401: invokestatic singleOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   404: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart
/*    */     //   407: dup
/*    */     //   408: ifnull -> 418
/*    */     //   411: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   414: dup
/*    */     //   415: ifnonnull -> 422
/*    */     //   418: pop
/*    */     //   419: ldc_w ''
/*    */     //   422: astore #5
/*    */     //   424: aload_0
/*    */     //   425: getfield toolsWithHandlers : Ljava/util/Map;
/*    */     //   428: invokeinterface keySet : ()Ljava/util/Set;
/*    */     //   433: checkcast java/lang/Iterable
/*    */     //   436: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   439: astore #6
/*    */     //   441: aload_1
/*    */     //   442: aload #5
/*    */     //   444: aload #6
/*    */     //   446: aload #35
/*    */     //   448: aload #35
/*    */     //   450: aload_0
/*    */     //   451: putfield L$0 : Ljava/lang/Object;
/*    */     //   454: aload #35
/*    */     //   456: aload_1
/*    */     //   457: putfield L$1 : Ljava/lang/Object;
/*    */     //   460: aload #35
/*    */     //   462: aload_3
/*    */     //   463: putfield L$2 : Ljava/lang/Object;
/*    */     //   466: aload #35
/*    */     //   468: aload #4
/*    */     //   470: putfield L$3 : Ljava/lang/Object;
/*    */     //   473: aload #35
/*    */     //   475: aload #5
/*    */     //   477: putfield L$4 : Ljava/lang/Object;
/*    */     //   480: aload #35
/*    */     //   482: aload #6
/*    */     //   484: putfield L$5 : Ljava/lang/Object;
/*    */     //   487: aload #35
/*    */     //   489: iconst_3
/*    */     //   490: putfield label : I
/*    */     //   493: invokevirtual logHeadMessage : (Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   496: dup
/*    */     //   497: aload #36
/*    */     //   499: if_acmpne -> 569
/*    */     //   502: aload #36
/*    */     //   504: areturn
/*    */     //   505: aload #35
/*    */     //   507: getfield L$5 : Ljava/lang/Object;
/*    */     //   510: checkcast java/util/List
/*    */     //   513: astore #6
/*    */     //   515: aload #35
/*    */     //   517: getfield L$4 : Ljava/lang/Object;
/*    */     //   520: checkcast java/lang/String
/*    */     //   523: astore #5
/*    */     //   525: aload #35
/*    */     //   527: getfield L$3 : Ljava/lang/Object;
/*    */     //   530: checkcast java/lang/String
/*    */     //   533: astore #4
/*    */     //   535: aload #35
/*    */     //   537: getfield L$2 : Ljava/lang/Object;
/*    */     //   540: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   543: astore_3
/*    */     //   544: aload #35
/*    */     //   546: getfield L$1 : Ljava/lang/Object;
/*    */     //   549: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   552: astore_1
/*    */     //   553: aload #35
/*    */     //   555: getfield L$0 : Ljava/lang/Object;
/*    */     //   558: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   561: astore_0
/*    */     //   562: aload #34
/*    */     //   564: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   567: aload #34
/*    */     //   569: pop
/*    */     //   570: new com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   573: dup
/*    */     //   574: aload #5
/*    */     //   576: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   579: aload #6
/*    */     //   581: aload_0
/*    */     //   582: getfield toolChoice : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;
/*    */     //   585: aconst_null
/*    */     //   586: bipush #16
/*    */     //   588: aconst_null
/*    */     //   589: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   592: astore #7
/*    */     //   594: aload_0
/*    */     //   595: getfield toolsWithHandlers : Ljava/util/Map;
/*    */     //   598: astore #9
/*    */     //   600: iconst_0
/*    */     //   601: istore #10
/*    */     //   603: aload #9
/*    */     //   605: astore #11
/*    */     //   607: new java/util/LinkedHashMap
/*    */     //   610: dup
/*    */     //   611: aload #9
/*    */     //   613: invokeinterface size : ()I
/*    */     //   618: invokestatic mapCapacity : (I)I
/*    */     //   621: invokespecial <init> : (I)V
/*    */     //   624: checkcast java/util/Map
/*    */     //   627: astore #12
/*    */     //   629: iconst_0
/*    */     //   630: istore #13
/*    */     //   632: aload #11
/*    */     //   634: invokeinterface entrySet : ()Ljava/util/Set;
/*    */     //   639: checkcast java/lang/Iterable
/*    */     //   642: astore #14
/*    */     //   644: iconst_0
/*    */     //   645: istore #15
/*    */     //   647: aload #14
/*    */     //   649: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   654: astore #16
/*    */     //   656: aload #16
/*    */     //   658: invokeinterface hasNext : ()Z
/*    */     //   663: ifeq -> 743
/*    */     //   666: aload #16
/*    */     //   668: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   673: astore #17
/*    */     //   675: aload #12
/*    */     //   677: aload #17
/*    */     //   679: checkcast java/util/Map$Entry
/*    */     //   682: astore #18
/*    */     //   684: astore #33
/*    */     //   686: iconst_0
/*    */     //   687: istore #19
/*    */     //   689: aload #18
/*    */     //   691: invokeinterface getKey : ()Ljava/lang/Object;
/*    */     //   696: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornTool
/*    */     //   699: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   702: aload #33
/*    */     //   704: swap
/*    */     //   705: aload #17
/*    */     //   707: checkcast java/util/Map$Entry
/*    */     //   710: astore #20
/*    */     //   712: astore #21
/*    */     //   714: astore #22
/*    */     //   716: iconst_0
/*    */     //   717: istore #23
/*    */     //   719: aload #20
/*    */     //   721: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   726: astore #18
/*    */     //   728: aload #22
/*    */     //   730: aload #21
/*    */     //   732: aload #18
/*    */     //   734: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   739: pop
/*    */     //   740: goto -> 656
/*    */     //   743: aload #12
/*    */     //   745: nop
/*    */     //   746: nop
/*    */     //   747: astore #8
/*    */     //   749: aload_0
/*    */     //   750: aload_1
/*    */     //   751: aload_0
/*    */     //   752: getfield user : Ljava/util/List;
/*    */     //   755: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   758: aload #35
/*    */     //   760: aload #35
/*    */     //   762: aload_0
/*    */     //   763: putfield L$0 : Ljava/lang/Object;
/*    */     //   766: aload #35
/*    */     //   768: aload_1
/*    */     //   769: putfield L$1 : Ljava/lang/Object;
/*    */     //   772: aload #35
/*    */     //   774: aload_3
/*    */     //   775: putfield L$2 : Ljava/lang/Object;
/*    */     //   778: aload #35
/*    */     //   780: aload #4
/*    */     //   782: putfield L$3 : Ljava/lang/Object;
/*    */     //   785: aload #35
/*    */     //   787: aload #7
/*    */     //   789: putfield L$4 : Ljava/lang/Object;
/*    */     //   792: aload #35
/*    */     //   794: aload #8
/*    */     //   796: putfield L$5 : Ljava/lang/Object;
/*    */     //   799: aload #35
/*    */     //   801: iconst_4
/*    */     //   802: putfield label : I
/*    */     //   805: invokespecial buildUserMessage : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   808: dup
/*    */     //   809: aload #36
/*    */     //   811: if_acmpne -> 881
/*    */     //   814: aload #36
/*    */     //   816: areturn
/*    */     //   817: aload #35
/*    */     //   819: getfield L$5 : Ljava/lang/Object;
/*    */     //   822: checkcast java/util/Map
/*    */     //   825: astore #8
/*    */     //   827: aload #35
/*    */     //   829: getfield L$4 : Ljava/lang/Object;
/*    */     //   832: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   835: astore #7
/*    */     //   837: aload #35
/*    */     //   839: getfield L$3 : Ljava/lang/Object;
/*    */     //   842: checkcast java/lang/String
/*    */     //   845: astore #4
/*    */     //   847: aload #35
/*    */     //   849: getfield L$2 : Ljava/lang/Object;
/*    */     //   852: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   855: astore_3
/*    */     //   856: aload #35
/*    */     //   858: getfield L$1 : Ljava/lang/Object;
/*    */     //   861: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   864: astore_1
/*    */     //   865: aload #35
/*    */     //   867: getfield L$0 : Ljava/lang/Object;
/*    */     //   870: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   873: astore_0
/*    */     //   874: aload #34
/*    */     //   876: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   879: aload #34
/*    */     //   881: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   884: astore #9
/*    */     //   886: iconst_0
/*    */     //   887: istore #10
/*    */     //   889: iconst_0
/*    */     //   890: istore #11
/*    */     //   892: aconst_null
/*    */     //   893: astore #12
/*    */     //   895: new com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*    */     //   898: dup
/*    */     //   899: aload_0
/*    */     //   900: getfield reviewersCount : I
/*    */     //   903: invokespecial <init> : (I)V
/*    */     //   906: astore #13
/*    */     //   908: iload #10
/*    */     //   910: aload_0
/*    */     //   911: getfield maxRetries : I
/*    */     //   914: if_icmpge -> 3745
/*    */     //   917: aload #9
/*    */     //   919: ifnull -> 1434
/*    */     //   922: aload #7
/*    */     //   924: invokevirtual getMessages : ()Ljava/util/List;
/*    */     //   927: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   930: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   933: astore #15
/*    */     //   935: aload #15
/*    */     //   937: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   940: ifeq -> 954
/*    */     //   943: aload #15
/*    */     //   945: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   948: invokevirtual getAnswerChoiceId : ()Ljava/lang/String;
/*    */     //   951: goto -> 974
/*    */     //   954: aload #15
/*    */     //   956: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*    */     //   959: ifeq -> 973
/*    */     //   962: aload #15
/*    */     //   964: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*    */     //   967: invokevirtual getAnswerChoiceId : ()Ljava/lang/String;
/*    */     //   970: goto -> 974
/*    */     //   973: aconst_null
/*    */     //   974: astore #14
/*    */     //   976: aload_1
/*    */     //   977: aload #9
/*    */     //   979: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   982: aload #35
/*    */     //   984: aload #35
/*    */     //   986: aload_0
/*    */     //   987: putfield L$0 : Ljava/lang/Object;
/*    */     //   990: aload #35
/*    */     //   992: aload_1
/*    */     //   993: putfield L$1 : Ljava/lang/Object;
/*    */     //   996: aload #35
/*    */     //   998: aload_3
/*    */     //   999: putfield L$2 : Ljava/lang/Object;
/*    */     //   1002: aload #35
/*    */     //   1004: aload #4
/*    */     //   1006: putfield L$3 : Ljava/lang/Object;
/*    */     //   1009: aload #35
/*    */     //   1011: aload #7
/*    */     //   1013: putfield L$4 : Ljava/lang/Object;
/*    */     //   1016: aload #35
/*    */     //   1018: aload #8
/*    */     //   1020: putfield L$5 : Ljava/lang/Object;
/*    */     //   1023: aload #35
/*    */     //   1025: aload #9
/*    */     //   1027: putfield L$6 : Ljava/lang/Object;
/*    */     //   1030: aload #35
/*    */     //   1032: aload #13
/*    */     //   1034: putfield L$7 : Ljava/lang/Object;
/*    */     //   1037: aload #35
/*    */     //   1039: aload #14
/*    */     //   1041: putfield L$8 : Ljava/lang/Object;
/*    */     //   1044: aload #35
/*    */     //   1046: iload #10
/*    */     //   1048: putfield I$0 : I
/*    */     //   1051: aload #35
/*    */     //   1053: iload #11
/*    */     //   1055: putfield I$1 : I
/*    */     //   1058: aload #35
/*    */     //   1060: iconst_5
/*    */     //   1061: putfield label : I
/*    */     //   1064: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   1067: dup
/*    */     //   1068: aload #36
/*    */     //   1070: if_acmpne -> 1184
/*    */     //   1073: aload #36
/*    */     //   1075: areturn
/*    */     //   1076: aload #35
/*    */     //   1078: getfield I$1 : I
/*    */     //   1081: istore #11
/*    */     //   1083: aload #35
/*    */     //   1085: getfield I$0 : I
/*    */     //   1088: istore #10
/*    */     //   1090: aload #35
/*    */     //   1092: getfield L$8 : Ljava/lang/Object;
/*    */     //   1095: checkcast java/lang/String
/*    */     //   1098: astore #14
/*    */     //   1100: aload #35
/*    */     //   1102: getfield L$7 : Ljava/lang/Object;
/*    */     //   1105: checkcast com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*    */     //   1108: astore #13
/*    */     //   1110: aload #35
/*    */     //   1112: getfield L$6 : Ljava/lang/Object;
/*    */     //   1115: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1118: astore #9
/*    */     //   1120: aload #35
/*    */     //   1122: getfield L$5 : Ljava/lang/Object;
/*    */     //   1125: checkcast java/util/Map
/*    */     //   1128: astore #8
/*    */     //   1130: aload #35
/*    */     //   1132: getfield L$4 : Ljava/lang/Object;
/*    */     //   1135: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   1138: astore #7
/*    */     //   1140: aload #35
/*    */     //   1142: getfield L$3 : Ljava/lang/Object;
/*    */     //   1145: checkcast java/lang/String
/*    */     //   1148: astore #4
/*    */     //   1150: aload #35
/*    */     //   1152: getfield L$2 : Ljava/lang/Object;
/*    */     //   1155: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   1158: astore_3
/*    */     //   1159: aload #35
/*    */     //   1161: getfield L$1 : Ljava/lang/Object;
/*    */     //   1164: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   1167: astore_1
/*    */     //   1168: aload #35
/*    */     //   1170: getfield L$0 : Ljava/lang/Object;
/*    */     //   1173: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   1176: astore_0
/*    */     //   1177: aload #34
/*    */     //   1179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1182: aload #34
/*    */     //   1184: pop
/*    */     //   1185: aload #14
/*    */     //   1187: ifnull -> 1211
/*    */     //   1190: aload #7
/*    */     //   1192: aconst_null
/*    */     //   1193: aload #9
/*    */     //   1195: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   1198: aconst_null
/*    */     //   1199: aconst_null
/*    */     //   1200: aload #14
/*    */     //   1202: bipush #13
/*    */     //   1204: aconst_null
/*    */     //   1205: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1208: goto -> 1218
/*    */     //   1211: aload #7
/*    */     //   1213: aload #9
/*    */     //   1215: invokevirtual withNewMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1218: astore #7
/*    */     //   1220: aload #4
/*    */     //   1222: ifnull -> 1431
/*    */     //   1225: aload_0
/*    */     //   1226: aload #7
/*    */     //   1228: aload_1
/*    */     //   1229: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   1232: dup
/*    */     //   1233: aload #4
/*    */     //   1235: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.Assistant : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */     //   1238: aconst_null
/*    */     //   1239: aconst_null
/*    */     //   1240: bipush #12
/*    */     //   1242: aconst_null
/*    */     //   1243: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   1246: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1249: aload #35
/*    */     //   1251: aload #35
/*    */     //   1253: aload_0
/*    */     //   1254: putfield L$0 : Ljava/lang/Object;
/*    */     //   1257: aload #35
/*    */     //   1259: aload_1
/*    */     //   1260: putfield L$1 : Ljava/lang/Object;
/*    */     //   1263: aload #35
/*    */     //   1265: aload_3
/*    */     //   1266: putfield L$2 : Ljava/lang/Object;
/*    */     //   1269: aload #35
/*    */     //   1271: aload #4
/*    */     //   1273: putfield L$3 : Ljava/lang/Object;
/*    */     //   1276: aload #35
/*    */     //   1278: aload #8
/*    */     //   1280: putfield L$4 : Ljava/lang/Object;
/*    */     //   1283: aload #35
/*    */     //   1285: aload #13
/*    */     //   1287: putfield L$5 : Ljava/lang/Object;
/*    */     //   1290: aload #35
/*    */     //   1292: aconst_null
/*    */     //   1293: putfield L$6 : Ljava/lang/Object;
/*    */     //   1296: aload #35
/*    */     //   1298: aconst_null
/*    */     //   1299: putfield L$7 : Ljava/lang/Object;
/*    */     //   1302: aload #35
/*    */     //   1304: aconst_null
/*    */     //   1305: putfield L$8 : Ljava/lang/Object;
/*    */     //   1308: aload #35
/*    */     //   1310: iload #10
/*    */     //   1312: putfield I$0 : I
/*    */     //   1315: aload #35
/*    */     //   1317: iload #11
/*    */     //   1319: putfield I$1 : I
/*    */     //   1322: aload #35
/*    */     //   1324: bipush #6
/*    */     //   1326: putfield label : I
/*    */     //   1329: invokespecial addChatMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   1332: dup
/*    */     //   1333: aload #36
/*    */     //   1335: if_acmpne -> 1419
/*    */     //   1338: aload #36
/*    */     //   1340: areturn
/*    */     //   1341: aload #35
/*    */     //   1343: getfield I$1 : I
/*    */     //   1346: istore #11
/*    */     //   1348: aload #35
/*    */     //   1350: getfield I$0 : I
/*    */     //   1353: istore #10
/*    */     //   1355: aload #35
/*    */     //   1357: getfield L$5 : Ljava/lang/Object;
/*    */     //   1360: checkcast com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*    */     //   1363: astore #13
/*    */     //   1365: aload #35
/*    */     //   1367: getfield L$4 : Ljava/lang/Object;
/*    */     //   1370: checkcast java/util/Map
/*    */     //   1373: astore #8
/*    */     //   1375: aload #35
/*    */     //   1377: getfield L$3 : Ljava/lang/Object;
/*    */     //   1380: checkcast java/lang/String
/*    */     //   1383: astore #4
/*    */     //   1385: aload #35
/*    */     //   1387: getfield L$2 : Ljava/lang/Object;
/*    */     //   1390: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   1393: astore_3
/*    */     //   1394: aload #35
/*    */     //   1396: getfield L$1 : Ljava/lang/Object;
/*    */     //   1399: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   1402: astore_1
/*    */     //   1403: aload #35
/*    */     //   1405: getfield L$0 : Ljava/lang/Object;
/*    */     //   1408: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   1411: astore_0
/*    */     //   1412: aload #34
/*    */     //   1414: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1417: aload #34
/*    */     //   1419: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   1422: astore #7
/*    */     //   1424: aload #4
/*    */     //   1426: astore #12
/*    */     //   1428: goto -> 1434
/*    */     //   1431: aconst_null
/*    */     //   1432: astore #12
/*    */     //   1434: aload_1
/*    */     //   1435: aload #7
/*    */     //   1437: aload_0
/*    */     //   1438: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   1441: aload #35
/*    */     //   1443: aload #35
/*    */     //   1445: aload_0
/*    */     //   1446: putfield L$0 : Ljava/lang/Object;
/*    */     //   1449: aload #35
/*    */     //   1451: aload_1
/*    */     //   1452: putfield L$1 : Ljava/lang/Object;
/*    */     //   1455: aload #35
/*    */     //   1457: aload_3
/*    */     //   1458: putfield L$2 : Ljava/lang/Object;
/*    */     //   1461: aload #35
/*    */     //   1463: aload #4
/*    */     //   1465: putfield L$3 : Ljava/lang/Object;
/*    */     //   1468: aload #35
/*    */     //   1470: aload #7
/*    */     //   1472: putfield L$4 : Ljava/lang/Object;
/*    */     //   1475: aload #35
/*    */     //   1477: aload #8
/*    */     //   1479: putfield L$5 : Ljava/lang/Object;
/*    */     //   1482: aload #35
/*    */     //   1484: aload #12
/*    */     //   1486: putfield L$6 : Ljava/lang/Object;
/*    */     //   1489: aload #35
/*    */     //   1491: aload #13
/*    */     //   1493: putfield L$7 : Ljava/lang/Object;
/*    */     //   1496: aload #35
/*    */     //   1498: aconst_null
/*    */     //   1499: putfield L$8 : Ljava/lang/Object;
/*    */     //   1502: aload #35
/*    */     //   1504: iload #10
/*    */     //   1506: putfield I$0 : I
/*    */     //   1509: aload #35
/*    */     //   1511: iload #11
/*    */     //   1513: putfield I$1 : I
/*    */     //   1516: aload #35
/*    */     //   1518: bipush #7
/*    */     //   1520: putfield label : I
/*    */     //   1523: invokevirtual sendToGrazie : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   1526: dup
/*    */     //   1527: aload #36
/*    */     //   1529: if_acmpne -> 1633
/*    */     //   1532: aload #36
/*    */     //   1534: areturn
/*    */     //   1535: aload #35
/*    */     //   1537: getfield I$1 : I
/*    */     //   1540: istore #11
/*    */     //   1542: aload #35
/*    */     //   1544: getfield I$0 : I
/*    */     //   1547: istore #10
/*    */     //   1549: aload #35
/*    */     //   1551: getfield L$7 : Ljava/lang/Object;
/*    */     //   1554: checkcast com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*    */     //   1557: astore #13
/*    */     //   1559: aload #35
/*    */     //   1561: getfield L$6 : Ljava/lang/Object;
/*    */     //   1564: checkcast java/lang/String
/*    */     //   1567: astore #12
/*    */     //   1569: aload #35
/*    */     //   1571: getfield L$5 : Ljava/lang/Object;
/*    */     //   1574: checkcast java/util/Map
/*    */     //   1577: astore #8
/*    */     //   1579: aload #35
/*    */     //   1581: getfield L$4 : Ljava/lang/Object;
/*    */     //   1584: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   1587: astore #7
/*    */     //   1589: aload #35
/*    */     //   1591: getfield L$3 : Ljava/lang/Object;
/*    */     //   1594: checkcast java/lang/String
/*    */     //   1597: astore #4
/*    */     //   1599: aload #35
/*    */     //   1601: getfield L$2 : Ljava/lang/Object;
/*    */     //   1604: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   1607: astore_3
/*    */     //   1608: aload #35
/*    */     //   1610: getfield L$1 : Ljava/lang/Object;
/*    */     //   1613: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   1616: astore_1
/*    */     //   1617: aload #35
/*    */     //   1619: getfield L$0 : Ljava/lang/Object;
/*    */     //   1622: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   1625: astore_0
/*    */     //   1626: aload #34
/*    */     //   1628: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1631: aload #34
/*    */     //   1633: checkcast java/util/List
/*    */     //   1636: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   1639: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1642: astore #16
/*    */     //   1644: iconst_0
/*    */     //   1645: istore #17
/*    */     //   1647: aload #16
/*    */     //   1649: astore #19
/*    */     //   1651: iconst_0
/*    */     //   1652: istore #20
/*    */     //   1654: aload #19
/*    */     //   1656: astore #21
/*    */     //   1658: aload #21
/*    */     //   1660: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*    */     //   1663: ifeq -> 1736
/*    */     //   1666: aload #19
/*    */     //   1668: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*    */     //   1671: aconst_null
/*    */     //   1672: aload #19
/*    */     //   1674: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*    */     //   1677: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   1680: astore #22
/*    */     //   1682: astore #23
/*    */     //   1684: astore #24
/*    */     //   1686: iconst_0
/*    */     //   1687: istore #25
/*    */     //   1689: aload #22
/*    */     //   1691: checkcast java/lang/CharSequence
/*    */     //   1694: invokestatic trimEnd : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*    */     //   1697: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1700: astore #26
/*    */     //   1702: aload #22
/*    */     //   1704: aload #26
/*    */     //   1706: if_acmpne -> 1714
/*    */     //   1709: aload #16
/*    */     //   1711: goto -> 2055
/*    */     //   1714: aload #26
/*    */     //   1716: astore #27
/*    */     //   1718: aload #24
/*    */     //   1720: aload #23
/*    */     //   1722: aload #27
/*    */     //   1724: aconst_null
/*    */     //   1725: iconst_5
/*    */     //   1726: aconst_null
/*    */     //   1727: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses;
/*    */     //   1730: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1733: goto -> 2054
/*    */     //   1736: aload #21
/*    */     //   1738: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   1741: ifeq -> 1809
/*    */     //   1744: aload #19
/*    */     //   1746: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   1749: aload #19
/*    */     //   1751: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   1754: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   1757: astore #22
/*    */     //   1759: astore #24
/*    */     //   1761: iconst_0
/*    */     //   1762: istore #25
/*    */     //   1764: aload #22
/*    */     //   1766: checkcast java/lang/CharSequence
/*    */     //   1769: invokestatic trimEnd : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*    */     //   1772: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1775: astore #26
/*    */     //   1777: aload #22
/*    */     //   1779: aload #26
/*    */     //   1781: if_acmpne -> 1789
/*    */     //   1784: aload #16
/*    */     //   1786: goto -> 2055
/*    */     //   1789: aload #26
/*    */     //   1791: aload #24
/*    */     //   1793: swap
/*    */     //   1794: aconst_null
/*    */     //   1795: aconst_null
/*    */     //   1796: aconst_null
/*    */     //   1797: bipush #14
/*    */     //   1799: aconst_null
/*    */     //   1800: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   1803: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1806: goto -> 2054
/*    */     //   1809: aload #21
/*    */     //   1811: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*    */     //   1814: ifeq -> 1886
/*    */     //   1817: aload #19
/*    */     //   1819: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*    */     //   1822: aconst_null
/*    */     //   1823: aload #19
/*    */     //   1825: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*    */     //   1828: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   1831: astore #22
/*    */     //   1833: astore #23
/*    */     //   1835: astore #24
/*    */     //   1837: iconst_0
/*    */     //   1838: istore #25
/*    */     //   1840: aload #22
/*    */     //   1842: checkcast java/lang/CharSequence
/*    */     //   1845: invokestatic trimEnd : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*    */     //   1848: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1851: astore #26
/*    */     //   1853: aload #22
/*    */     //   1855: aload #26
/*    */     //   1857: if_acmpne -> 1865
/*    */     //   1860: aload #16
/*    */     //   1862: goto -> 2055
/*    */     //   1865: aload #26
/*    */     //   1867: astore #27
/*    */     //   1869: aload #24
/*    */     //   1871: aload #23
/*    */     //   1873: aload #27
/*    */     //   1875: iconst_1
/*    */     //   1876: aconst_null
/*    */     //   1877: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults;
/*    */     //   1880: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1883: goto -> 2054
/*    */     //   1886: aload #21
/*    */     //   1888: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage
/*    */     //   1891: ifeq -> 2046
/*    */     //   1894: aload #19
/*    */     //   1896: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage
/*    */     //   1899: invokevirtual getParts : ()Ljava/util/List;
/*    */     //   1902: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   1905: astore #25
/*    */     //   1907: aload #25
/*    */     //   1909: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart
/*    */     //   1912: ifeq -> 1923
/*    */     //   1915: aload #25
/*    */     //   1917: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart
/*    */     //   1920: goto -> 1924
/*    */     //   1923: aconst_null
/*    */     //   1924: dup
/*    */     //   1925: ifnonnull -> 1934
/*    */     //   1928: pop
/*    */     //   1929: aload #19
/*    */     //   1931: goto -> 2054
/*    */     //   1934: astore #22
/*    */     //   1936: aload #19
/*    */     //   1938: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage
/*    */     //   1941: aload #19
/*    */     //   1943: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage
/*    */     //   1946: invokevirtual getParts : ()Ljava/util/List;
/*    */     //   1949: iconst_0
/*    */     //   1950: aload #19
/*    */     //   1952: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage
/*    */     //   1955: invokevirtual getParts : ()Ljava/util/List;
/*    */     //   1958: invokeinterface size : ()I
/*    */     //   1963: iconst_1
/*    */     //   1964: isub
/*    */     //   1965: invokeinterface subList : (II)Ljava/util/List;
/*    */     //   1970: checkcast java/util/Collection
/*    */     //   1973: aload #22
/*    */     //   1975: aload #22
/*    */     //   1977: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   1980: astore #26
/*    */     //   1982: astore #27
/*    */     //   1984: astore #23
/*    */     //   1986: astore #24
/*    */     //   1988: iconst_0
/*    */     //   1989: istore #28
/*    */     //   1991: aload #26
/*    */     //   1993: checkcast java/lang/CharSequence
/*    */     //   1996: invokestatic trimEnd : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*    */     //   1999: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2002: astore #29
/*    */     //   2004: aload #26
/*    */     //   2006: aload #29
/*    */     //   2008: if_acmpne -> 2016
/*    */     //   2011: aload #16
/*    */     //   2013: goto -> 2055
/*    */     //   2016: aload #29
/*    */     //   2018: astore #30
/*    */     //   2020: aload #24
/*    */     //   2022: aload #23
/*    */     //   2024: aload #27
/*    */     //   2026: aload #30
/*    */     //   2028: invokevirtual copy : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart;
/*    */     //   2031: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;
/*    */     //   2034: aconst_null
/*    */     //   2035: iconst_2
/*    */     //   2036: aconst_null
/*    */     //   2037: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornMultiPartChatMessage;
/*    */     //   2040: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   2043: goto -> 2054
/*    */     //   2046: new kotlin/NoWhenBranchMatchedException
/*    */     //   2049: dup
/*    */     //   2050: invokespecial <init> : ()V
/*    */     //   2053: athrow
/*    */     //   2054: nop
/*    */     //   2055: nop
/*    */     //   2056: astore #14
/*    */     //   2058: aload_0
/*    */     //   2059: aload #7
/*    */     //   2061: aload_1
/*    */     //   2062: aload #14
/*    */     //   2064: aload #35
/*    */     //   2066: aload #35
/*    */     //   2068: aload_0
/*    */     //   2069: putfield L$0 : Ljava/lang/Object;
/*    */     //   2072: aload #35
/*    */     //   2074: aload_1
/*    */     //   2075: putfield L$1 : Ljava/lang/Object;
/*    */     //   2078: aload #35
/*    */     //   2080: aload_3
/*    */     //   2081: putfield L$2 : Ljava/lang/Object;
/*    */     //   2084: aload #35
/*    */     //   2086: aload #4
/*    */     //   2088: putfield L$3 : Ljava/lang/Object;
/*    */     //   2091: aload #35
/*    */     //   2093: aload #8
/*    */     //   2095: putfield L$4 : Ljava/lang/Object;
/*    */     //   2098: aload #35
/*    */     //   2100: aload #12
/*    */     //   2102: putfield L$5 : Ljava/lang/Object;
/*    */     //   2105: aload #35
/*    */     //   2107: aload #13
/*    */     //   2109: putfield L$6 : Ljava/lang/Object;
/*    */     //   2112: aload #35
/*    */     //   2114: aload #14
/*    */     //   2116: putfield L$7 : Ljava/lang/Object;
/*    */     //   2119: aload #35
/*    */     //   2121: iload #10
/*    */     //   2123: putfield I$0 : I
/*    */     //   2126: aload #35
/*    */     //   2128: iload #11
/*    */     //   2130: putfield I$1 : I
/*    */     //   2133: aload #35
/*    */     //   2135: bipush #8
/*    */     //   2137: putfield label : I
/*    */     //   2140: invokespecial addChatMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   2143: dup
/*    */     //   2144: aload #36
/*    */     //   2146: if_acmpne -> 2250
/*    */     //   2149: aload #36
/*    */     //   2151: areturn
/*    */     //   2152: aload #35
/*    */     //   2154: getfield I$1 : I
/*    */     //   2157: istore #11
/*    */     //   2159: aload #35
/*    */     //   2161: getfield I$0 : I
/*    */     //   2164: istore #10
/*    */     //   2166: aload #35
/*    */     //   2168: getfield L$7 : Ljava/lang/Object;
/*    */     //   2171: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   2174: astore #14
/*    */     //   2176: aload #35
/*    */     //   2178: getfield L$6 : Ljava/lang/Object;
/*    */     //   2181: checkcast com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*    */     //   2184: astore #13
/*    */     //   2186: aload #35
/*    */     //   2188: getfield L$5 : Ljava/lang/Object;
/*    */     //   2191: checkcast java/lang/String
/*    */     //   2194: astore #12
/*    */     //   2196: aload #35
/*    */     //   2198: getfield L$4 : Ljava/lang/Object;
/*    */     //   2201: checkcast java/util/Map
/*    */     //   2204: astore #8
/*    */     //   2206: aload #35
/*    */     //   2208: getfield L$3 : Ljava/lang/Object;
/*    */     //   2211: checkcast java/lang/String
/*    */     //   2214: astore #4
/*    */     //   2216: aload #35
/*    */     //   2218: getfield L$2 : Ljava/lang/Object;
/*    */     //   2221: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   2224: astore_3
/*    */     //   2225: aload #35
/*    */     //   2227: getfield L$1 : Ljava/lang/Object;
/*    */     //   2230: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   2233: astore_1
/*    */     //   2234: aload #35
/*    */     //   2236: getfield L$0 : Ljava/lang/Object;
/*    */     //   2239: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   2242: astore_0
/*    */     //   2243: aload #34
/*    */     //   2245: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   2248: aload #34
/*    */     //   2250: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   2253: astore #7
/*    */     //   2255: aload #12
/*    */     //   2257: dup
/*    */     //   2258: ifnull -> 2277
/*    */     //   2261: aload #14
/*    */     //   2263: invokeinterface getContent : ()Ljava/lang/String;
/*    */     //   2268: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   2273: dup
/*    */     //   2274: ifnonnull -> 2285
/*    */     //   2277: pop
/*    */     //   2278: aload #14
/*    */     //   2280: invokeinterface getContent : ()Ljava/lang/String;
/*    */     //   2285: astore #12
/*    */     //   2287: aload_0
/*    */     //   2288: getfield completionCheck : Lkotlin/jvm/functions/Function1;
/*    */     //   2291: aload #12
/*    */     //   2293: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   2298: checkcast java/lang/Boolean
/*    */     //   2301: invokevirtual booleanValue : ()Z
/*    */     //   2304: istore #15
/*    */     //   2306: iload #15
/*    */     //   2308: ifne -> 2344
/*    */     //   2311: aload_3
/*    */     //   2312: invokevirtual getSupportsAssistantMessageResuming : ()Z
/*    */     //   2315: ifeq -> 2344
/*    */     //   2318: aload #14
/*    */     //   2320: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   2323: ifeq -> 2344
/*    */     //   2326: iinc #11, 1
/*    */     //   2329: iload #11
/*    */     //   2331: aload_0
/*    */     //   2332: getfield maxCompletionRequests : I
/*    */     //   2335: if_icmpgt -> 2344
/*    */     //   2338: aconst_null
/*    */     //   2339: astore #9
/*    */     //   2341: goto -> 908
/*    */     //   2344: iconst_0
/*    */     //   2345: istore #11
/*    */     //   2347: iconst_0
/*    */     //   2348: istore #16
/*    */     //   2350: iconst_0
/*    */     //   2351: istore #17
/*    */     //   2353: iconst_0
/*    */     //   2354: istore #18
/*    */     //   2356: new java/util/ArrayList
/*    */     //   2359: dup
/*    */     //   2360: invokespecial <init> : ()V
/*    */     //   2363: checkcast java/util/List
/*    */     //   2366: astore #19
/*    */     //   2368: aload #14
/*    */     //   2370: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*    */     //   2373: ifeq -> 2986
/*    */     //   2376: aload #14
/*    */     //   2378: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*    */     //   2381: invokevirtual getToolUses : ()Ljava/util/List;
/*    */     //   2384: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   2389: astore #20
/*    */     //   2391: aload #20
/*    */     //   2393: invokeinterface hasNext : ()Z
/*    */     //   2398: ifeq -> 2986
/*    */     //   2401: aload #20
/*    */     //   2403: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   2408: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolUse
/*    */     //   2411: astore #21
/*    */     //   2413: aload #8
/*    */     //   2415: aload #21
/*    */     //   2417: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   2420: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   2425: checkcast com/intellij/ml/llm/matterhorn/requests/builder/MatterhornToolUsageHandler
/*    */     //   2428: astore #22
/*    */     //   2430: aload #22
/*    */     //   2432: dup
/*    */     //   2433: ifnull -> 2740
/*    */     //   2436: aload #21
/*    */     //   2438: aload #35
/*    */     //   2440: aload #35
/*    */     //   2442: aload_0
/*    */     //   2443: putfield L$0 : Ljava/lang/Object;
/*    */     //   2446: aload #35
/*    */     //   2448: aload_1
/*    */     //   2449: putfield L$1 : Ljava/lang/Object;
/*    */     //   2452: aload #35
/*    */     //   2454: aload_3
/*    */     //   2455: putfield L$2 : Ljava/lang/Object;
/*    */     //   2458: aload #35
/*    */     //   2460: aload #4
/*    */     //   2462: putfield L$3 : Ljava/lang/Object;
/*    */     //   2465: aload #35
/*    */     //   2467: aload #7
/*    */     //   2469: putfield L$4 : Ljava/lang/Object;
/*    */     //   2472: aload #35
/*    */     //   2474: aload #8
/*    */     //   2476: putfield L$5 : Ljava/lang/Object;
/*    */     //   2479: aload #35
/*    */     //   2481: aload #12
/*    */     //   2483: putfield L$6 : Ljava/lang/Object;
/*    */     //   2486: aload #35
/*    */     //   2488: aload #13
/*    */     //   2490: putfield L$7 : Ljava/lang/Object;
/*    */     //   2493: aload #35
/*    */     //   2495: aload #19
/*    */     //   2497: putfield L$8 : Ljava/lang/Object;
/*    */     //   2500: aload #35
/*    */     //   2502: aload #20
/*    */     //   2504: putfield L$9 : Ljava/lang/Object;
/*    */     //   2507: aload #35
/*    */     //   2509: aload #21
/*    */     //   2511: putfield L$10 : Ljava/lang/Object;
/*    */     //   2514: aload #35
/*    */     //   2516: iload #10
/*    */     //   2518: putfield I$0 : I
/*    */     //   2521: aload #35
/*    */     //   2523: iload #11
/*    */     //   2525: putfield I$1 : I
/*    */     //   2528: aload #35
/*    */     //   2530: iload #15
/*    */     //   2532: putfield Z$0 : Z
/*    */     //   2535: aload #35
/*    */     //   2537: iload #16
/*    */     //   2539: putfield I$2 : I
/*    */     //   2542: aload #35
/*    */     //   2544: iload #17
/*    */     //   2546: putfield I$3 : I
/*    */     //   2549: aload #35
/*    */     //   2551: iload #18
/*    */     //   2553: putfield I$4 : I
/*    */     //   2556: aload #35
/*    */     //   2558: bipush #9
/*    */     //   2560: putfield label : I
/*    */     //   2563: invokeinterface handle : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   2568: dup
/*    */     //   2569: aload #36
/*    */     //   2571: if_acmpne -> 2733
/*    */     //   2574: aload #36
/*    */     //   2576: areturn
/*    */     //   2577: aload #35
/*    */     //   2579: getfield I$4 : I
/*    */     //   2582: istore #18
/*    */     //   2584: aload #35
/*    */     //   2586: getfield I$3 : I
/*    */     //   2589: istore #17
/*    */     //   2591: aload #35
/*    */     //   2593: getfield I$2 : I
/*    */     //   2596: istore #16
/*    */     //   2598: aload #35
/*    */     //   2600: getfield Z$0 : Z
/*    */     //   2603: istore #15
/*    */     //   2605: aload #35
/*    */     //   2607: getfield I$1 : I
/*    */     //   2610: istore #11
/*    */     //   2612: aload #35
/*    */     //   2614: getfield I$0 : I
/*    */     //   2617: istore #10
/*    */     //   2619: aload #35
/*    */     //   2621: getfield L$10 : Ljava/lang/Object;
/*    */     //   2624: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolUse
/*    */     //   2627: astore #21
/*    */     //   2629: aload #35
/*    */     //   2631: getfield L$9 : Ljava/lang/Object;
/*    */     //   2634: checkcast java/util/Iterator
/*    */     //   2637: astore #20
/*    */     //   2639: aload #35
/*    */     //   2641: getfield L$8 : Ljava/lang/Object;
/*    */     //   2644: checkcast java/util/List
/*    */     //   2647: astore #19
/*    */     //   2649: aload #35
/*    */     //   2651: getfield L$7 : Ljava/lang/Object;
/*    */     //   2654: checkcast com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*    */     //   2657: astore #13
/*    */     //   2659: aload #35
/*    */     //   2661: getfield L$6 : Ljava/lang/Object;
/*    */     //   2664: checkcast java/lang/String
/*    */     //   2667: astore #12
/*    */     //   2669: aload #35
/*    */     //   2671: getfield L$5 : Ljava/lang/Object;
/*    */     //   2674: checkcast java/util/Map
/*    */     //   2677: astore #8
/*    */     //   2679: aload #35
/*    */     //   2681: getfield L$4 : Ljava/lang/Object;
/*    */     //   2684: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   2687: astore #7
/*    */     //   2689: aload #35
/*    */     //   2691: getfield L$3 : Ljava/lang/Object;
/*    */     //   2694: checkcast java/lang/String
/*    */     //   2697: astore #4
/*    */     //   2699: aload #35
/*    */     //   2701: getfield L$2 : Ljava/lang/Object;
/*    */     //   2704: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   2707: astore_3
/*    */     //   2708: aload #35
/*    */     //   2710: getfield L$1 : Ljava/lang/Object;
/*    */     //   2713: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   2716: astore_1
/*    */     //   2717: aload #35
/*    */     //   2719: getfield L$0 : Ljava/lang/Object;
/*    */     //   2722: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   2725: astore_0
/*    */     //   2726: aload #34
/*    */     //   2728: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   2731: aload #34
/*    */     //   2733: checkcast com/intellij/ml/llm/matterhorn/requests/builder/ToolResult
/*    */     //   2736: dup
/*    */     //   2737: ifnonnull -> 2757
/*    */     //   2740: pop
/*    */     //   2741: new com/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Error
/*    */     //   2744: dup
/*    */     //   2745: ldc_w 'Tool is not supported'
/*    */     //   2748: aconst_null
/*    */     //   2749: iconst_2
/*    */     //   2750: aconst_null
/*    */     //   2751: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   2754: checkcast com/intellij/ml/llm/matterhorn/requests/builder/ToolResult
/*    */     //   2757: astore #23
/*    */     //   2759: aconst_null
/*    */     //   2760: astore #24
/*    */     //   2762: iconst_0
/*    */     //   2763: istore #25
/*    */     //   2765: aload #23
/*    */     //   2767: astore #26
/*    */     //   2769: aload #26
/*    */     //   2771: instanceof com/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Ok
/*    */     //   2774: ifeq -> 2790
/*    */     //   2777: aload #23
/*    */     //   2779: checkcast com/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Ok
/*    */     //   2782: invokevirtual getImage : ()Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;
/*    */     //   2785: astore #24
/*    */     //   2787: goto -> 2842
/*    */     //   2790: aload #26
/*    */     //   2792: instanceof com/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Error
/*    */     //   2795: ifeq -> 2817
/*    */     //   2798: aload #23
/*    */     //   2800: checkcast com/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Error
/*    */     //   2803: invokevirtual getImage : ()Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;
/*    */     //   2806: astore #24
/*    */     //   2808: iconst_1
/*    */     //   2809: istore #17
/*    */     //   2811: iconst_1
/*    */     //   2812: istore #25
/*    */     //   2814: goto -> 2842
/*    */     //   2817: aload #26
/*    */     //   2819: instanceof com/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Finish
/*    */     //   2822: ifeq -> 2834
/*    */     //   2825: aconst_null
/*    */     //   2826: astore #24
/*    */     //   2828: iconst_1
/*    */     //   2829: istore #18
/*    */     //   2831: goto -> 2842
/*    */     //   2834: new kotlin/NoWhenBranchMatchedException
/*    */     //   2837: dup
/*    */     //   2838: invokespecial <init> : ()V
/*    */     //   2841: athrow
/*    */     //   2842: aload #23
/*    */     //   2844: invokeinterface getMessage : ()Ljava/lang/String;
/*    */     //   2849: astore #26
/*    */     //   2851: aload #24
/*    */     //   2853: dup
/*    */     //   2854: ifnull -> 2916
/*    */     //   2857: pop
/*    */     //   2858: iconst_0
/*    */     //   2859: istore #30
/*    */     //   2861: getstatic com/intellij/ml/llm/matterhorn/helpers/ImageContentHelper.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/ImageContentHelper;
/*    */     //   2864: aload #24
/*    */     //   2866: invokevirtual getContentType : ()Lio/ktor/http/ContentType;
/*    */     //   2869: aload #24
/*    */     //   2871: invokevirtual getContent : ()[B
/*    */     //   2874: aload_0
/*    */     //   2875: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   2878: invokevirtual adjustImageData : (Lio/ktor/http/ContentType;[BLcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)[B
/*    */     //   2881: dup
/*    */     //   2882: ifnull -> 2909
/*    */     //   2885: astore #31
/*    */     //   2887: iconst_0
/*    */     //   2888: istore #32
/*    */     //   2890: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart.Companion : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart$Companion;
/*    */     //   2893: aload #24
/*    */     //   2895: invokevirtual getContentType : ()Lio/ktor/http/ContentType;
/*    */     //   2898: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   2901: aload #31
/*    */     //   2903: invokevirtual fromBytes : (Ljava/lang/String;[B)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;
/*    */     //   2906: goto -> 2911
/*    */     //   2909: pop
/*    */     //   2910: aconst_null
/*    */     //   2911: nop
/*    */     //   2912: nop
/*    */     //   2913: goto -> 2918
/*    */     //   2916: pop
/*    */     //   2917: aconst_null
/*    */     //   2918: astore #27
/*    */     //   2920: aload #26
/*    */     //   2922: ifnonnull -> 2930
/*    */     //   2925: aload #27
/*    */     //   2927: ifnull -> 2936
/*    */     //   2930: iconst_1
/*    */     //   2931: istore #16
/*    */     //   2933: goto -> 2941
/*    */     //   2936: ldc_w 'Done'
/*    */     //   2939: astore #26
/*    */     //   2941: aload #19
/*    */     //   2943: new com/intellij/ml/llm/matterhorn/llm/MatterhornToolResult
/*    */     //   2946: dup
/*    */     //   2947: aload #21
/*    */     //   2949: invokevirtual getId : ()Ljava/lang/String;
/*    */     //   2952: aload #26
/*    */     //   2954: dup
/*    */     //   2955: ifnonnull -> 2962
/*    */     //   2958: pop
/*    */     //   2959: ldc_w ''
/*    */     //   2962: iload #25
/*    */     //   2964: ifeq -> 2971
/*    */     //   2967: iconst_1
/*    */     //   2968: goto -> 2972
/*    */     //   2971: iconst_0
/*    */     //   2972: aload #27
/*    */     //   2974: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;)V
/*    */     //   2977: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   2982: pop
/*    */     //   2983: goto -> 2391
/*    */     //   2986: new com/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult
/*    */     //   2989: dup
/*    */     //   2990: invokespecial <init> : ()V
/*    */     //   2993: astore #20
/*    */     //   2995: iload #15
/*    */     //   2997: ifeq -> 3438
/*    */     //   3000: aload_0
/*    */     //   3001: aload #12
/*    */     //   3003: invokespecial formatAnswer : (Ljava/lang/String;)Lkotlin/Pair;
/*    */     //   3006: astore #21
/*    */     //   3008: aload #21
/*    */     //   3010: invokevirtual component1 : ()Ljava/lang/Object;
/*    */     //   3013: checkcast java/lang/String
/*    */     //   3016: astore #22
/*    */     //   3018: aload #21
/*    */     //   3020: invokevirtual component2 : ()Ljava/lang/Object;
/*    */     //   3023: checkcast com/intellij/ml/llm/matterhorn/requests/ReviewResult
/*    */     //   3026: astore #23
/*    */     //   3028: aload #23
/*    */     //   3030: instanceof com/intellij/ml/llm/matterhorn/requests/ReviewResult$Success
/*    */     //   3033: ifeq -> 3410
/*    */     //   3036: aload_0
/*    */     //   3037: getfield handlers : Ljava/util/List;
/*    */     //   3040: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   3045: astore #24
/*    */     //   3047: aload #24
/*    */     //   3049: invokeinterface hasNext : ()Z
/*    */     //   3054: ifeq -> 3404
/*    */     //   3057: aload #24
/*    */     //   3059: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   3064: checkcast com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler
/*    */     //   3067: astore #25
/*    */     //   3069: aload #25
/*    */     //   3071: aload #13
/*    */     //   3073: new com/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer
/*    */     //   3076: dup
/*    */     //   3077: aload #22
/*    */     //   3079: aload #19
/*    */     //   3081: checkcast java/util/Collection
/*    */     //   3084: invokeinterface isEmpty : ()Z
/*    */     //   3089: ifne -> 3096
/*    */     //   3092: iconst_1
/*    */     //   3093: goto -> 3097
/*    */     //   3096: iconst_0
/*    */     //   3097: invokespecial <init> : (Ljava/lang/String;Z)V
/*    */     //   3100: aload #20
/*    */     //   3102: aload #35
/*    */     //   3104: aload #35
/*    */     //   3106: aload_0
/*    */     //   3107: putfield L$0 : Ljava/lang/Object;
/*    */     //   3110: aload #35
/*    */     //   3112: aload_1
/*    */     //   3113: putfield L$1 : Ljava/lang/Object;
/*    */     //   3116: aload #35
/*    */     //   3118: aload_3
/*    */     //   3119: putfield L$2 : Ljava/lang/Object;
/*    */     //   3122: aload #35
/*    */     //   3124: aload #4
/*    */     //   3126: putfield L$3 : Ljava/lang/Object;
/*    */     //   3129: aload #35
/*    */     //   3131: aload #7
/*    */     //   3133: putfield L$4 : Ljava/lang/Object;
/*    */     //   3136: aload #35
/*    */     //   3138: aload #8
/*    */     //   3140: putfield L$5 : Ljava/lang/Object;
/*    */     //   3143: aload #35
/*    */     //   3145: aload #12
/*    */     //   3147: putfield L$6 : Ljava/lang/Object;
/*    */     //   3150: aload #35
/*    */     //   3152: aload #13
/*    */     //   3154: putfield L$7 : Ljava/lang/Object;
/*    */     //   3157: aload #35
/*    */     //   3159: aload #19
/*    */     //   3161: putfield L$8 : Ljava/lang/Object;
/*    */     //   3164: aload #35
/*    */     //   3166: aload #20
/*    */     //   3168: putfield L$9 : Ljava/lang/Object;
/*    */     //   3171: aload #35
/*    */     //   3173: aload #22
/*    */     //   3175: putfield L$10 : Ljava/lang/Object;
/*    */     //   3178: aload #35
/*    */     //   3180: aload #24
/*    */     //   3182: putfield L$11 : Ljava/lang/Object;
/*    */     //   3185: aload #35
/*    */     //   3187: iload #10
/*    */     //   3189: putfield I$0 : I
/*    */     //   3192: aload #35
/*    */     //   3194: iload #11
/*    */     //   3196: putfield I$1 : I
/*    */     //   3199: aload #35
/*    */     //   3201: iload #16
/*    */     //   3203: putfield I$2 : I
/*    */     //   3206: aload #35
/*    */     //   3208: iload #17
/*    */     //   3210: putfield I$3 : I
/*    */     //   3213: aload #35
/*    */     //   3215: iload #18
/*    */     //   3217: putfield I$4 : I
/*    */     //   3220: aload #35
/*    */     //   3222: bipush #10
/*    */     //   3224: putfield label : I
/*    */     //   3227: invokeinterface handle : (Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   3232: dup
/*    */     //   3233: aload #36
/*    */     //   3235: if_acmpne -> 3400
/*    */     //   3238: aload #36
/*    */     //   3240: areturn
/*    */     //   3241: aload #35
/*    */     //   3243: getfield I$4 : I
/*    */     //   3246: istore #18
/*    */     //   3248: aload #35
/*    */     //   3250: getfield I$3 : I
/*    */     //   3253: istore #17
/*    */     //   3255: aload #35
/*    */     //   3257: getfield I$2 : I
/*    */     //   3260: istore #16
/*    */     //   3262: aload #35
/*    */     //   3264: getfield I$1 : I
/*    */     //   3267: istore #11
/*    */     //   3269: aload #35
/*    */     //   3271: getfield I$0 : I
/*    */     //   3274: istore #10
/*    */     //   3276: aload #35
/*    */     //   3278: getfield L$11 : Ljava/lang/Object;
/*    */     //   3281: checkcast java/util/Iterator
/*    */     //   3284: astore #24
/*    */     //   3286: aload #35
/*    */     //   3288: getfield L$10 : Ljava/lang/Object;
/*    */     //   3291: checkcast java/lang/String
/*    */     //   3294: astore #22
/*    */     //   3296: aload #35
/*    */     //   3298: getfield L$9 : Ljava/lang/Object;
/*    */     //   3301: checkcast com/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult
/*    */     //   3304: astore #20
/*    */     //   3306: aload #35
/*    */     //   3308: getfield L$8 : Ljava/lang/Object;
/*    */     //   3311: checkcast java/util/List
/*    */     //   3314: astore #19
/*    */     //   3316: aload #35
/*    */     //   3318: getfield L$7 : Ljava/lang/Object;
/*    */     //   3321: checkcast com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*    */     //   3324: astore #13
/*    */     //   3326: aload #35
/*    */     //   3328: getfield L$6 : Ljava/lang/Object;
/*    */     //   3331: checkcast java/lang/String
/*    */     //   3334: astore #12
/*    */     //   3336: aload #35
/*    */     //   3338: getfield L$5 : Ljava/lang/Object;
/*    */     //   3341: checkcast java/util/Map
/*    */     //   3344: astore #8
/*    */     //   3346: aload #35
/*    */     //   3348: getfield L$4 : Ljava/lang/Object;
/*    */     //   3351: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   3354: astore #7
/*    */     //   3356: aload #35
/*    */     //   3358: getfield L$3 : Ljava/lang/Object;
/*    */     //   3361: checkcast java/lang/String
/*    */     //   3364: astore #4
/*    */     //   3366: aload #35
/*    */     //   3368: getfield L$2 : Ljava/lang/Object;
/*    */     //   3371: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   3374: astore_3
/*    */     //   3375: aload #35
/*    */     //   3377: getfield L$1 : Ljava/lang/Object;
/*    */     //   3380: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   3383: astore_1
/*    */     //   3384: aload #35
/*    */     //   3386: getfield L$0 : Ljava/lang/Object;
/*    */     //   3389: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   3392: astore_0
/*    */     //   3393: aload #34
/*    */     //   3395: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   3398: aload #34
/*    */     //   3400: pop
/*    */     //   3401: goto -> 3047
/*    */     //   3404: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   3407: goto -> 3459
/*    */     //   3410: aload #20
/*    */     //   3412: new com/intellij/ml/llm/matterhorn/requests/builder/TextContent
/*    */     //   3415: dup
/*    */     //   3416: aload #23
/*    */     //   3418: invokeinterface getMessage : ()Ljava/lang/String;
/*    */     //   3423: aconst_null
/*    */     //   3424: iconst_2
/*    */     //   3425: aconst_null
/*    */     //   3426: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   3429: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content
/*    */     //   3432: invokevirtual addFailedReviewContent : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;)Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*    */     //   3435: goto -> 3459
/*    */     //   3438: aload #20
/*    */     //   3440: new com/intellij/ml/llm/matterhorn/requests/builder/TextContent
/*    */     //   3443: dup
/*    */     //   3444: ldc_w 'The answer is incomplete or malformed.'
/*    */     //   3447: aconst_null
/*    */     //   3448: iconst_2
/*    */     //   3449: aconst_null
/*    */     //   3450: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   3453: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content
/*    */     //   3456: invokevirtual addFailedReviewContent : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;)Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*    */     //   3459: pop
/*    */     //   3460: aload #20
/*    */     //   3462: invokevirtual isReviewFailed : ()Z
/*    */     //   3465: ifne -> 3473
/*    */     //   3468: iload #17
/*    */     //   3470: ifeq -> 3479
/*    */     //   3473: iinc #10, 1
/*    */     //   3476: goto -> 3515
/*    */     //   3479: aload #20
/*    */     //   3481: invokevirtual getContents : ()Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;
/*    */     //   3484: invokevirtual isEmpty : ()Z
/*    */     //   3487: ifeq -> 3515
/*    */     //   3490: iload #16
/*    */     //   3492: ifne -> 3515
/*    */     //   3495: aload_0
/*    */     //   3496: getfield toolChoice : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;
/*    */     //   3499: invokeinterface getAllowMultiple : ()Z
/*    */     //   3504: ifeq -> 3512
/*    */     //   3507: iload #18
/*    */     //   3509: ifeq -> 3515
/*    */     //   3512: aload #7
/*    */     //   3514: areturn
/*    */     //   3515: aload_0
/*    */     //   3516: aload_1
/*    */     //   3517: aload #20
/*    */     //   3519: invokevirtual getContents : ()Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;
/*    */     //   3522: checkcast java/util/List
/*    */     //   3525: aload #19
/*    */     //   3527: aload #35
/*    */     //   3529: aload #35
/*    */     //   3531: aload_0
/*    */     //   3532: putfield L$0 : Ljava/lang/Object;
/*    */     //   3535: aload #35
/*    */     //   3537: aload_1
/*    */     //   3538: putfield L$1 : Ljava/lang/Object;
/*    */     //   3541: aload #35
/*    */     //   3543: aload_3
/*    */     //   3544: putfield L$2 : Ljava/lang/Object;
/*    */     //   3547: aload #35
/*    */     //   3549: aload #4
/*    */     //   3551: putfield L$3 : Ljava/lang/Object;
/*    */     //   3554: aload #35
/*    */     //   3556: aload #7
/*    */     //   3558: putfield L$4 : Ljava/lang/Object;
/*    */     //   3561: aload #35
/*    */     //   3563: aload #8
/*    */     //   3565: putfield L$5 : Ljava/lang/Object;
/*    */     //   3568: aload #35
/*    */     //   3570: aload #12
/*    */     //   3572: putfield L$6 : Ljava/lang/Object;
/*    */     //   3575: aload #35
/*    */     //   3577: aload #13
/*    */     //   3579: putfield L$7 : Ljava/lang/Object;
/*    */     //   3582: aload #35
/*    */     //   3584: aconst_null
/*    */     //   3585: putfield L$8 : Ljava/lang/Object;
/*    */     //   3588: aload #35
/*    */     //   3590: aconst_null
/*    */     //   3591: putfield L$9 : Ljava/lang/Object;
/*    */     //   3594: aload #35
/*    */     //   3596: aconst_null
/*    */     //   3597: putfield L$10 : Ljava/lang/Object;
/*    */     //   3600: aload #35
/*    */     //   3602: aconst_null
/*    */     //   3603: putfield L$11 : Ljava/lang/Object;
/*    */     //   3606: aload #35
/*    */     //   3608: iload #10
/*    */     //   3610: putfield I$0 : I
/*    */     //   3613: aload #35
/*    */     //   3615: iload #11
/*    */     //   3617: putfield I$1 : I
/*    */     //   3620: aload #35
/*    */     //   3622: bipush #11
/*    */     //   3624: putfield label : I
/*    */     //   3627: invokespecial buildUserMessage : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   3630: dup
/*    */     //   3631: aload #36
/*    */     //   3633: if_acmpne -> 3737
/*    */     //   3636: aload #36
/*    */     //   3638: areturn
/*    */     //   3639: aload #35
/*    */     //   3641: getfield I$1 : I
/*    */     //   3644: istore #11
/*    */     //   3646: aload #35
/*    */     //   3648: getfield I$0 : I
/*    */     //   3651: istore #10
/*    */     //   3653: aload #35
/*    */     //   3655: getfield L$7 : Ljava/lang/Object;
/*    */     //   3658: checkcast com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*    */     //   3661: astore #13
/*    */     //   3663: aload #35
/*    */     //   3665: getfield L$6 : Ljava/lang/Object;
/*    */     //   3668: checkcast java/lang/String
/*    */     //   3671: astore #12
/*    */     //   3673: aload #35
/*    */     //   3675: getfield L$5 : Ljava/lang/Object;
/*    */     //   3678: checkcast java/util/Map
/*    */     //   3681: astore #8
/*    */     //   3683: aload #35
/*    */     //   3685: getfield L$4 : Ljava/lang/Object;
/*    */     //   3688: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   3691: astore #7
/*    */     //   3693: aload #35
/*    */     //   3695: getfield L$3 : Ljava/lang/Object;
/*    */     //   3698: checkcast java/lang/String
/*    */     //   3701: astore #4
/*    */     //   3703: aload #35
/*    */     //   3705: getfield L$2 : Ljava/lang/Object;
/*    */     //   3708: checkcast com/intellij/ml/llm/matterhorn/llm/ModelCapabilities
/*    */     //   3711: astore_3
/*    */     //   3712: aload #35
/*    */     //   3714: getfield L$1 : Ljava/lang/Object;
/*    */     //   3717: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   3720: astore_1
/*    */     //   3721: aload #35
/*    */     //   3723: getfield L$0 : Ljava/lang/Object;
/*    */     //   3726: checkcast com/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl
/*    */     //   3729: astore_0
/*    */     //   3730: aload #34
/*    */     //   3732: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   3735: aload #34
/*    */     //   3737: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   3740: astore #9
/*    */     //   3742: goto -> 908
/*    */     //   3745: new com/intellij/ml/llm/matterhorn/TooManyAttemptsWithoutSuccessException
/*    */     //   3748: dup
/*    */     //   3749: aload_0
/*    */     //   3750: getfield maxRetries : I
/*    */     //   3753: aload #9
/*    */     //   3755: <illegal opcode> makeConcatWithConstants : (ILcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Ljava/lang/String;
/*    */     //   3760: aconst_null
/*    */     //   3761: iconst_2
/*    */     //   3762: aconst_null
/*    */     //   3763: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   3766: athrow
/*    */     //   3767: new java/lang/IllegalStateException
/*    */     //   3770: dup
/*    */     //   3771: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   3773: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   3776: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #106	-> 60
/*    */     //   #107	-> 133
/*    */     //   #108	-> 144
/*    */     //   #106	-> 184
/*    */     //   #110	-> 221
/*    */     //   #111	-> 236
/*    */     //   #112	-> 280
/*    */     //   #113	-> 286
/*    */     //   #111	-> 292
/*    */     //   #117	-> 300
/*    */     //   #110	-> 301
/*    */     //   #119	-> 303
/*    */     //   #106	-> 351
/*    */     //   #119	-> 398
/*    */     //   #120	-> 424
/*    */     //   #121	-> 441
/*    */     //   #106	-> 502
/*    */     //   #123	-> 569
/*    */     //   #124	-> 594
/*    */     //   #254	-> 603
/*    */     //   #255	-> 632
/*    */     //   #256	-> 647
/*    */     //   #257	-> 675
/*    */     //   #124	-> 689
/*    */     //   #257	-> 705
/*    */     //   #255	-> 719
/*    */     //   #257	-> 734
/*    */     //   #259	-> 743
/*    */     //   #255	-> 745
/*    */     //   #254	-> 746
/*    */     //   #124	-> 747
/*    */     //   #125	-> 749
/*    */     //   #106	-> 814
/*    */     //   #127	-> 886
/*    */     //   #128	-> 889
/*    */     //   #129	-> 892
/*    */     //   #130	-> 895
/*    */     //   #131	-> 908
/*    */     //   #132	-> 917
/*    */     //   #133	-> 922
/*    */     //   #134	-> 935
/*    */     //   #135	-> 954
/*    */     //   #136	-> 973
/*    */     //   #133	-> 974
/*    */     //   #139	-> 976
/*    */     //   #106	-> 1073
/*    */     //   #140	-> 1184
/*    */     //   #141	-> 1190
/*    */     //   #143	-> 1211
/*    */     //   #140	-> 1218
/*    */     //   #146	-> 1220
/*    */     //   #147	-> 1225
/*    */     //   #148	-> 1226
/*    */     //   #149	-> 1228
/*    */     //   #150	-> 1229
/*    */     //   #147	-> 1251
/*    */     //   #106	-> 1338
/*    */     //   #152	-> 1424
/*    */     //   #155	-> 1431
/*    */     //   #158	-> 1434
/*    */     //   #106	-> 1532
/*    */     //   #158	-> 1633
/*    */     //   #159	-> 1647
/*    */     //   #260	-> 1654
/*    */     //   #261	-> 1658
/*    */     //   #161	-> 1689
/*    */     //   #161	-> 1700
/*    */     //   #162	-> 1702
/*    */     //   #163	-> 1709
/*    */     //   #164	-> 1714
/*    */     //   #261	-> 1724
/*    */     //   #262	-> 1736
/*    */     //   #161	-> 1764
/*    */     //   #161	-> 1775
/*    */     //   #162	-> 1777
/*    */     //   #163	-> 1784
/*    */     //   #164	-> 1789
/*    */     //   #262	-> 1794
/*    */     //   #263	-> 1809
/*    */     //   #161	-> 1840
/*    */     //   #161	-> 1851
/*    */     //   #162	-> 1853
/*    */     //   #163	-> 1860
/*    */     //   #164	-> 1865
/*    */     //   #263	-> 1875
/*    */     //   #264	-> 1886
/*    */     //   #265	-> 1894
/*    */     //   #266	-> 1894
/*    */     //   #265	-> 1899
/*    */     //   #266	-> 1907
/*    */     //   #265	-> 1924
/*    */     //   #266	-> 1936
/*    */     //   #161	-> 1991
/*    */     //   #161	-> 2002
/*    */     //   #162	-> 2004
/*    */     //   #163	-> 2011
/*    */     //   #164	-> 2016
/*    */     //   #266	-> 2028
/*    */     //   #260	-> 2046
/*    */     //   #165	-> 2054
/*    */     //   #158	-> 2055
/*    */     //   #158	-> 2056
/*    */     //   #168	-> 2058
/*    */     //   #106	-> 2149
/*    */     //   #171	-> 2255
/*    */     //   #172	-> 2287
/*    */     //   #174	-> 2306
/*    */     //   #176	-> 2338
/*    */     //   #177	-> 2341
/*    */     //   #179	-> 2344
/*    */     //   #181	-> 2347
/*    */     //   #182	-> 2350
/*    */     //   #183	-> 2353
/*    */     //   #184	-> 2356
/*    */     //   #184	-> 2366
/*    */     //   #186	-> 2368
/*    */     //   #187	-> 2376
/*    */     //   #188	-> 2413
/*    */     //   #189	-> 2430
/*    */     //   #106	-> 2574
/*    */     //   #189	-> 2733
/*    */     //   #191	-> 2759
/*    */     //   #192	-> 2762
/*    */     //   #193	-> 2765
/*    */     //   #194	-> 2769
/*    */     //   #195	-> 2777
/*    */     //   #197	-> 2790
/*    */     //   #198	-> 2798
/*    */     //   #199	-> 2808
/*    */     //   #200	-> 2811
/*    */     //   #202	-> 2817
/*    */     //   #203	-> 2825
/*    */     //   #204	-> 2828
/*    */     //   #193	-> 2834
/*    */     //   #208	-> 2842
/*    */     //   #209	-> 2851
/*    */     //   #210	-> 2861
/*    */     //   #211	-> 2890
/*    */     //   #210	-> 2906
/*    */     //   #210	-> 2909
/*    */     //   #212	-> 2911
/*    */     //   #209	-> 2912
/*    */     //   #209	-> 2916
/*    */     //   #215	-> 2920
/*    */     //   #216	-> 2930
/*    */     //   #218	-> 2936
/*    */     //   #220	-> 2941
/*    */     //   #224	-> 2986
/*    */     //   #225	-> 2995
/*    */     //   #226	-> 3000
/*    */     //   #227	-> 3028
/*    */     //   #228	-> 3036
/*    */     //   #229	-> 3069
/*    */     //   #229	-> 3097
/*    */     //   #106	-> 3238
/*    */     //   #229	-> 3400
/*    */     //   #233	-> 3410
/*    */     //   #236	-> 3438
/*    */     //   #238	-> 3460
/*    */     //   #239	-> 3473
/*    */     //   #240	-> 3479
/*    */     //   #241	-> 3512
/*    */     //   #243	-> 3515
/*    */     //   #106	-> 3636
/*    */     //   #243	-> 3737
/*    */     //   #246	-> 3745
/*    */     //   #106	-> 3767
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   133	54	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   214	78	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   300	54	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   391	114	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   562	255	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   874	202	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   1177	164	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   1412	123	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   1626	88	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   1714	75	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   1789	76	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   1865	151	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2016	30	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2054	1	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2055	97	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2243	101	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2344	22	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2366	211	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2726	108	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2842	70	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2912	1	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   2913	328	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   3393	119	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   3515	124	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   3730	37	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/GrazieRequestImpl;
/*    */     //   133	54	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   205	87	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   300	54	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   382	123	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   553	264	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   865	211	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1168	173	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1403	132	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1617	97	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1714	75	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1789	76	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1865	151	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2016	30	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2054	1	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2055	97	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2234	110	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2344	22	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2366	211	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2717	117	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2842	70	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2912	1	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   2913	328	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   3384	128	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   3515	124	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   3721	46	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   144	43	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   196	96	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   300	54	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   373	132	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   544	273	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   856	220	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   1159	182	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   1394	141	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   1608	106	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   1714	75	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   1789	76	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   1865	151	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2016	30	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2054	1	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2055	97	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2225	119	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2344	22	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2366	211	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2708	126	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2842	70	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2912	1	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   2913	328	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   3375	137	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   3515	124	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   3712	55	3	caps	Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;
/*    */     //   303	51	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   364	141	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   535	282	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   847	229	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   1150	191	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   1385	150	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   1599	115	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   1714	75	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   1789	76	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   1865	151	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2016	30	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2054	1	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2055	97	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2216	128	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2344	22	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2366	211	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2699	135	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2842	70	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2912	1	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   2913	328	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   3366	146	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   3515	124	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   3703	64	4	assistantAnswerPrefix	Ljava/lang/String;
/*    */     //   424	81	5	systemMsg	Ljava/lang/String;
/*    */     //   525	69	5	systemMsg	Ljava/lang/String;
/*    */     //   441	64	6	tools	Ljava/util/List;
/*    */     //   515	79	6	tools	Ljava/util/List;
/*    */     //   594	223	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   837	239	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1140	71	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1211	7	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1220	8	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1424	111	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1589	125	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1714	75	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1789	76	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1865	151	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2016	30	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2054	1	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2055	1	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2056	87	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2255	89	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2344	22	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2366	211	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2689	145	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2842	70	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2912	1	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   2913	328	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   3356	159	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   3515	124	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   3693	74	7	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   749	68	8	toolHandlers	Ljava/util/Map;
/*    */     //   827	249	8	toolHandlers	Ljava/util/Map;
/*    */     //   1130	211	8	toolHandlers	Ljava/util/Map;
/*    */     //   1375	160	8	toolHandlers	Ljava/util/Map;
/*    */     //   1579	135	8	toolHandlers	Ljava/util/Map;
/*    */     //   1714	75	8	toolHandlers	Ljava/util/Map;
/*    */     //   1789	76	8	toolHandlers	Ljava/util/Map;
/*    */     //   1865	151	8	toolHandlers	Ljava/util/Map;
/*    */     //   2016	30	8	toolHandlers	Ljava/util/Map;
/*    */     //   2054	1	8	toolHandlers	Ljava/util/Map;
/*    */     //   2055	97	8	toolHandlers	Ljava/util/Map;
/*    */     //   2206	138	8	toolHandlers	Ljava/util/Map;
/*    */     //   2344	22	8	toolHandlers	Ljava/util/Map;
/*    */     //   2366	211	8	toolHandlers	Ljava/util/Map;
/*    */     //   2679	155	8	toolHandlers	Ljava/util/Map;
/*    */     //   2842	70	8	toolHandlers	Ljava/util/Map;
/*    */     //   2912	1	8	toolHandlers	Ljava/util/Map;
/*    */     //   2913	328	8	toolHandlers	Ljava/util/Map;
/*    */     //   3346	166	8	toolHandlers	Ljava/util/Map;
/*    */     //   3515	124	8	toolHandlers	Ljava/util/Map;
/*    */     //   3683	84	8	toolHandlers	Ljava/util/Map;
/*    */     //   600	29	9	$this$mapKeys$iv	Ljava/util/Map;
/*    */     //   886	190	9	userMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1120	91	9	userMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1211	7	9	userMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   2341	3	9	userMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   3742	25	9	userMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   889	187	10	retries	I
/*    */     //   1090	251	10	retries	I
/*    */     //   1355	180	10	retries	I
/*    */     //   1549	165	10	retries	I
/*    */     //   1714	75	10	retries	I
/*    */     //   1789	76	10	retries	I
/*    */     //   1865	151	10	retries	I
/*    */     //   2016	30	10	retries	I
/*    */     //   2054	1	10	retries	I
/*    */     //   2055	97	10	retries	I
/*    */     //   2166	178	10	retries	I
/*    */     //   2344	22	10	retries	I
/*    */     //   2366	211	10	retries	I
/*    */     //   2619	215	10	retries	I
/*    */     //   2842	70	10	retries	I
/*    */     //   2912	1	10	retries	I
/*    */     //   2913	328	10	retries	I
/*    */     //   3276	236	10	retries	I
/*    */     //   3515	124	10	retries	I
/*    */     //   3653	114	10	retries	I
/*    */     //   629	15	11	$this$mapKeysTo$iv$iv	Ljava/util/Map;
/*    */     //   892	184	11	completionRequests	I
/*    */     //   1083	258	11	completionRequests	I
/*    */     //   1348	187	11	completionRequests	I
/*    */     //   1542	172	11	completionRequests	I
/*    */     //   1714	75	11	completionRequests	I
/*    */     //   1789	76	11	completionRequests	I
/*    */     //   1865	151	11	completionRequests	I
/*    */     //   2016	30	11	completionRequests	I
/*    */     //   2054	1	11	completionRequests	I
/*    */     //   2055	97	11	completionRequests	I
/*    */     //   2159	185	11	completionRequests	I
/*    */     //   2347	19	11	completionRequests	I
/*    */     //   2366	211	11	completionRequests	I
/*    */     //   2612	222	11	completionRequests	I
/*    */     //   2842	70	11	completionRequests	I
/*    */     //   2912	1	11	completionRequests	I
/*    */     //   2913	328	11	completionRequests	I
/*    */     //   3269	243	11	completionRequests	I
/*    */     //   3515	124	11	completionRequests	I
/*    */     //   3646	121	11	completionRequests	I
/*    */     //   629	117	12	destination$iv$iv	Ljava/util/Map;
/*    */     //   895	27	12	answerContent	Ljava/lang/String;
/*    */     //   1434	101	12	answerContent	Ljava/lang/String;
/*    */     //   1569	145	12	answerContent	Ljava/lang/String;
/*    */     //   1714	75	12	answerContent	Ljava/lang/String;
/*    */     //   1789	76	12	answerContent	Ljava/lang/String;
/*    */     //   1865	151	12	answerContent	Ljava/lang/String;
/*    */     //   2016	30	12	answerContent	Ljava/lang/String;
/*    */     //   2054	1	12	answerContent	Ljava/lang/String;
/*    */     //   2055	97	12	answerContent	Ljava/lang/String;
/*    */     //   2196	61	12	answerContent	Ljava/lang/String;
/*    */     //   2287	57	12	answerContent	Ljava/lang/String;
/*    */     //   2344	22	12	answerContent	Ljava/lang/String;
/*    */     //   2366	211	12	answerContent	Ljava/lang/String;
/*    */     //   2669	165	12	answerContent	Ljava/lang/String;
/*    */     //   2842	70	12	answerContent	Ljava/lang/String;
/*    */     //   2912	1	12	answerContent	Ljava/lang/String;
/*    */     //   2913	328	12	answerContent	Ljava/lang/String;
/*    */     //   3336	176	12	answerContent	Ljava/lang/String;
/*    */     //   3515	124	12	answerContent	Ljava/lang/String;
/*    */     //   3673	94	12	answerContent	Ljava/lang/String;
/*    */     //   908	168	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   1110	231	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   1365	170	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   1559	155	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   1714	75	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   1789	76	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   1865	151	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2016	30	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2054	1	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2055	97	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2186	158	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2344	22	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2366	211	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2659	175	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2842	70	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2912	1	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   2913	328	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   3326	186	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   3515	124	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   3663	104	13	requestContext	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*    */     //   644	12	14	$this$associateByTo$iv$iv$iv	Ljava/lang/Iterable;
/*    */     //   976	100	14	lastAnswerChoiceId	Ljava/lang/String;
/*    */     //   1100	111	14	lastAnswerChoiceId	Ljava/lang/String;
/*    */     //   2058	94	14	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   2176	162	14	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   2344	22	14	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   2366	25	14	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   935	19	15	lastMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   954	19	15	lastMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   2306	32	15	isComplete	Z
/*    */     //   2344	22	15	isComplete	Z
/*    */     //   2366	211	15	isComplete	Z
/*    */     //   2605	229	15	isComplete	Z
/*    */     //   2842	70	15	isComplete	Z
/*    */     //   2912	1	15	isComplete	Z
/*    */     //   2913	87	15	isComplete	Z
/*    */     //   1644	70	16	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1736	53	16	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1809	56	16	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1886	42	16	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1934	82	16	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   2350	16	16	haveToolResult	Z
/*    */     //   2366	211	16	haveToolResult	Z
/*    */     //   2598	236	16	haveToolResult	Z
/*    */     //   2842	70	16	haveToolResult	Z
/*    */     //   2912	1	16	haveToolResult	Z
/*    */     //   2913	17	16	haveToolResult	Z
/*    */     //   2936	305	16	haveToolResult	Z
/*    */     //   3262	211	16	haveToolResult	Z
/*    */     //   3479	33	16	haveToolResult	Z
/*    */     //   675	65	17	element$iv$iv$iv	Ljava/lang/Object;
/*    */     //   2353	13	17	anyToolFailed	Z
/*    */     //   2366	211	17	anyToolFailed	Z
/*    */     //   2591	207	17	anyToolFailed	Z
/*    */     //   2811	23	17	anyToolFailed	Z
/*    */     //   2842	70	17	anyToolFailed	Z
/*    */     //   2912	1	17	anyToolFailed	Z
/*    */     //   2913	328	17	anyToolFailed	Z
/*    */     //   3255	218	17	anyToolFailed	Z
/*    */     //   686	16	18	it	Ljava/util/Map$Entry;
/*    */     //   2356	10	18	anyToolFinished	Z
/*    */     //   2366	211	18	anyToolFinished	Z
/*    */     //   2584	233	18	anyToolFinished	Z
/*    */     //   2842	70	18	anyToolFinished	Z
/*    */     //   2912	1	18	anyToolFinished	Z
/*    */     //   2913	328	18	anyToolFinished	Z
/*    */     //   3248	225	18	anyToolFinished	Z
/*    */     //   3479	33	18	anyToolFinished	Z
/*    */     //   1651	35	19	$this$transformLastTextPartContent$iv	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1736	25	19	$this$transformLastTextPartContent$iv	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1809	28	19	$this$transformLastTextPartContent$iv	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1886	48	19	$this$transformLastTextPartContent$iv	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1934	54	19	$this$transformLastTextPartContent$iv	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   2368	209	19	toolResults	Ljava/util/List;
/*    */     //   2649	185	19	toolResults	Ljava/util/List;
/*    */     //   2842	70	19	toolResults	Ljava/util/List;
/*    */     //   2912	1	19	toolResults	Ljava/util/List;
/*    */     //   2913	328	19	toolResults	Ljava/util/List;
/*    */     //   3316	196	19	toolResults	Ljava/util/List;
/*    */     //   3515	115	19	toolResults	Ljava/util/List;
/*    */     //   716	10	20	it$iv$iv	Ljava/util/Map$Entry;
/*    */     //   2995	246	20	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*    */     //   3306	206	20	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*    */     //   3515	115	20	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*    */     //   2413	164	21	usage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;
/*    */     //   2629	205	21	usage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;
/*    */     //   2842	70	21	usage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;
/*    */     //   2912	1	21	usage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;
/*    */     //   2913	41	21	usage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;
/*    */     //   1686	30	22	content	Ljava/lang/String;
/*    */     //   1761	30	22	content	Ljava/lang/String;
/*    */     //   1837	30	22	content	Ljava/lang/String;
/*    */     //   1936	110	22	lastPart$iv	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart;
/*    */     //   2430	138	22	handler	Lcom/intellij/ml/llm/matterhorn/requests/builder/MatterhornToolUsageHandler;
/*    */     //   3018	223	22	formattedAnswer	Ljava/lang/String;
/*    */     //   3296	108	22	formattedAnswer	Ljava/lang/String;
/*    */     //   2759	75	23	result	Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult;
/*    */     //   2842	9	23	result	Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult;
/*    */     //   3028	8	23	formatReviewResult	Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;
/*    */     //   3410	25	23	formatReviewResult	Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;
/*    */     //   2808	9	24	image	Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;
/*    */     //   2828	6	24	image	Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;
/*    */     //   2842	64	24	image	Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;
/*    */     //   2765	33	25	isError	Z
/*    */     //   2817	17	25	isError	Z
/*    */     //   2842	70	25	isError	Z
/*    */     //   2912	1	25	isError	Z
/*    */     //   2913	58	25	isError	Z
/*    */     //   3069	10	25	handler	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler;
/*    */     //   1702	14	26	trimmedContent	Ljava/lang/String;
/*    */     //   1777	14	26	trimmedContent	Ljava/lang/String;
/*    */     //   1853	14	26	trimmedContent	Ljava/lang/String;
/*    */     //   1988	30	26	content	Ljava/lang/String;
/*    */     //   2851	61	26	message	Ljava/lang/String;
/*    */     //   2912	1	26	message	Ljava/lang/String;
/*    */     //   2913	23	26	message	Ljava/lang/String;
/*    */     //   2941	13	26	message	Ljava/lang/String;
/*    */     //   2920	62	27	imageContent	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;
/*    */     //   2004	14	29	trimmedContent	Ljava/lang/String;
/*    */     //   2887	19	31	it	[B
/*    */     //   689	13	19	$i$a$-mapKeys-GrazieRequestImpl$execute$toolHandlers$1	I
/*    */     //   719	7	23	$i$a$-associateByTo-MapsKt__MapsKt$mapKeysTo$1$iv$iv	I
/*    */     //   647	98	15	$i$f$associateByTo	I
/*    */     //   632	114	13	$i$f$mapKeysTo	I
/*    */     //   603	144	10	$i$f$mapKeys	I
/*    */     //   1689	27	25	$i$a$-transformLastTextPartContent-GrazieRequestImpl$execute$assistantAnswer$1$1	I
/*    */     //   1764	27	25	$i$a$-transformLastTextPartContent-GrazieRequestImpl$execute$assistantAnswer$1$1	I
/*    */     //   1840	27	25	$i$a$-transformLastTextPartContent-GrazieRequestImpl$execute$assistantAnswer$1$1	I
/*    */     //   1991	27	28	$i$a$-transformLastTextPartContent-GrazieRequestImpl$execute$assistantAnswer$1$1	I
/*    */     //   1654	400	20	$i$f$transformLastTextPartContent	I
/*    */     //   1647	408	17	$i$a$-let-GrazieRequestImpl$execute$assistantAnswer$1	I
/*    */     //   2890	16	32	$i$a$-let-GrazieRequestImpl$execute$imageContent$1$1	I
/*    */     //   2861	51	30	$i$a$-let-GrazieRequestImpl$execute$imageContent$1	I
/*    */     //   0	3777	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	3717	35	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	3710	34	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GrazieRequestImpl.kt", l = {74}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"chat", "chatMessage"}, m = "addChatMessage", c = "com.intellij.ml.llm.matterhorn.requests.builder.GrazieRequestImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class GrazieRequestImpl$addChatMessage$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     GrazieRequestImpl$addChatMessage$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GrazieRequestImpl.this.addChatMessage(null, null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GrazieRequestImpl.kt", l = {36}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "context", "parts", "textPartBuilder"}, m = "buildMessageParts", c = "com.intellij.ml.llm.matterhorn.requests.builder.GrazieRequestImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class GrazieRequestImpl$buildMessageParts$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     int label;
/*    */     
/*    */     GrazieRequestImpl$buildMessageParts$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GrazieRequestImpl.this.buildMessageParts(null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GrazieRequestImpl.kt", l = {58}, i = {0}, s = {"L$0"}, n = {"toolResults"}, m = "buildUserMessage", c = "com.intellij.ml.llm.matterhorn.requests.builder.GrazieRequestImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class GrazieRequestImpl$buildUserMessage$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     GrazieRequestImpl$buildUserMessage$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GrazieRequestImpl.this.buildUserMessage(null, null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GrazieRequestImpl.kt", l = {108, 119, 121, 125, 139, 147, 158, 168, 189, 229, 243}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "I$0", "I$1", "Z$0", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"}, n = {"this", "context", "caps", "this", "context", "caps", "assistantAnswerPrefix", "this", "context", "caps", "assistantAnswerPrefix", "systemMsg", "tools", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "userMessage", "requestContext", "lastAnswerChoiceId", "retries", "completionRequests", "this", "context", "caps", "assistantAnswerPrefix", "toolHandlers", "requestContext", "retries", "completionRequests", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "answerContent", "requestContext", "retries", "completionRequests", "this", "context", "caps", "assistantAnswerPrefix", "toolHandlers", "answerContent", "requestContext", "assistantAnswer", "retries", "completionRequests", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "answerContent", "requestContext", "toolResults", "usage", "retries", "completionRequests", "isComplete", "haveToolResult", "anyToolFailed", "anyToolFinished", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "answerContent", "requestContext", "toolResults", "reviewResult", "formattedAnswer", "retries", "completionRequests", "haveToolResult", "anyToolFailed", "anyToolFinished", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "answerContent", "requestContext", "retries", "completionRequests"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.builder.GrazieRequestImpl")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class GrazieRequestImpl$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     Object L$5;
/*    */     Object L$6;
/*    */     Object L$7;
/*    */     Object L$8;
/*    */     Object L$9;
/*    */     Object L$10;
/*    */     Object L$11;
/*    */     int I$0;
/*    */     int I$1;
/*    */     int I$2;
/*    */     int I$3;
/*    */     int I$4;
/*    */     boolean Z$0;
/*    */     int label;
/*    */     
/*    */     GrazieRequestImpl$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GrazieRequestImpl.this.execute(null, (Continuation<? super MatterhornChat>)this);
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\GrazieRequestImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */