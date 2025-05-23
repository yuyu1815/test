/*    */ package com.intellij.ml.llm.matterhorn.settings;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLM;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\022\020\n\032\016\022\004\022\0020\f\022\004\022\0020\0050\013H@¢\006\002\020\rJ:\020\016\032\0020\0052\006\020\017\032\0020\0072\006\020\020\032\0020\0072\006\020\b\032\0020\t2\022\020\n\032\016\022\004\022\0020\021\022\004\022\0020\0050\013H@¢\006\002\020\022¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;", "", "<init>", "()V", "setup", "", "property", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "action", "Lkotlin/Function1;", "", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupModel", "modelNameProperty", "modelProviderProperty", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nMatterhornProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornProperties.kt\ncom/intellij/ml/llm/matterhorn/settings/PropertyUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/*    */ public final class PropertyUtils
/*    */ {
/*    */   @NotNull
/*    */   public static final PropertyUtils INSTANCE = new PropertyUtils();
/*    */   
/*    */   @Nullable
/*    */   public final Object setup(@NotNull MatterhornProperty property, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Function1 action, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/settings/PropertyUtils$setup$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/settings/PropertyUtils$setup$1
/*    */     //   13: astore #7
/*    */     //   15: aload #7
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #7
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/settings/PropertyUtils$setup$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #7
/*    */     //   53: aload #7
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #6
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #8
/*    */     //   65: aload #7
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 166, 0 -> 92, 1 -> 127
/*    */     //   92: aload #6
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_2
/*    */     //   98: aload_1
/*    */     //   99: aload #7
/*    */     //   101: aload #7
/*    */     //   103: aload_3
/*    */     //   104: putfield L$0 : Ljava/lang/Object;
/*    */     //   107: aload #7
/*    */     //   109: iconst_1
/*    */     //   110: putfield label : I
/*    */     //   113: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   118: dup
/*    */     //   119: aload #8
/*    */     //   121: if_acmpne -> 143
/*    */     //   124: aload #8
/*    */     //   126: areturn
/*    */     //   127: aload #7
/*    */     //   129: getfield L$0 : Ljava/lang/Object;
/*    */     //   132: checkcast kotlin/jvm/functions/Function1
/*    */     //   135: astore_3
/*    */     //   136: aload #6
/*    */     //   138: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   141: aload #6
/*    */     //   143: checkcast java/lang/String
/*    */     //   146: astore #5
/*    */     //   148: aload #5
/*    */     //   150: ifnull -> 162
/*    */     //   153: aload_3
/*    */     //   154: aload #5
/*    */     //   156: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   161: pop
/*    */     //   162: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   165: areturn
/*    */     //   166: new java/lang/IllegalStateException
/*    */     //   169: dup
/*    */     //   170: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   172: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   175: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 63
/*    */     //   #34	-> 97
/*    */     //   #33	-> 124
/*    */     //   #35	-> 148
/*    */     //   #36	-> 153
/*    */     //   #38	-> 162
/*    */     //   #33	-> 166
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	21	1	property	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   97	21	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   97	30	3	action	Lkotlin/jvm/functions/Function1;
/*    */     //   136	26	3	action	Lkotlin/jvm/functions/Function1;
/*    */     //   148	14	5	value	Ljava/lang/String;
/*    */     //   0	176	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	113	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	106	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object setupModel(@NotNull MatterhornProperty modelNameProperty, @NotNull MatterhornProperty modelProviderProperty, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Function1 action, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/settings/PropertyUtils$setupModel$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/settings/PropertyUtils$setupModel$1
/*    */     //   13: astore #17
/*    */     //   15: aload #17
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #17
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/settings/PropertyUtils$setupModel$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #5
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #17
/*    */     //   53: aload #17
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #16
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #18
/*    */     //   65: aload #17
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 545, 0 -> 96, 1 -> 171, 2 -> 288
/*    */     //   96: aload #16
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: new kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   104: dup
/*    */     //   105: invokespecial <init> : ()V
/*    */     //   108: astore #6
/*    */     //   110: aload #6
/*    */     //   112: astore #15
/*    */     //   114: aload_3
/*    */     //   115: aload_1
/*    */     //   116: aload #17
/*    */     //   118: aload #17
/*    */     //   120: aload_2
/*    */     //   121: putfield L$0 : Ljava/lang/Object;
/*    */     //   124: aload #17
/*    */     //   126: aload_3
/*    */     //   127: putfield L$1 : Ljava/lang/Object;
/*    */     //   130: aload #17
/*    */     //   132: aload #4
/*    */     //   134: putfield L$2 : Ljava/lang/Object;
/*    */     //   137: aload #17
/*    */     //   139: aload #6
/*    */     //   141: putfield L$3 : Ljava/lang/Object;
/*    */     //   144: aload #17
/*    */     //   146: aload #15
/*    */     //   148: putfield L$4 : Ljava/lang/Object;
/*    */     //   151: aload #17
/*    */     //   153: iconst_1
/*    */     //   154: putfield label : I
/*    */     //   157: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   162: dup
/*    */     //   163: aload #18
/*    */     //   165: if_acmpne -> 226
/*    */     //   168: aload #18
/*    */     //   170: areturn
/*    */     //   171: aload #17
/*    */     //   173: getfield L$4 : Ljava/lang/Object;
/*    */     //   176: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   179: astore #15
/*    */     //   181: aload #17
/*    */     //   183: getfield L$3 : Ljava/lang/Object;
/*    */     //   186: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   189: astore #6
/*    */     //   191: aload #17
/*    */     //   193: getfield L$2 : Ljava/lang/Object;
/*    */     //   196: checkcast kotlin/jvm/functions/Function1
/*    */     //   199: astore #4
/*    */     //   201: aload #17
/*    */     //   203: getfield L$1 : Ljava/lang/Object;
/*    */     //   206: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   209: astore_3
/*    */     //   210: aload #17
/*    */     //   212: getfield L$0 : Ljava/lang/Object;
/*    */     //   215: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornProperty
/*    */     //   218: astore_2
/*    */     //   219: aload #16
/*    */     //   221: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   224: aload #16
/*    */     //   226: aload #15
/*    */     //   228: swap
/*    */     //   229: putfield element : Ljava/lang/Object;
/*    */     //   232: aload_3
/*    */     //   233: aload_2
/*    */     //   234: aload #17
/*    */     //   236: aload #17
/*    */     //   238: aload #4
/*    */     //   240: putfield L$0 : Ljava/lang/Object;
/*    */     //   243: aload #17
/*    */     //   245: aload #6
/*    */     //   247: putfield L$1 : Ljava/lang/Object;
/*    */     //   250: aload #17
/*    */     //   252: aconst_null
/*    */     //   253: putfield L$2 : Ljava/lang/Object;
/*    */     //   256: aload #17
/*    */     //   258: aconst_null
/*    */     //   259: putfield L$3 : Ljava/lang/Object;
/*    */     //   262: aload #17
/*    */     //   264: aconst_null
/*    */     //   265: putfield L$4 : Ljava/lang/Object;
/*    */     //   268: aload #17
/*    */     //   270: iconst_2
/*    */     //   271: putfield label : I
/*    */     //   274: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   279: dup
/*    */     //   280: aload #18
/*    */     //   282: if_acmpne -> 315
/*    */     //   285: aload #18
/*    */     //   287: areturn
/*    */     //   288: aload #17
/*    */     //   290: getfield L$1 : Ljava/lang/Object;
/*    */     //   293: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   296: astore #6
/*    */     //   298: aload #17
/*    */     //   300: getfield L$0 : Ljava/lang/Object;
/*    */     //   303: checkcast kotlin/jvm/functions/Function1
/*    */     //   306: astore #4
/*    */     //   308: aload #16
/*    */     //   310: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   313: aload #16
/*    */     //   315: checkcast java/lang/String
/*    */     //   318: dup
/*    */     //   319: ifnull -> 336
/*    */     //   322: astore #10
/*    */     //   324: iconst_0
/*    */     //   325: istore #11
/*    */     //   327: aload #10
/*    */     //   329: invokestatic valueOf : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*    */     //   332: nop
/*    */     //   333: goto -> 338
/*    */     //   336: pop
/*    */     //   337: aconst_null
/*    */     //   338: astore #7
/*    */     //   340: aload #6
/*    */     //   342: getfield element : Ljava/lang/Object;
/*    */     //   345: ifnonnull -> 388
/*    */     //   348: aload #7
/*    */     //   350: getstatic com/intellij/ml/llm/matterhorn/llm/LlmProvider.OpenAI : Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*    */     //   353: if_acmpne -> 366
/*    */     //   356: aload #6
/*    */     //   358: ldc 'gpt-4o-2024-08-06'
/*    */     //   360: putfield element : Ljava/lang/Object;
/*    */     //   363: goto -> 388
/*    */     //   366: aload #7
/*    */     //   368: getstatic com/intellij/ml/llm/matterhorn/llm/LlmProvider.Anthropic : Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*    */     //   371: if_acmpne -> 384
/*    */     //   374: aload #6
/*    */     //   376: ldc 'claude-3-7-sonnet-20250219'
/*    */     //   378: putfield element : Ljava/lang/Object;
/*    */     //   381: goto -> 388
/*    */     //   384: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   387: areturn
/*    */     //   388: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*    */     //   391: invokevirtual getKnownModels : ()Ljava/util/List;
/*    */     //   394: checkcast java/lang/Iterable
/*    */     //   397: astore #10
/*    */     //   399: aload #10
/*    */     //   401: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   406: astore #11
/*    */     //   408: aload #11
/*    */     //   410: invokeinterface hasNext : ()Z
/*    */     //   415: ifeq -> 470
/*    */     //   418: aload #11
/*    */     //   420: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   425: astore #12
/*    */     //   427: aload #12
/*    */     //   429: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*    */     //   432: astore #13
/*    */     //   434: iconst_0
/*    */     //   435: istore #14
/*    */     //   437: aload #13
/*    */     //   439: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   442: aload #6
/*    */     //   444: getfield element : Ljava/lang/Object;
/*    */     //   447: checkcast java/lang/String
/*    */     //   450: checkcast java/lang/CharSequence
/*    */     //   453: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*    */     //   456: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   459: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   462: ifeq -> 408
/*    */     //   465: aload #12
/*    */     //   467: goto -> 471
/*    */     //   470: aconst_null
/*    */     //   471: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*    */     //   474: astore #8
/*    */     //   476: aload #8
/*    */     //   478: dup
/*    */     //   479: ifnonnull -> 529
/*    */     //   482: pop
/*    */     //   483: new java/lang/IllegalStateException
/*    */     //   486: dup
/*    */     //   487: aload #6
/*    */     //   489: getfield element : Ljava/lang/Object;
/*    */     //   492: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*    */     //   495: invokevirtual getKnownModels : ()Ljava/util/List;
/*    */     //   498: checkcast java/lang/Iterable
/*    */     //   501: aconst_null
/*    */     //   502: aconst_null
/*    */     //   503: aconst_null
/*    */     //   504: iconst_0
/*    */     //   505: aconst_null
/*    */     //   506: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   511: bipush #31
/*    */     //   513: aconst_null
/*    */     //   514: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   517: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   522: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   525: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   528: athrow
/*    */     //   529: astore #9
/*    */     //   531: aload #4
/*    */     //   533: aload #9
/*    */     //   535: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   540: pop
/*    */     //   541: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   544: areturn
/*    */     //   545: new java/lang/IllegalStateException
/*    */     //   548: dup
/*    */     //   549: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   551: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   554: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 63
/*    */     //   #47	-> 101
/*    */     //   #40	-> 168
/*    */     //   #48	-> 232
/*    */     //   #40	-> 285
/*    */     //   #48	-> 315
/*    */     //   #69	-> 324
/*    */     //   #48	-> 327
/*    */     //   #48	-> 332
/*    */     //   #48	-> 336
/*    */     //   #50	-> 340
/*    */     //   #51	-> 348
/*    */     //   #52	-> 356
/*    */     //   #53	-> 366
/*    */     //   #54	-> 374
/*    */     //   #56	-> 384
/*    */     //   #59	-> 388
/*    */     //   #69	-> 434
/*    */     //   #59	-> 437
/*    */     //   #59	-> 459
/*    */     //   #59	-> 462
/*    */     //   #59	-> 471
/*    */     //   #60	-> 476
/*    */     //   #62	-> 531
/*    */     //   #63	-> 541
/*    */     //   #40	-> 545
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	61	1	modelNameProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   101	70	2	modelProviderProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   219	60	2	modelProviderProperty	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   101	70	3	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   210	69	3	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   101	70	4	action	Lkotlin/jvm/functions/Function1;
/*    */     //   201	87	4	action	Lkotlin/jvm/functions/Function1;
/*    */     //   308	24	4	action	Lkotlin/jvm/functions/Function1;
/*    */     //   332	1	4	action	Lkotlin/jvm/functions/Function1;
/*    */     //   333	51	4	action	Lkotlin/jvm/functions/Function1;
/*    */     //   388	74	4	action	Lkotlin/jvm/functions/Function1;
/*    */     //   462	83	4	action	Lkotlin/jvm/functions/Function1;
/*    */     //   110	61	6	name	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   191	97	6	name	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   298	34	6	name	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   332	1	6	name	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   333	51	6	name	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   388	74	6	name	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   462	83	6	name	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   340	16	7	provider	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*    */     //   366	8	7	provider	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*    */     //   476	69	8	knownModel	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   531	14	9	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   324	8	10	it	Ljava/lang/String;
/*    */     //   434	28	13	it	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   327	5	11	$i$a$-let-PropertyUtils$setupModel$provider$1	I
/*    */     //   437	25	14	$i$a$-find-PropertyUtils$setupModel$knownModel$1	I
/*    */     //   0	555	5	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	492	17	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	485	16	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final CharSequence setupModel$lambda$2(LLM it) {
/* 60 */     Intrinsics.checkNotNullParameter(it, "it"); return it.getName();
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "MatterhornProperties.kt", l = {34}, i = {0}, s = {"L$0"}, n = {"action"}, m = "setup", c = "com.intellij.ml.llm.matterhorn.settings.PropertyUtils")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class PropertyUtils$setup$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     PropertyUtils$setup$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PropertyUtils.this.setup(null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "MatterhornProperties.kt", l = {47, 48}, i = {0, 0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"}, n = {"modelProviderProperty", "propertyProvider", "action", "name", "action", "name"}, m = "setupModel", c = "com.intellij.ml.llm.matterhorn.settings.PropertyUtils")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class PropertyUtils$setupModel$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     int label;
/*    */     
/*    */     PropertyUtils$setupModel$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PropertyUtils.this.setupModel(null, null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\settings\PropertyUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */