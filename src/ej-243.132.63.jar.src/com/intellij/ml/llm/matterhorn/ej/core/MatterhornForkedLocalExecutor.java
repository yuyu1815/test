/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JF\020\004\032\n\022\004\022\002H\006\030\0010\005\"\004\b\000\020\007\"\004\b\001\020\0062\006\020\b\032\0020\t2\022\020\n\032\016\022\004\022\002H\007\022\004\022\002H\0060\0132\006\020\f\032\0020\rH@¢\006\002\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor;", "", "<init>", "()V", "executeInForkedEnvironment", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "O", "I", "name", "", "request", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "originalContext", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */ public final class MatterhornForkedLocalExecutor {
/*     */   @NotNull
/*     */   public static final MatterhornForkedLocalExecutor INSTANCE = new MatterhornForkedLocalExecutor();
/*     */   
/*     */   @Nullable
/*     */   public final <I, O> Object executeInForkedEnvironment(@NotNull String name, @NotNull ArtifactRequest request, @NotNull ExecutionContext originalContext, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$1
/*     */     //   13: astore #11
/*     */     //   15: aload #11
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #11
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #11
/*     */     //   53: aload #11
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #10
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #12
/*     */     //   65: aload #11
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 736, 0 -> 104, 1 -> 284, 2 -> 484, 3 -> 583, 4 -> 690
/*     */     //   104: aload #10
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: aload_3
/*     */     //   110: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   113: invokeinterface save : ()V
/*     */     //   118: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   121: dup
/*     */     //   122: invokespecial <init> : ()V
/*     */     //   125: astore #5
/*     */     //   127: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   130: dup
/*     */     //   131: invokespecial <init> : ()V
/*     */     //   134: astore #6
/*     */     //   136: invokestatic getTempDirectory : ()Ljava/lang/String;
/*     */     //   139: iconst_1
/*     */     //   140: anewarray java/lang/String
/*     */     //   143: astore #8
/*     */     //   145: aload #8
/*     */     //   147: iconst_0
/*     */     //   148: aload_1
/*     */     //   149: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   154: aastore
/*     */     //   155: aload #8
/*     */     //   157: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*     */     //   160: astore #7
/*     */     //   162: nop
/*     */     //   163: aload_3
/*     */     //   164: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   167: invokeinterface getBaseDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   172: dup
/*     */     //   173: ifnonnull -> 190
/*     */     //   176: pop
/*     */     //   177: new java/lang/IllegalStateException
/*     */     //   180: dup
/*     */     //   181: ldc 'Cannot access project base directory'
/*     */     //   183: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   186: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   189: athrow
/*     */     //   190: astore #8
/*     */     //   192: aload #6
/*     */     //   194: astore #9
/*     */     //   196: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   199: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   202: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$2
/*     */     //   205: dup
/*     */     //   206: aload #7
/*     */     //   208: aload #8
/*     */     //   210: aload_1
/*     */     //   211: aconst_null
/*     */     //   212: invokespecial <init> : (Ljava/nio/file/Path;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
/*     */     //   215: checkcast kotlin/jvm/functions/Function2
/*     */     //   218: aload #11
/*     */     //   220: aload #11
/*     */     //   222: aload_1
/*     */     //   223: putfield L$0 : Ljava/lang/Object;
/*     */     //   226: aload #11
/*     */     //   228: aload_2
/*     */     //   229: putfield L$1 : Ljava/lang/Object;
/*     */     //   232: aload #11
/*     */     //   234: aload_3
/*     */     //   235: putfield L$2 : Ljava/lang/Object;
/*     */     //   238: aload #11
/*     */     //   240: aload #5
/*     */     //   242: putfield L$3 : Ljava/lang/Object;
/*     */     //   245: aload #11
/*     */     //   247: aload #6
/*     */     //   249: putfield L$4 : Ljava/lang/Object;
/*     */     //   252: aload #11
/*     */     //   254: aload #7
/*     */     //   256: putfield L$5 : Ljava/lang/Object;
/*     */     //   259: aload #11
/*     */     //   261: aload #9
/*     */     //   263: putfield L$6 : Ljava/lang/Object;
/*     */     //   266: aload #11
/*     */     //   268: iconst_1
/*     */     //   269: putfield label : I
/*     */     //   272: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   275: dup
/*     */     //   276: aload #12
/*     */     //   278: if_acmpne -> 359
/*     */     //   281: aload #12
/*     */     //   283: areturn
/*     */     //   284: aload #11
/*     */     //   286: getfield L$6 : Ljava/lang/Object;
/*     */     //   289: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   292: astore #9
/*     */     //   294: aload #11
/*     */     //   296: getfield L$5 : Ljava/lang/Object;
/*     */     //   299: checkcast java/nio/file/Path
/*     */     //   302: astore #7
/*     */     //   304: aload #11
/*     */     //   306: getfield L$4 : Ljava/lang/Object;
/*     */     //   309: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   312: astore #6
/*     */     //   314: aload #11
/*     */     //   316: getfield L$3 : Ljava/lang/Object;
/*     */     //   319: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   322: astore #5
/*     */     //   324: aload #11
/*     */     //   326: getfield L$2 : Ljava/lang/Object;
/*     */     //   329: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   332: astore_3
/*     */     //   333: aload #11
/*     */     //   335: getfield L$1 : Ljava/lang/Object;
/*     */     //   338: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   341: astore_2
/*     */     //   342: aload #11
/*     */     //   344: getfield L$0 : Ljava/lang/Object;
/*     */     //   347: checkcast java/lang/String
/*     */     //   350: astore_1
/*     */     //   351: nop
/*     */     //   352: aload #10
/*     */     //   354: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   357: aload #10
/*     */     //   359: aload #9
/*     */     //   361: swap
/*     */     //   362: putfield element : Ljava/lang/Object;
/*     */     //   365: aload_1
/*     */     //   366: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   371: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   374: swap
/*     */     //   375: invokevirtual println : (Ljava/lang/Object;)V
/*     */     //   378: getstatic com/intellij/ml/llm/matterhorn/MatterhornServiceScope.Companion : Lcom/intellij/ml/llm/matterhorn/MatterhornServiceScope$Companion;
/*     */     //   381: aload #6
/*     */     //   383: getfield element : Ljava/lang/Object;
/*     */     //   386: checkcast com/intellij/openapi/project/Project
/*     */     //   389: invokevirtual getScope : (Lcom/intellij/openapi/project/Project;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   392: aconst_null
/*     */     //   393: aconst_null
/*     */     //   394: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3
/*     */     //   397: dup
/*     */     //   398: aload #6
/*     */     //   400: aload_3
/*     */     //   401: aload #5
/*     */     //   403: aload_1
/*     */     //   404: aload_2
/*     */     //   405: aconst_null
/*     */     //   406: invokespecial <init> : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lkotlin/coroutines/Continuation;)V
/*     */     //   409: checkcast kotlin/jvm/functions/Function2
/*     */     //   412: iconst_3
/*     */     //   413: aconst_null
/*     */     //   414: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */     //   417: aload #11
/*     */     //   419: aload #11
/*     */     //   421: aload #5
/*     */     //   423: putfield L$0 : Ljava/lang/Object;
/*     */     //   426: aload #11
/*     */     //   428: aload #6
/*     */     //   430: putfield L$1 : Ljava/lang/Object;
/*     */     //   433: aload #11
/*     */     //   435: aload #7
/*     */     //   437: putfield L$2 : Ljava/lang/Object;
/*     */     //   440: aload #11
/*     */     //   442: aconst_null
/*     */     //   443: putfield L$3 : Ljava/lang/Object;
/*     */     //   446: aload #11
/*     */     //   448: aconst_null
/*     */     //   449: putfield L$4 : Ljava/lang/Object;
/*     */     //   452: aload #11
/*     */     //   454: aconst_null
/*     */     //   455: putfield L$5 : Ljava/lang/Object;
/*     */     //   458: aload #11
/*     */     //   460: aconst_null
/*     */     //   461: putfield L$6 : Ljava/lang/Object;
/*     */     //   464: aload #11
/*     */     //   466: iconst_2
/*     */     //   467: putfield label : I
/*     */     //   470: invokeinterface join : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   475: dup
/*     */     //   476: aload #12
/*     */     //   478: if_acmpne -> 522
/*     */     //   481: aload #12
/*     */     //   483: areturn
/*     */     //   484: aload #11
/*     */     //   486: getfield L$2 : Ljava/lang/Object;
/*     */     //   489: checkcast java/nio/file/Path
/*     */     //   492: astore #7
/*     */     //   494: aload #11
/*     */     //   496: getfield L$1 : Ljava/lang/Object;
/*     */     //   499: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   502: astore #6
/*     */     //   504: aload #11
/*     */     //   506: getfield L$0 : Ljava/lang/Object;
/*     */     //   509: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   512: astore #5
/*     */     //   514: nop
/*     */     //   515: aload #10
/*     */     //   517: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   520: aload #10
/*     */     //   522: pop
/*     */     //   523: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   526: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   529: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$4
/*     */     //   532: dup
/*     */     //   533: aload #6
/*     */     //   535: aload #7
/*     */     //   537: aconst_null
/*     */     //   538: invokespecial <init> : (Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)V
/*     */     //   541: checkcast kotlin/jvm/functions/Function2
/*     */     //   544: aload #11
/*     */     //   546: aload #11
/*     */     //   548: aload #5
/*     */     //   550: putfield L$0 : Ljava/lang/Object;
/*     */     //   553: aload #11
/*     */     //   555: aconst_null
/*     */     //   556: putfield L$1 : Ljava/lang/Object;
/*     */     //   559: aload #11
/*     */     //   561: aconst_null
/*     */     //   562: putfield L$2 : Ljava/lang/Object;
/*     */     //   565: aload #11
/*     */     //   567: iconst_3
/*     */     //   568: putfield label : I
/*     */     //   571: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   574: dup
/*     */     //   575: aload #12
/*     */     //   577: if_acmpne -> 600
/*     */     //   580: aload #12
/*     */     //   582: areturn
/*     */     //   583: aload #11
/*     */     //   585: getfield L$0 : Ljava/lang/Object;
/*     */     //   588: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   591: astore #5
/*     */     //   593: aload #10
/*     */     //   595: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   598: aload #10
/*     */     //   600: pop
/*     */     //   601: goto -> 711
/*     */     //   604: astore #8
/*     */     //   606: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   609: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   612: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$4
/*     */     //   615: dup
/*     */     //   616: aload #6
/*     */     //   618: aload #7
/*     */     //   620: aconst_null
/*     */     //   621: invokespecial <init> : (Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)V
/*     */     //   624: checkcast kotlin/jvm/functions/Function2
/*     */     //   627: aload #11
/*     */     //   629: aload #11
/*     */     //   631: aload #8
/*     */     //   633: putfield L$0 : Ljava/lang/Object;
/*     */     //   636: aload #11
/*     */     //   638: aconst_null
/*     */     //   639: putfield L$1 : Ljava/lang/Object;
/*     */     //   642: aload #11
/*     */     //   644: aconst_null
/*     */     //   645: putfield L$2 : Ljava/lang/Object;
/*     */     //   648: aload #11
/*     */     //   650: aconst_null
/*     */     //   651: putfield L$3 : Ljava/lang/Object;
/*     */     //   654: aload #11
/*     */     //   656: aconst_null
/*     */     //   657: putfield L$4 : Ljava/lang/Object;
/*     */     //   660: aload #11
/*     */     //   662: aconst_null
/*     */     //   663: putfield L$5 : Ljava/lang/Object;
/*     */     //   666: aload #11
/*     */     //   668: aconst_null
/*     */     //   669: putfield L$6 : Ljava/lang/Object;
/*     */     //   672: aload #11
/*     */     //   674: iconst_4
/*     */     //   675: putfield label : I
/*     */     //   678: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   681: dup
/*     */     //   682: aload #12
/*     */     //   684: if_acmpne -> 707
/*     */     //   687: aload #12
/*     */     //   689: areturn
/*     */     //   690: aload #11
/*     */     //   692: getfield L$0 : Ljava/lang/Object;
/*     */     //   695: checkcast java/lang/Throwable
/*     */     //   698: astore #8
/*     */     //   700: aload #10
/*     */     //   702: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   705: aload #10
/*     */     //   707: pop
/*     */     //   708: aload #8
/*     */     //   710: athrow
/*     */     //   711: aload #5
/*     */     //   713: getfield element : Ljava/lang/Object;
/*     */     //   716: astore #8
/*     */     //   718: aload #8
/*     */     //   720: instanceof com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   723: ifeq -> 734
/*     */     //   726: aload #8
/*     */     //   728: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   731: goto -> 735
/*     */     //   734: aconst_null
/*     */     //   735: areturn
/*     */     //   736: new java/lang/IllegalStateException
/*     */     //   739: dup
/*     */     //   740: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   742: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   745: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 63
/*     */     //   #50	-> 109
/*     */     //   #52	-> 118
/*     */     //   #53	-> 127
/*     */     //   #55	-> 136
/*     */     //   #56	-> 162
/*     */     //   #57	-> 163
/*     */     //   #58	-> 192
/*     */     //   #48	-> 281
/*     */     //   #85	-> 365
/*     */     //   #87	-> 378
/*     */     //   #148	-> 419
/*     */     //   #48	-> 481
/*     */     //   #150	-> 522
/*     */     //   #48	-> 580
/*     */     //   #159	-> 600
/*     */     //   #150	-> 604
/*     */     //   #48	-> 687
/*     */     //   #161	-> 707
/*     */     //   #48	-> 736
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	175	1	name	Ljava/lang/String;
/*     */     //   351	27	1	name	Ljava/lang/String;
/*     */     //   378	41	1	name	Ljava/lang/String;
/*     */     //   109	175	2	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   342	36	2	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   378	41	2	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   109	175	3	originalContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   333	45	3	originalContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   378	41	3	originalContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   127	157	5	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   324	160	5	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   514	69	5	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   593	11	5	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   711	7	5	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   136	148	6	project	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   314	170	6	project	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   504	70	6	project	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   604	77	6	project	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   162	122	7	tempDirPath	Ljava/nio/file/Path;
/*     */     //   304	180	7	tempDirPath	Ljava/nio/file/Path;
/*     */     //   494	80	7	tempDirPath	Ljava/nio/file/Path;
/*     */     //   604	77	7	tempDirPath	Ljava/nio/file/Path;
/*     */     //   192	83	8	originalProjectDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	746	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	683	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	676	10	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   162	275	604	finally
/*     */     //   351	475	604	finally
/*     */     //   514	523	604	finally
/*     */     //   604	606	604	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {58, 148, 150, 150}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0"}, n = {"name", "request", "originalContext", "result", "project", "tempDirPath", "result", "project", "tempDirPath", "result"}, m = "executeInForkedEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$1<I, O> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     MatterhornForkedLocalExecutor$executeInForkedEnvironment$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornForkedLocalExecutor.this.executeInForkedEnvironment(null, null, null, (Continuation<? super Artifact<?>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {59, 79}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/openapi/project/Project;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nAbstractMultiAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$2\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,214:1\n40#2,3:215\n*S KotlinDebug\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$2\n*L\n78#1:215,3\n*E\n"})
/*     */   static final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Project>, Object> { int label;
/*     */     
/*     */     MatterhornForkedLocalExecutor$executeInForkedEnvironment$2(Path $tempDirPath, VirtualFile $originalProjectDir, String $name, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(Path $tempDirPath, VirtualFile $originalProjectDir, String $name) { VirtualFile tempDir;
/*  60 */       Intrinsics.checkNotNull($tempDirPath); if (VfsUtil.createDirectoryIfMissing($tempDirPath.toString()) == null) { VfsUtil.createDirectoryIfMissing($tempDirPath.toString()); throw new IllegalStateException("Failed to create temporary directory".toString()); }
/*     */        try {
/*  62 */         VirtualFileManager.getInstance().syncRefresh();
/*  63 */         VfsUtil.copyDirectory(null, $originalProjectDir, tempDir, new MatterhornForkedLocalExecutor$executeInForkedEnvironment$2$1$1());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  70 */         String str = $name + "==Directory created: " + $name; System.out.println(str);
/*     */       }
/*  72 */       catch (Exception e) {
/*  73 */         FileUtil.delete($tempDirPath.toFile());
/*  74 */         throw new IllegalStateException("Failed to copy project files: " + e.getMessage(), e);
/*     */       } 
/*  76 */       return Unit.INSTANCE; }
/*     */     public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #4
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 247, 0 -> 36, 1 -> 78, 2 -> 220
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield $tempDirPath : Ljava/nio/file/Path;
/*     */       //   44: aload_0
/*     */       //   45: getfield $originalProjectDir : Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   48: aload_0
/*     */       //   49: getfield $name : Ljava/lang/String;
/*     */       //   52: <illegal opcode> invoke : (Ljava/nio/file/Path;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */       //   57: aload_0
/*     */       //   58: checkcast kotlin/coroutines/Continuation
/*     */       //   61: aload_0
/*     */       //   62: iconst_1
/*     */       //   63: putfield label : I
/*     */       //   66: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   69: dup
/*     */       //   70: aload #4
/*     */       //   72: if_acmpne -> 83
/*     */       //   75: aload #4
/*     */       //   77: areturn
/*     */       //   78: aload_1
/*     */       //   79: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   82: aload_1
/*     */       //   83: pop
/*     */       //   84: iconst_0
/*     */       //   85: istore_2
/*     */       //   86: ldc com/intellij/ide/GeneralSettings
/*     */       //   88: astore_3
/*     */       //   89: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */       //   92: aload_3
/*     */       //   93: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */       //   98: dup
/*     */       //   99: ifnonnull -> 164
/*     */       //   102: pop
/*     */       //   103: new java/lang/RuntimeException
/*     */       //   106: dup
/*     */       //   107: new java/lang/StringBuilder
/*     */       //   110: dup
/*     */       //   111: invokespecial <init> : ()V
/*     */       //   114: ldc 'Cannot find service '
/*     */       //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   119: aload_3
/*     */       //   120: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   126: ldc ' (classloader='
/*     */       //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   131: aload_3
/*     */       //   132: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */       //   135: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */       //   138: ldc ', client='
/*     */       //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   143: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*     */       //   146: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*     */       //   149: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */       //   152: bipush #41
/*     */       //   154: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */       //   157: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   160: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   163: athrow
/*     */       //   164: nop
/*     */       //   165: checkcast com/intellij/ide/GeneralSettings
/*     */       //   168: iconst_0
/*     */       //   169: invokevirtual setConfirmOpenNewProject : (I)V
/*     */       //   172: getstatic com/intellij/platform/CommandLineProjectOpenProcessor.Companion : Lcom/intellij/platform/CommandLineProjectOpenProcessor$Companion;
/*     */       //   175: invokevirtual getInstance : ()Lcom/intellij/platform/CommandLineProjectOpenProcessor;
/*     */       //   178: aload_0
/*     */       //   179: getfield $tempDirPath : Ljava/nio/file/Path;
/*     */       //   182: astore_3
/*     */       //   183: aload_3
/*     */       //   184: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   187: aload_3
/*     */       //   188: iconst_0
/*     */       //   189: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */       //   194: invokestatic OpenProjectTask : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/ide/impl/OpenProjectTask;
/*     */       //   197: aload_0
/*     */       //   198: checkcast kotlin/coroutines/Continuation
/*     */       //   201: aload_0
/*     */       //   202: iconst_2
/*     */       //   203: putfield label : I
/*     */       //   206: invokeinterface openProjectAndFile : (Ljava/nio/file/Path;ZLcom/intellij/ide/impl/OpenProjectTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   211: dup
/*     */       //   212: aload #4
/*     */       //   214: if_acmpne -> 225
/*     */       //   217: aload #4
/*     */       //   219: areturn
/*     */       //   220: aload_1
/*     */       //   221: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   224: aload_1
/*     */       //   225: checkcast com/intellij/openapi/project/Project
/*     */       //   228: dup
/*     */       //   229: ifnonnull -> 246
/*     */       //   232: pop
/*     */       //   233: new java/lang/IllegalStateException
/*     */       //   236: dup
/*     */       //   237: ldc 'No project was found to open in directory'
/*     */       //   239: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   242: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   245: athrow
/*     */       //   246: areturn
/*     */       //   247: new java/lang/IllegalStateException
/*     */       //   250: dup
/*     */       //   251: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   253: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   256: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #58	-> 3
/*     */       //   #59	-> 40
/*     */       //   #58	-> 75
/*     */       //   #78	-> 83
/*     */       //   #215	-> 86
/*     */       //   #216	-> 89
/*     */       //   #217	-> 103
/*     */       //   #216	-> 164
/*     */       //   #78	-> 168
/*     */       //   #79	-> 172
/*     */       //   #58	-> 217
/*     */       //   #79	-> 225
/*     */       //   #82	-> 237
/*     */       //   #58	-> 247
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   89	76	3	serviceClass$iv	Ljava/lang/Class;
/*     */       //   86	79	2	$i$f$service	I
/*     */       //   0	257	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$2;
/*     */       //   40	207	1	$result	Ljava/lang/Object; }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$2> $completion) { return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$2(this.$tempDirPath, this.$originalProjectDir, this.$name, $completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } private static final Unit invokeSuspend$lambda$1(OpenProjectTaskBuilder $this$OpenProjectTask) {
/*  80 */       $this$OpenProjectTask.setForceOpenInNewFrame(true);
/*  81 */       $this$OpenProjectTask.setRunConfigurators(true);
/*  82 */       return Unit.INSTANCE;
/*     */     } } @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {94, 144}, i = {0}, s = {"L$0"}, n = {"service"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nAbstractMultiAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,214:1\n31#2,2:215\n*S KotlinDebug\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3\n*L\n88#1:215,2\n*E\n"})
/*     */   static final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { Object L$0; int label; MatterhornForkedLocalExecutor$executeInForkedEnvironment$3(Ref.ObjectRef<Project> $project, ExecutionContext $originalContext, Ref.ObjectRef<Artifactual> $result, String $name, ArtifactRequest<I, O> $request, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #10
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 347, 0 -> 36, 1 -> 202, 2 -> 323
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield $project : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   44: getfield element : Ljava/lang/Object;
/*     */       //   47: checkcast com/intellij/openapi/components/ComponentManager
/*     */       //   50: astore_3
/*     */       //   51: iconst_0
/*     */       //   52: istore #4
/*     */       //   54: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   56: astore #5
/*     */       //   58: aload_3
/*     */       //   59: aload #5
/*     */       //   61: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */       //   66: dup
/*     */       //   67: ifnonnull -> 78
/*     */       //   70: pop
/*     */       //   71: aload_3
/*     */       //   72: aload #5
/*     */       //   74: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */       //   77: athrow
/*     */       //   78: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   81: astore_2
/*     */       //   82: aload_0
/*     */       //   83: getfield $originalContext : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   86: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   89: invokevirtual getOpenAIProxy : ()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */       //   92: astore_3
/*     */       //   93: aload_0
/*     */       //   94: getfield $originalContext : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   97: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   100: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   103: astore #4
/*     */       //   105: getstatic com/intellij/ml/llm/matterhorn/LegacyShellExecutor.Companion : Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor$Companion;
/*     */       //   108: getstatic com/intellij/ml/llm/matterhorn/MatterhornServiceScope.Companion : Lcom/intellij/ml/llm/matterhorn/MatterhornServiceScope$Companion;
/*     */       //   111: aload_0
/*     */       //   112: getfield $project : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   115: getfield element : Ljava/lang/Object;
/*     */       //   118: checkcast com/intellij/openapi/project/Project
/*     */       //   121: invokevirtual getScope : (Lcom/intellij/openapi/project/Project;)Lkotlinx/coroutines/CoroutineScope;
/*     */       //   124: aconst_null
/*     */       //   125: iconst_2
/*     */       //   126: aconst_null
/*     */       //   127: invokestatic launchLegacyExecutor$default : (Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor$Companion;Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */       //   130: astore #5
/*     */       //   132: aload_0
/*     */       //   133: getfield $project : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   136: getfield element : Ljava/lang/Object;
/*     */       //   139: checkcast com/intellij/openapi/project/Project
/*     */       //   142: invokestatic obtainAIIgnoreChecker : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function1;
/*     */       //   145: astore #6
/*     */       //   147: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */       //   150: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */       //   153: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1
/*     */       //   156: dup
/*     */       //   157: aload_2
/*     */       //   158: aload_3
/*     */       //   159: aload_0
/*     */       //   160: getfield $name : Ljava/lang/String;
/*     */       //   163: aload #4
/*     */       //   165: aload #5
/*     */       //   167: aload #6
/*     */       //   169: aconst_null
/*     */       //   170: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */       //   173: checkcast kotlin/jvm/functions/Function2
/*     */       //   176: aload_0
/*     */       //   177: checkcast kotlin/coroutines/Continuation
/*     */       //   180: aload_0
/*     */       //   181: aload_2
/*     */       //   182: putfield L$0 : Ljava/lang/Object;
/*     */       //   185: aload_0
/*     */       //   186: iconst_1
/*     */       //   187: putfield label : I
/*     */       //   190: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   193: dup
/*     */       //   194: aload #10
/*     */       //   196: if_acmpne -> 215
/*     */       //   199: aload #10
/*     */       //   201: areturn
/*     */       //   202: aload_0
/*     */       //   203: getfield L$0 : Ljava/lang/Object;
/*     */       //   206: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   209: astore_2
/*     */       //   210: aload_1
/*     */       //   211: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   214: aload_1
/*     */       //   215: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   218: astore #7
/*     */       //   220: aload #7
/*     */       //   222: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1
/*     */       //   225: dup
/*     */       //   226: aload_0
/*     */       //   227: getfield $name : Ljava/lang/String;
/*     */       //   230: aload_0
/*     */       //   231: getfield $originalContext : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   234: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)V
/*     */       //   237: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContextListener
/*     */       //   240: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;)V
/*     */       //   243: aload_0
/*     */       //   244: getfield $originalContext : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   247: invokevirtual getSource : ()Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */       //   250: dup
/*     */       //   251: ifnull -> 260
/*     */       //   254: invokevirtual copy : ()Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */       //   257: goto -> 262
/*     */       //   260: pop
/*     */       //   261: aconst_null
/*     */       //   262: astore #8
/*     */       //   264: aload_0
/*     */       //   265: getfield $result : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   268: astore #9
/*     */       //   270: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */       //   273: checkcast kotlin/coroutines/CoroutineContext
/*     */       //   276: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$2
/*     */       //   279: dup
/*     */       //   280: aload_2
/*     */       //   281: aload_0
/*     */       //   282: getfield $request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */       //   285: aload #8
/*     */       //   287: aload #7
/*     */       //   289: aconst_null
/*     */       //   290: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */       //   293: checkcast kotlin/jvm/functions/Function2
/*     */       //   296: aload_0
/*     */       //   297: checkcast kotlin/coroutines/Continuation
/*     */       //   300: aload_0
/*     */       //   301: aload #9
/*     */       //   303: putfield L$0 : Ljava/lang/Object;
/*     */       //   306: aload_0
/*     */       //   307: iconst_2
/*     */       //   308: putfield label : I
/*     */       //   311: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   314: dup
/*     */       //   315: aload #10
/*     */       //   317: if_acmpne -> 337
/*     */       //   320: aload #10
/*     */       //   322: areturn
/*     */       //   323: aload_0
/*     */       //   324: getfield L$0 : Ljava/lang/Object;
/*     */       //   327: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   330: astore #9
/*     */       //   332: aload_1
/*     */       //   333: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   336: aload_1
/*     */       //   337: aload #9
/*     */       //   339: swap
/*     */       //   340: putfield element : Ljava/lang/Object;
/*     */       //   343: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   346: areturn
/*     */       //   347: new java/lang/IllegalStateException
/*     */       //   350: dup
/*     */       //   351: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   353: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   356: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #87	-> 3
/*     */       //   #88	-> 40
/*     */       //   #215	-> 54
/*     */       //   #216	-> 58
/*     */       //   #88	-> 78
/*     */       //   #89	-> 82
/*     */       //   #90	-> 93
/*     */       //   #91	-> 105
/*     */       //   #92	-> 132
/*     */       //   #94	-> 147
/*     */       //   #87	-> 199
/*     */       //   #107	-> 220
/*     */       //   #143	-> 243
/*     */       //   #144	-> 264
/*     */       //   #87	-> 320
/*     */       //   #148	-> 343
/*     */       //   #87	-> 347
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   82	120	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   210	104	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   51	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */       //   93	100	3	lLMProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */       //   105	88	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   58	20	5	serviceClass$iv	Ljava/lang/Class;
/*     */       //   132	61	5	shellExecutor	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */       //   147	46	6	checker	Lkotlin/jvm/functions/Function1;
/*     */       //   220	94	7	root	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   264	50	8	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */       //   54	24	4	$i$f$service	I
/*     */       //   0	357	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3;
/*     */       //   40	307	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$3> $completion) { return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$3(this.$project, this.$originalContext, this.$result, this.$name, this.$request, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/*     */     @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RootExecutionContext>, Object> { int label;
/*     */       MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1(ArtifactRequestExecutorService $service, LLMProxy $lLMProxy, String $name, MatterhornPropertyProvider $propertyProvider, ShellExecutor $shellExecutor, Function1<Path, Boolean> $checker, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       public final Object invokeSuspend(Object $result) {
/*  94 */         IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  95 */             return new RootExecutionContext(
/*  96 */                 this.$service, 
/*  97 */                 this.$lLMProxy, 
/*  98 */                 this.$name, 
/*  99 */                 this.$shellExecutor::invokeSuspend$lambda$0, 
/* 100 */                 false, 
/* 101 */                 this.$propertyProvider, 
/* 102 */                 HumanInLoop.Companion.getALLOW_ALL(), 
/* 103 */                 new Function2<Path, Continuation<? super Boolean>, Object>(this.$checker, null) { int label; public final Object invokeSuspend(Object $result) { Path it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */ 
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                     Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$checker, $completion);
/*     */                     function2.L$0 = value;
/*     */                     return (Continuation)function2;
/*     */                   }
/*     */ 
/*     */                   
/*     */                   public final Object invoke(Path p1, Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   } }
/*     */               ); }
/*     */         
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */ 
/*     */       
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1> $completion) {
/*     */         return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1(this.$service, this.$lLMProxy, this.$name, this.$propertyProvider, this.$shellExecutor, this.$checker, $completion);
/*     */       }
/*     */       
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */       
/*     */       private static final ShellExecutor invokeSuspend$lambda$0(ShellExecutor $shellExecutor) {
/*     */         return $shellExecutor;
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {155}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$4")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$4
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Boolean>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     MatterhornForkedLocalExecutor$executeInForkedEnvironment$4(Ref.ObjectRef<Project> $project, Path $tempDirPath, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/* 150 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 151 */           if (this.$project.element != null) {
/* 152 */             ProjectManager.getInstance().closeAndDispose((Project)this.$project.element);
/*     */           }
/*     */           
/* 155 */           this.label = 1; if (CoroutinesKt.writeAction(this.$tempDirPath::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  return CoroutinesKt.writeAction(this.$tempDirPath::invokeSuspend$lambda$0, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/* 156 */     } public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$4> $completion) { return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$4(this.$project, this.$tempDirPath, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$4)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } private static final boolean invokeSuspend$lambda$0(Path $tempDirPath) { return FileUtil.delete($tempDirPath.toFile()); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornForkedLocalExecutor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */