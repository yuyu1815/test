/*    */ package com.intellij.ml.llm.matterhorn.requests;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B)\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\b\b\002\020\007\032\0020\b¢\006\004\b\t\020\nJ\026\020\f\032\0020\r2\006\020\016\032\0020\017H@¢\006\002\020\020R\016\020\002\032\0020\001X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\013\032\0020\bXD¢\006\002\n\000¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "base", "rules", "", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "times", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;I)V", "EMPTY_ANSWER_REASKING", "execute", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ public final class SelfReviewedRequest implements GrazieRequest {
/*    */   public SelfReviewedRequest(@NotNull GrazieRequest base, @NotNull String rules, @NotNull ModelParameters modelParameters, int times) {
/* 10 */     this.base = base;
/* 11 */     this.rules = rules;
/* 12 */     this.modelParameters = modelParameters;
/* 13 */     this.times = times;
/*    */     
/* 15 */     this.EMPTY_ANSWER_REASKING = 3;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final GrazieRequest base;
/*    */   @NotNull
/*    */   private final String rules;
/*    */   @NotNull
/*    */   private final ModelParameters modelParameters;
/*    */   private final int times;
/*    */   private final int EMPTY_ANSWER_REASKING;
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest$execute$1
/*    */     //   11: astore #17
/*    */     //   13: aload #17
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #17
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #17
/*    */     //   50: aload #17
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #16
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #18
/*    */     //   62: aload #17
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 1413, 0 -> 112, 1 -> 156, 2 -> 342, 3 -> 492, 4 -> 633, 5 -> 885, 6 -> 1093, 7 -> 1292
/*    */     //   112: aload #16
/*    */     //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   117: aload_0
/*    */     //   118: getfield base : Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;
/*    */     //   121: aload_1
/*    */     //   122: aload #17
/*    */     //   124: aload #17
/*    */     //   126: aload_0
/*    */     //   127: putfield L$0 : Ljava/lang/Object;
/*    */     //   130: aload #17
/*    */     //   132: aload_1
/*    */     //   133: putfield L$1 : Ljava/lang/Object;
/*    */     //   136: aload #17
/*    */     //   138: iconst_1
/*    */     //   139: putfield label : I
/*    */     //   142: invokeinterface execute : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   147: dup
/*    */     //   148: aload #18
/*    */     //   150: if_acmpne -> 181
/*    */     //   153: aload #18
/*    */     //   155: areturn
/*    */     //   156: aload #17
/*    */     //   158: getfield L$1 : Ljava/lang/Object;
/*    */     //   161: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   164: astore_1
/*    */     //   165: aload #17
/*    */     //   167: getfield L$0 : Ljava/lang/Object;
/*    */     //   170: checkcast com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest
/*    */     //   173: astore_0
/*    */     //   174: aload #16
/*    */     //   176: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   179: aload #16
/*    */     //   181: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   184: astore_3
/*    */     //   185: aload_3
/*    */     //   186: invokevirtual getTools : ()Ljava/util/List;
/*    */     //   189: invokeinterface isEmpty : ()Z
/*    */     //   194: istore #4
/*    */     //   196: getstatic kotlin/_Assertions.ENABLED : Z
/*    */     //   199: ifeq -> 221
/*    */     //   202: iload #4
/*    */     //   204: ifne -> 221
/*    */     //   207: ldc 'Assertion failed'
/*    */     //   209: astore #5
/*    */     //   211: new java/lang/AssertionError
/*    */     //   214: dup
/*    */     //   215: aload #5
/*    */     //   217: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   220: athrow
/*    */     //   221: iconst_1
/*    */     //   222: istore #4
/*    */     //   224: aload_0
/*    */     //   225: getfield times : I
/*    */     //   228: istore #5
/*    */     //   230: iload #4
/*    */     //   232: iload #5
/*    */     //   234: if_icmpgt -> 1411
/*    */     //   237: aload_3
/*    */     //   238: astore #6
/*    */     //   240: aload_0
/*    */     //   241: getfield rules : Ljava/lang/String;
/*    */     //   244: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   249: astore #7
/*    */     //   251: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   254: dup
/*    */     //   255: aload #7
/*    */     //   257: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */     //   260: aconst_null
/*    */     //   261: aconst_null
/*    */     //   262: bipush #12
/*    */     //   264: aconst_null
/*    */     //   265: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   268: astore #8
/*    */     //   270: aload_1
/*    */     //   271: aload #8
/*    */     //   273: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   276: aload #17
/*    */     //   278: aload #17
/*    */     //   280: aload_0
/*    */     //   281: putfield L$0 : Ljava/lang/Object;
/*    */     //   284: aload #17
/*    */     //   286: aload_1
/*    */     //   287: putfield L$1 : Ljava/lang/Object;
/*    */     //   290: aload #17
/*    */     //   292: aload_3
/*    */     //   293: putfield L$2 : Ljava/lang/Object;
/*    */     //   296: aload #17
/*    */     //   298: aload #6
/*    */     //   300: putfield L$3 : Ljava/lang/Object;
/*    */     //   303: aload #17
/*    */     //   305: aload #8
/*    */     //   307: putfield L$4 : Ljava/lang/Object;
/*    */     //   310: aload #17
/*    */     //   312: iload #4
/*    */     //   314: putfield I$0 : I
/*    */     //   317: aload #17
/*    */     //   319: iload #5
/*    */     //   321: putfield I$1 : I
/*    */     //   324: aload #17
/*    */     //   326: iconst_2
/*    */     //   327: putfield label : I
/*    */     //   330: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   333: dup
/*    */     //   334: aload #18
/*    */     //   336: if_acmpne -> 410
/*    */     //   339: aload #18
/*    */     //   341: areturn
/*    */     //   342: aload #17
/*    */     //   344: getfield I$1 : I
/*    */     //   347: istore #5
/*    */     //   349: aload #17
/*    */     //   351: getfield I$0 : I
/*    */     //   354: istore #4
/*    */     //   356: aload #17
/*    */     //   358: getfield L$4 : Ljava/lang/Object;
/*    */     //   361: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   364: astore #8
/*    */     //   366: aload #17
/*    */     //   368: getfield L$3 : Ljava/lang/Object;
/*    */     //   371: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   374: astore #6
/*    */     //   376: aload #17
/*    */     //   378: getfield L$2 : Ljava/lang/Object;
/*    */     //   381: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   384: astore_3
/*    */     //   385: aload #17
/*    */     //   387: getfield L$1 : Ljava/lang/Object;
/*    */     //   390: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   393: astore_1
/*    */     //   394: aload #17
/*    */     //   396: getfield L$0 : Ljava/lang/Object;
/*    */     //   399: checkcast com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest
/*    */     //   402: astore_0
/*    */     //   403: aload #16
/*    */     //   405: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   408: aload #16
/*    */     //   410: pop
/*    */     //   411: aload_3
/*    */     //   412: aload #8
/*    */     //   414: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   417: invokevirtual withNewMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   420: astore_3
/*    */     //   421: aload_1
/*    */     //   422: aload_3
/*    */     //   423: aload_0
/*    */     //   424: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   427: aload #17
/*    */     //   429: aload #17
/*    */     //   431: aload_0
/*    */     //   432: putfield L$0 : Ljava/lang/Object;
/*    */     //   435: aload #17
/*    */     //   437: aload_1
/*    */     //   438: putfield L$1 : Ljava/lang/Object;
/*    */     //   441: aload #17
/*    */     //   443: aload_3
/*    */     //   444: putfield L$2 : Ljava/lang/Object;
/*    */     //   447: aload #17
/*    */     //   449: aload #6
/*    */     //   451: putfield L$3 : Ljava/lang/Object;
/*    */     //   454: aload #17
/*    */     //   456: aconst_null
/*    */     //   457: putfield L$4 : Ljava/lang/Object;
/*    */     //   460: aload #17
/*    */     //   462: iload #4
/*    */     //   464: putfield I$0 : I
/*    */     //   467: aload #17
/*    */     //   469: iload #5
/*    */     //   471: putfield I$1 : I
/*    */     //   474: aload #17
/*    */     //   476: iconst_3
/*    */     //   477: putfield label : I
/*    */     //   480: invokevirtual sendToGrazie : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   483: dup
/*    */     //   484: aload #18
/*    */     //   486: if_acmpne -> 550
/*    */     //   489: aload #18
/*    */     //   491: areturn
/*    */     //   492: aload #17
/*    */     //   494: getfield I$1 : I
/*    */     //   497: istore #5
/*    */     //   499: aload #17
/*    */     //   501: getfield I$0 : I
/*    */     //   504: istore #4
/*    */     //   506: aload #17
/*    */     //   508: getfield L$3 : Ljava/lang/Object;
/*    */     //   511: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   514: astore #6
/*    */     //   516: aload #17
/*    */     //   518: getfield L$2 : Ljava/lang/Object;
/*    */     //   521: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   524: astore_3
/*    */     //   525: aload #17
/*    */     //   527: getfield L$1 : Ljava/lang/Object;
/*    */     //   530: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   533: astore_1
/*    */     //   534: aload #17
/*    */     //   536: getfield L$0 : Ljava/lang/Object;
/*    */     //   539: checkcast com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest
/*    */     //   542: astore_0
/*    */     //   543: aload #16
/*    */     //   545: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   548: aload #16
/*    */     //   550: checkcast java/util/List
/*    */     //   553: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   556: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   559: astore #9
/*    */     //   561: aload_1
/*    */     //   562: aload #9
/*    */     //   564: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   567: aload #17
/*    */     //   569: aload #17
/*    */     //   571: aload_0
/*    */     //   572: putfield L$0 : Ljava/lang/Object;
/*    */     //   575: aload #17
/*    */     //   577: aload_1
/*    */     //   578: putfield L$1 : Ljava/lang/Object;
/*    */     //   581: aload #17
/*    */     //   583: aload_3
/*    */     //   584: putfield L$2 : Ljava/lang/Object;
/*    */     //   587: aload #17
/*    */     //   589: aload #6
/*    */     //   591: putfield L$3 : Ljava/lang/Object;
/*    */     //   594: aload #17
/*    */     //   596: aload #9
/*    */     //   598: putfield L$4 : Ljava/lang/Object;
/*    */     //   601: aload #17
/*    */     //   603: iload #4
/*    */     //   605: putfield I$0 : I
/*    */     //   608: aload #17
/*    */     //   610: iload #5
/*    */     //   612: putfield I$1 : I
/*    */     //   615: aload #17
/*    */     //   617: iconst_4
/*    */     //   618: putfield label : I
/*    */     //   621: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   624: dup
/*    */     //   625: aload #18
/*    */     //   627: if_acmpne -> 701
/*    */     //   630: aload #18
/*    */     //   632: areturn
/*    */     //   633: aload #17
/*    */     //   635: getfield I$1 : I
/*    */     //   638: istore #5
/*    */     //   640: aload #17
/*    */     //   642: getfield I$0 : I
/*    */     //   645: istore #4
/*    */     //   647: aload #17
/*    */     //   649: getfield L$4 : Ljava/lang/Object;
/*    */     //   652: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   655: astore #9
/*    */     //   657: aload #17
/*    */     //   659: getfield L$3 : Ljava/lang/Object;
/*    */     //   662: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   665: astore #6
/*    */     //   667: aload #17
/*    */     //   669: getfield L$2 : Ljava/lang/Object;
/*    */     //   672: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   675: astore_3
/*    */     //   676: aload #17
/*    */     //   678: getfield L$1 : Ljava/lang/Object;
/*    */     //   681: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   684: astore_1
/*    */     //   685: aload #17
/*    */     //   687: getfield L$0 : Ljava/lang/Object;
/*    */     //   690: checkcast com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest
/*    */     //   693: astore_0
/*    */     //   694: aload #16
/*    */     //   696: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   699: aload #16
/*    */     //   701: pop
/*    */     //   702: aload #9
/*    */     //   704: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage'
/*    */     //   706: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   709: aload #9
/*    */     //   711: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   714: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   717: checkcast java/lang/CharSequence
/*    */     //   720: ldc 'RESULT: NO PROBLEM FOUND'
/*    */     //   722: checkcast java/lang/CharSequence
/*    */     //   725: iconst_1
/*    */     //   726: invokestatic contains : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
/*    */     //   729: ifeq -> 735
/*    */     //   732: aload #6
/*    */     //   734: areturn
/*    */     //   735: iconst_1
/*    */     //   736: istore #10
/*    */     //   738: aload_0
/*    */     //   739: getfield EMPTY_ANSWER_REASKING : I
/*    */     //   742: istore #11
/*    */     //   744: iload #10
/*    */     //   746: iload #11
/*    */     //   748: if_icmpgt -> 1398
/*    */     //   751: aload_3
/*    */     //   752: astore #12
/*    */     //   754: ldc 'Now generate a revised and corrected answer following the format of the original response.'
/*    */     //   756: astore #13
/*    */     //   758: iload #10
/*    */     //   760: iconst_1
/*    */     //   761: if_icmpeq -> 773
/*    */     //   764: aload #13
/*    */     //   766: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   771: astore #13
/*    */     //   773: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   776: dup
/*    */     //   777: aload #13
/*    */     //   779: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */     //   782: aconst_null
/*    */     //   783: aconst_null
/*    */     //   784: bipush #12
/*    */     //   786: aconst_null
/*    */     //   787: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   790: astore #14
/*    */     //   792: aload_1
/*    */     //   793: aload #14
/*    */     //   795: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   798: aload #17
/*    */     //   800: aload #17
/*    */     //   802: aload_0
/*    */     //   803: putfield L$0 : Ljava/lang/Object;
/*    */     //   806: aload #17
/*    */     //   808: aload_1
/*    */     //   809: putfield L$1 : Ljava/lang/Object;
/*    */     //   812: aload #17
/*    */     //   814: aload_3
/*    */     //   815: putfield L$2 : Ljava/lang/Object;
/*    */     //   818: aload #17
/*    */     //   820: aload #9
/*    */     //   822: putfield L$3 : Ljava/lang/Object;
/*    */     //   825: aload #17
/*    */     //   827: aload #12
/*    */     //   829: putfield L$4 : Ljava/lang/Object;
/*    */     //   832: aload #17
/*    */     //   834: aload #14
/*    */     //   836: putfield L$5 : Ljava/lang/Object;
/*    */     //   839: aload #17
/*    */     //   841: iload #4
/*    */     //   843: putfield I$0 : I
/*    */     //   846: aload #17
/*    */     //   848: iload #5
/*    */     //   850: putfield I$1 : I
/*    */     //   853: aload #17
/*    */     //   855: iload #10
/*    */     //   857: putfield I$2 : I
/*    */     //   860: aload #17
/*    */     //   862: iload #11
/*    */     //   864: putfield I$3 : I
/*    */     //   867: aload #17
/*    */     //   869: iconst_5
/*    */     //   870: putfield label : I
/*    */     //   873: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   876: dup
/*    */     //   877: aload #18
/*    */     //   879: if_acmpne -> 977
/*    */     //   882: aload #18
/*    */     //   884: areturn
/*    */     //   885: aload #17
/*    */     //   887: getfield I$3 : I
/*    */     //   890: istore #11
/*    */     //   892: aload #17
/*    */     //   894: getfield I$2 : I
/*    */     //   897: istore #10
/*    */     //   899: aload #17
/*    */     //   901: getfield I$1 : I
/*    */     //   904: istore #5
/*    */     //   906: aload #17
/*    */     //   908: getfield I$0 : I
/*    */     //   911: istore #4
/*    */     //   913: aload #17
/*    */     //   915: getfield L$5 : Ljava/lang/Object;
/*    */     //   918: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   921: astore #14
/*    */     //   923: aload #17
/*    */     //   925: getfield L$4 : Ljava/lang/Object;
/*    */     //   928: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   931: astore #12
/*    */     //   933: aload #17
/*    */     //   935: getfield L$3 : Ljava/lang/Object;
/*    */     //   938: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   941: astore #9
/*    */     //   943: aload #17
/*    */     //   945: getfield L$2 : Ljava/lang/Object;
/*    */     //   948: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   951: astore_3
/*    */     //   952: aload #17
/*    */     //   954: getfield L$1 : Ljava/lang/Object;
/*    */     //   957: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   960: astore_1
/*    */     //   961: aload #17
/*    */     //   963: getfield L$0 : Ljava/lang/Object;
/*    */     //   966: checkcast com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest
/*    */     //   969: astore_0
/*    */     //   970: aload #16
/*    */     //   972: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   975: aload #16
/*    */     //   977: pop
/*    */     //   978: aload #12
/*    */     //   980: aload #9
/*    */     //   982: invokevirtual withNewMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   985: astore #12
/*    */     //   987: aload #12
/*    */     //   989: aload #14
/*    */     //   991: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   994: invokevirtual withNewMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   997: astore #12
/*    */     //   999: aload_1
/*    */     //   1000: aload #12
/*    */     //   1002: aload_0
/*    */     //   1003: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   1006: aload #17
/*    */     //   1008: aload #17
/*    */     //   1010: aload_0
/*    */     //   1011: putfield L$0 : Ljava/lang/Object;
/*    */     //   1014: aload #17
/*    */     //   1016: aload_1
/*    */     //   1017: putfield L$1 : Ljava/lang/Object;
/*    */     //   1020: aload #17
/*    */     //   1022: aload_3
/*    */     //   1023: putfield L$2 : Ljava/lang/Object;
/*    */     //   1026: aload #17
/*    */     //   1028: aload #9
/*    */     //   1030: putfield L$3 : Ljava/lang/Object;
/*    */     //   1033: aload #17
/*    */     //   1035: aload #12
/*    */     //   1037: putfield L$4 : Ljava/lang/Object;
/*    */     //   1040: aload #17
/*    */     //   1042: aconst_null
/*    */     //   1043: putfield L$5 : Ljava/lang/Object;
/*    */     //   1046: aload #17
/*    */     //   1048: iload #4
/*    */     //   1050: putfield I$0 : I
/*    */     //   1053: aload #17
/*    */     //   1055: iload #5
/*    */     //   1057: putfield I$1 : I
/*    */     //   1060: aload #17
/*    */     //   1062: iload #10
/*    */     //   1064: putfield I$2 : I
/*    */     //   1067: aload #17
/*    */     //   1069: iload #11
/*    */     //   1071: putfield I$3 : I
/*    */     //   1074: aload #17
/*    */     //   1076: bipush #6
/*    */     //   1078: putfield label : I
/*    */     //   1081: invokevirtual sendToGrazie : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   1084: dup
/*    */     //   1085: aload #18
/*    */     //   1087: if_acmpne -> 1175
/*    */     //   1090: aload #18
/*    */     //   1092: areturn
/*    */     //   1093: aload #17
/*    */     //   1095: getfield I$3 : I
/*    */     //   1098: istore #11
/*    */     //   1100: aload #17
/*    */     //   1102: getfield I$2 : I
/*    */     //   1105: istore #10
/*    */     //   1107: aload #17
/*    */     //   1109: getfield I$1 : I
/*    */     //   1112: istore #5
/*    */     //   1114: aload #17
/*    */     //   1116: getfield I$0 : I
/*    */     //   1119: istore #4
/*    */     //   1121: aload #17
/*    */     //   1123: getfield L$4 : Ljava/lang/Object;
/*    */     //   1126: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   1129: astore #12
/*    */     //   1131: aload #17
/*    */     //   1133: getfield L$3 : Ljava/lang/Object;
/*    */     //   1136: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1139: astore #9
/*    */     //   1141: aload #17
/*    */     //   1143: getfield L$2 : Ljava/lang/Object;
/*    */     //   1146: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   1149: astore_3
/*    */     //   1150: aload #17
/*    */     //   1152: getfield L$1 : Ljava/lang/Object;
/*    */     //   1155: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   1158: astore_1
/*    */     //   1159: aload #17
/*    */     //   1161: getfield L$0 : Ljava/lang/Object;
/*    */     //   1164: checkcast com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest
/*    */     //   1167: astore_0
/*    */     //   1168: aload #16
/*    */     //   1170: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1173: aload #16
/*    */     //   1175: checkcast java/util/List
/*    */     //   1178: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   1181: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1184: astore #15
/*    */     //   1186: aload #15
/*    */     //   1188: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   1191: ifeq -> 1363
/*    */     //   1194: aload #15
/*    */     //   1196: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   1199: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   1202: checkcast java/lang/CharSequence
/*    */     //   1205: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   1208: ifne -> 1215
/*    */     //   1211: iconst_1
/*    */     //   1212: goto -> 1216
/*    */     //   1215: iconst_0
/*    */     //   1216: ifeq -> 1363
/*    */     //   1219: aload_1
/*    */     //   1220: aload #15
/*    */     //   1222: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   1225: aload #17
/*    */     //   1227: aload #17
/*    */     //   1229: aload_0
/*    */     //   1230: putfield L$0 : Ljava/lang/Object;
/*    */     //   1233: aload #17
/*    */     //   1235: aload_1
/*    */     //   1236: putfield L$1 : Ljava/lang/Object;
/*    */     //   1239: aload #17
/*    */     //   1241: aload #12
/*    */     //   1243: putfield L$2 : Ljava/lang/Object;
/*    */     //   1246: aload #17
/*    */     //   1248: aload #15
/*    */     //   1250: putfield L$3 : Ljava/lang/Object;
/*    */     //   1253: aload #17
/*    */     //   1255: aconst_null
/*    */     //   1256: putfield L$4 : Ljava/lang/Object;
/*    */     //   1259: aload #17
/*    */     //   1261: iload #4
/*    */     //   1263: putfield I$0 : I
/*    */     //   1266: aload #17
/*    */     //   1268: iload #5
/*    */     //   1270: putfield I$1 : I
/*    */     //   1273: aload #17
/*    */     //   1275: bipush #7
/*    */     //   1277: putfield label : I
/*    */     //   1280: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   1283: dup
/*    */     //   1284: aload #18
/*    */     //   1286: if_acmpne -> 1351
/*    */     //   1289: aload #18
/*    */     //   1291: areturn
/*    */     //   1292: aload #17
/*    */     //   1294: getfield I$1 : I
/*    */     //   1297: istore #5
/*    */     //   1299: aload #17
/*    */     //   1301: getfield I$0 : I
/*    */     //   1304: istore #4
/*    */     //   1306: aload #17
/*    */     //   1308: getfield L$3 : Ljava/lang/Object;
/*    */     //   1311: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1314: astore #15
/*    */     //   1316: aload #17
/*    */     //   1318: getfield L$2 : Ljava/lang/Object;
/*    */     //   1321: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   1324: astore #12
/*    */     //   1326: aload #17
/*    */     //   1328: getfield L$1 : Ljava/lang/Object;
/*    */     //   1331: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   1334: astore_1
/*    */     //   1335: aload #17
/*    */     //   1337: getfield L$0 : Ljava/lang/Object;
/*    */     //   1340: checkcast com/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest
/*    */     //   1343: astore_0
/*    */     //   1344: aload #16
/*    */     //   1346: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1349: aload #16
/*    */     //   1351: pop
/*    */     //   1352: aload #12
/*    */     //   1354: aload #15
/*    */     //   1356: invokevirtual withNewMessage : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1359: astore_3
/*    */     //   1360: goto -> 1398
/*    */     //   1363: iload #10
/*    */     //   1365: aload_0
/*    */     //   1366: getfield EMPTY_ANSWER_REASKING : I
/*    */     //   1369: if_icmpne -> 1385
/*    */     //   1372: new com/intellij/ml/llm/matterhorn/TooManyAttemptsWithoutSuccessException
/*    */     //   1375: dup
/*    */     //   1376: ldc 'Failed to generate not empty answer'
/*    */     //   1378: aconst_null
/*    */     //   1379: iconst_2
/*    */     //   1380: aconst_null
/*    */     //   1381: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   1384: athrow
/*    */     //   1385: iload #10
/*    */     //   1387: iload #11
/*    */     //   1389: if_icmpeq -> 1398
/*    */     //   1392: iinc #10, 1
/*    */     //   1395: goto -> 751
/*    */     //   1398: iload #4
/*    */     //   1400: iload #5
/*    */     //   1402: if_icmpeq -> 1411
/*    */     //   1405: iinc #4, 1
/*    */     //   1408: goto -> 237
/*    */     //   1411: aload_3
/*    */     //   1412: areturn
/*    */     //   1413: new java/lang/IllegalStateException
/*    */     //   1416: dup
/*    */     //   1417: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   1419: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1422: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 60
/*    */     //   #18	-> 117
/*    */     //   #17	-> 153
/*    */     //   #20	-> 185
/*    */     //   #22	-> 221
/*    */     //   #23	-> 237
/*    */     //   #27	-> 240
/*    */     //   #25	-> 249
/*    */     //   #32	-> 251
/*    */     //   #33	-> 270
/*    */     //   #17	-> 339
/*    */     //   #34	-> 410
/*    */     //   #36	-> 421
/*    */     //   #17	-> 489
/*    */     //   #36	-> 550
/*    */     //   #37	-> 561
/*    */     //   #17	-> 630
/*    */     //   #39	-> 701
/*    */     //   #40	-> 732
/*    */     //   #42	-> 735
/*    */     //   #43	-> 751
/*    */     //   #45	-> 754
/*    */     //   #46	-> 758
/*    */     //   #47	-> 764
/*    */     //   #49	-> 773
/*    */     //   #50	-> 792
/*    */     //   #17	-> 882
/*    */     //   #52	-> 977
/*    */     //   #53	-> 987
/*    */     //   #55	-> 999
/*    */     //   #17	-> 1090
/*    */     //   #55	-> 1175
/*    */     //   #56	-> 1186
/*    */     //   #56	-> 1216
/*    */     //   #57	-> 1219
/*    */     //   #17	-> 1289
/*    */     //   #58	-> 1351
/*    */     //   #59	-> 1360
/*    */     //   #61	-> 1363
/*    */     //   #62	-> 1372
/*    */     //   #42	-> 1385
/*    */     //   #22	-> 1398
/*    */     //   #66	-> 1411
/*    */     //   #17	-> 1413
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   117	39	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   174	47	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   221	121	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   403	89	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   543	90	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   694	38	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   735	150	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   970	123	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   1168	124	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   1344	19	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   1363	9	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   1385	7	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   1392	13	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   1405	6	0	this	Lcom/intellij/ml/llm/matterhorn/requests/SelfReviewedRequest;
/*    */     //   117	39	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   165	56	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   221	121	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   394	98	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   534	99	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   685	47	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   735	150	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   961	132	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1159	133	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1335	28	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1363	9	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1385	7	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1392	13	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1405	6	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   185	36	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   221	121	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   385	107	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   525	108	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   676	56	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   735	150	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   952	141	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1150	66	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1216	3	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1360	3	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1363	9	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1385	7	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1392	13	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1405	8	3	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   224	118	4	i	I
/*    */     //   356	136	4	i	I
/*    */     //   506	127	4	i	I
/*    */     //   647	85	4	i	I
/*    */     //   735	150	4	i	I
/*    */     //   913	180	4	i	I
/*    */     //   1121	171	4	i	I
/*    */     //   1306	57	4	i	I
/*    */     //   1363	9	4	i	I
/*    */     //   1385	7	4	i	I
/*    */     //   1392	13	4	i	I
/*    */     //   1405	6	4	i	I
/*    */     //   240	102	6	originalChat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   376	116	6	originalChat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   516	117	6	originalChat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   667	68	6	originalChat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   251	19	7	findProblemsText	Ljava/lang/String;
/*    */     //   270	72	8	findProblemsMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   366	55	8	findProblemsMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   561	72	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   657	75	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   735	150	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   943	150	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1141	75	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1216	3	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1363	9	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1385	7	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1392	6	9	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   738	147	10	c	I
/*    */     //   899	194	10	c	I
/*    */     //   1107	109	10	c	I
/*    */     //   1216	3	10	c	I
/*    */     //   1363	9	10	c	I
/*    */     //   1385	7	10	c	I
/*    */     //   1392	6	10	c	I
/*    */     //   754	131	12	chatWithFix	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   933	160	12	chatWithFix	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1131	161	12	chatWithFix	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1326	34	12	chatWithFix	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   758	15	13	fixProblemsText	Ljava/lang/String;
/*    */     //   773	19	13	fixProblemsText	Ljava/lang/String;
/*    */     //   792	93	14	fixProblemsMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   923	76	14	fixProblemsMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   1186	106	15	fixesMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1316	44	15	fixesMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   0	1423	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	1363	17	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	1356	16	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SelfReviewedRequest.kt", l = {18, 33, 36, 37, 50, 55, 57}, i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$2", "L$0", "L$1", "L$2", "L$3", "I$0"}, n = {"this", "context", "this", "context", "chat", "originalChat", "findProblemsMessage", "i", "this", "context", "chat", "originalChat", "i", "this", "context", "chat", "originalChat", "message", "i", "this", "context", "chat", "message", "chatWithFix", "fixProblemsMessage", "i", "c", "this", "context", "chat", "message", "chatWithFix", "i", "c", "this", "context", "chatWithFix", "fixesMessage", "i"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.SelfReviewedRequest")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class SelfReviewedRequest$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     Object L$5;
/*    */     int I$0;
/*    */     int I$1;
/*    */     int I$2;
/*    */     int I$3;
/*    */     int label;
/*    */     
/*    */     SelfReviewedRequest$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SelfReviewedRequest.this.execute(null, (Continuation<? super MatterhornChat>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\SelfReviewedRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */