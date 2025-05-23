/*    */ package com.intellij.ml.llm.matterhorn.ej.rustrover;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.SemanticChecker;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Triple;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.rust.cargo.project.workspace.CargoWorkspace;
/*    */ import org.rust.cargo.toolchain.RsToolchainBase;
/*    */ import org.rust.cargo.toolchain.tools.CargoCheckArgs;
/*    */ import org.rust.lang.core.psi.RsFile;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J$\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\006\020\t\032\0020\nH@¢\006\002\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverExternalLinterErrorChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker;", "<init>", "()V", "findErrors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-rustrover"})
/*    */ @SourceDebugExtension({"SMAP\nRustRoverExternalLinterErrorChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RustRoverExternalLinterErrorChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverExternalLinterErrorChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1611#2,9:54\n1863#2:63\n1864#2:65\n1620#2:66\n1#3:64\n*S KotlinDebug\n*F\n+ 1 RustRoverExternalLinterErrorChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverExternalLinterErrorChecker\n*L\n42#1:54,9\n42#1:63\n42#1:65\n42#1:66\n42#1:64\n*E\n"})
/*    */ public final class RustRoverExternalLinterErrorChecker implements SemanticChecker {
/*    */   @NotNull
/*    */   public String getNameForLogging() {
/* 18 */     return SemanticChecker.DefaultImpls.getNameForLogging(this);
/*    */   } @Nullable
/*    */   public Object findErrors(@NotNull Project project, @NotNull PsiFile file, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverExternalLinterErrorChecker$findErrors$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverExternalLinterErrorChecker$findErrors$1
/*    */     //   11: astore #29
/*    */     //   13: aload #29
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #29
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverExternalLinterErrorChecker$findErrors$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverExternalLinterErrorChecker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #29
/*    */     //   50: aload #29
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #28
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #30
/*    */     //   62: aload #29
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 537, 0 -> 92, 1 -> 141, 2 -> 264
/*    */     //   92: aload #28
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_2
/*    */     //   98: instanceof org/rust/lang/core/psi/RsFile
/*    */     //   101: ifne -> 108
/*    */     //   104: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   107: areturn
/*    */     //   108: aload_2
/*    */     //   109: aload_1
/*    */     //   110: <illegal opcode> invoke : (Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function0;
/*    */     //   115: aload #29
/*    */     //   117: aload #29
/*    */     //   119: aload_2
/*    */     //   120: putfield L$0 : Ljava/lang/Object;
/*    */     //   123: aload #29
/*    */     //   125: iconst_1
/*    */     //   126: putfield label : I
/*    */     //   129: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   132: dup
/*    */     //   133: aload #30
/*    */     //   135: if_acmpne -> 157
/*    */     //   138: aload #30
/*    */     //   140: areturn
/*    */     //   141: aload #29
/*    */     //   143: getfield L$0 : Ljava/lang/Object;
/*    */     //   146: checkcast com/intellij/psi/PsiFile
/*    */     //   149: astore_2
/*    */     //   150: aload #28
/*    */     //   152: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   155: aload #28
/*    */     //   157: checkcast kotlin/Triple
/*    */     //   160: dup
/*    */     //   161: ifnonnull -> 169
/*    */     //   164: pop
/*    */     //   165: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   168: areturn
/*    */     //   169: astore #4
/*    */     //   171: aload #4
/*    */     //   173: invokevirtual component1 : ()Ljava/lang/Object;
/*    */     //   176: checkcast org/rust/cargo/toolchain/RsToolchainBase
/*    */     //   179: astore #5
/*    */     //   181: aload #4
/*    */     //   183: invokevirtual component2 : ()Ljava/lang/Object;
/*    */     //   186: checkcast org/rust/cargo/toolchain/tools/CargoCheckArgs$SpecificTarget
/*    */     //   189: astore #6
/*    */     //   191: aload #4
/*    */     //   193: invokevirtual component3 : ()Ljava/lang/Object;
/*    */     //   196: checkcast java/lang/String
/*    */     //   199: astore #7
/*    */     //   201: getstatic org/rust/ide/annotator/external/RsExternalLinterService.Companion : Lorg/rust/ide/annotator/external/RsExternalLinterService$Companion;
/*    */     //   204: aload_2
/*    */     //   205: checkcast org/rust/lang/core/psi/RsFile
/*    */     //   208: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   211: astore #9
/*    */     //   213: aload #9
/*    */     //   215: ldc 'getProject(...)'
/*    */     //   217: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   220: aload #9
/*    */     //   222: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lorg/rust/ide/annotator/external/RsExternalLinterService;
/*    */     //   225: aload #5
/*    */     //   227: aload #6
/*    */     //   229: checkcast org/rust/cargo/toolchain/tools/CargoCheckArgs
/*    */     //   232: invokevirtual checkAsync : (Lorg/rust/cargo/toolchain/RsToolchainBase;Lorg/rust/cargo/toolchain/tools/CargoCheckArgs;)Lkotlinx/coroutines/Deferred;
/*    */     //   235: aload #29
/*    */     //   237: aload #29
/*    */     //   239: aload #7
/*    */     //   241: putfield L$0 : Ljava/lang/Object;
/*    */     //   244: aload #29
/*    */     //   246: iconst_2
/*    */     //   247: putfield label : I
/*    */     //   250: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   255: dup
/*    */     //   256: aload #30
/*    */     //   258: if_acmpne -> 281
/*    */     //   261: aload #30
/*    */     //   263: areturn
/*    */     //   264: aload #29
/*    */     //   266: getfield L$0 : Ljava/lang/Object;
/*    */     //   269: checkcast java/lang/String
/*    */     //   272: astore #7
/*    */     //   274: aload #28
/*    */     //   276: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   279: aload #28
/*    */     //   281: checkcast org/rust/ide/annotator/external/RsExternalLinterResult
/*    */     //   284: astore #8
/*    */     //   286: aload #8
/*    */     //   288: invokevirtual getMessages : ()Ljava/util/List;
/*    */     //   291: checkcast java/lang/Iterable
/*    */     //   294: astore #9
/*    */     //   296: iconst_0
/*    */     //   297: istore #10
/*    */     //   299: aload #9
/*    */     //   301: astore #11
/*    */     //   303: new java/util/ArrayList
/*    */     //   306: dup
/*    */     //   307: invokespecial <init> : ()V
/*    */     //   310: checkcast java/util/Collection
/*    */     //   313: astore #12
/*    */     //   315: iconst_0
/*    */     //   316: istore #13
/*    */     //   318: aload #11
/*    */     //   320: astore #14
/*    */     //   322: iconst_0
/*    */     //   323: istore #15
/*    */     //   325: aload #14
/*    */     //   327: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   332: astore #16
/*    */     //   334: aload #16
/*    */     //   336: invokeinterface hasNext : ()Z
/*    */     //   341: ifeq -> 523
/*    */     //   344: aload #16
/*    */     //   346: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   351: astore #17
/*    */     //   353: aload #17
/*    */     //   355: astore #18
/*    */     //   357: iconst_0
/*    */     //   358: istore #19
/*    */     //   360: aload #18
/*    */     //   362: checkcast org/rust/cargo/toolchain/impl/CargoTopMessage
/*    */     //   365: astore #20
/*    */     //   367: iconst_0
/*    */     //   368: istore #21
/*    */     //   370: aload #20
/*    */     //   372: invokevirtual getMessage : ()Lorg/rust/cargo/toolchain/impl/RustcMessage;
/*    */     //   375: invokevirtual getLevel : ()Ljava/lang/String;
/*    */     //   378: ldc 'error'
/*    */     //   380: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   383: ifne -> 390
/*    */     //   386: aconst_null
/*    */     //   387: goto -> 497
/*    */     //   390: aload #20
/*    */     //   392: invokevirtual getMessage : ()Lorg/rust/cargo/toolchain/impl/RustcMessage;
/*    */     //   395: invokevirtual getMainSpan : ()Lorg/rust/cargo/toolchain/impl/RustcSpan;
/*    */     //   398: dup
/*    */     //   399: ifnonnull -> 407
/*    */     //   402: pop
/*    */     //   403: aconst_null
/*    */     //   404: goto -> 497
/*    */     //   407: astore #22
/*    */     //   409: aload #22
/*    */     //   411: invokevirtual getFile_name : ()Ljava/lang/String;
/*    */     //   414: dup
/*    */     //   415: ifnonnull -> 423
/*    */     //   418: pop
/*    */     //   419: aconst_null
/*    */     //   420: goto -> 497
/*    */     //   423: astore #23
/*    */     //   425: aload #23
/*    */     //   427: invokestatic toSystemIndependentName : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   430: astore #24
/*    */     //   432: aload #7
/*    */     //   434: aload #24
/*    */     //   436: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   439: aload #24
/*    */     //   441: iconst_0
/*    */     //   442: iconst_2
/*    */     //   443: aconst_null
/*    */     //   444: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*    */     //   447: ifne -> 454
/*    */     //   450: aconst_null
/*    */     //   451: goto -> 497
/*    */     //   454: aload #20
/*    */     //   456: invokevirtual getMessage : ()Lorg/rust/cargo/toolchain/impl/RustcMessage;
/*    */     //   459: invokevirtual getRendered : ()Ljava/lang/String;
/*    */     //   462: dup
/*    */     //   463: ifnonnull -> 471
/*    */     //   466: pop
/*    */     //   467: aconst_null
/*    */     //   468: goto -> 497
/*    */     //   471: astore #25
/*    */     //   473: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError
/*    */     //   476: dup
/*    */     //   477: aload #22
/*    */     //   479: invokevirtual getLine_start : ()I
/*    */     //   482: aload #22
/*    */     //   484: invokevirtual getColumn_start : ()I
/*    */     //   487: aload #25
/*    */     //   489: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   494: invokespecial <init> : (IILjava/lang/String;)V
/*    */     //   497: dup
/*    */     //   498: ifnull -> 519
/*    */     //   501: astore #26
/*    */     //   503: iconst_0
/*    */     //   504: istore #27
/*    */     //   506: aload #12
/*    */     //   508: aload #26
/*    */     //   510: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   515: pop
/*    */     //   516: goto -> 520
/*    */     //   519: pop
/*    */     //   520: goto -> 334
/*    */     //   523: nop
/*    */     //   524: aload #12
/*    */     //   526: checkcast java/util/List
/*    */     //   529: nop
/*    */     //   530: checkcast java/lang/Iterable
/*    */     //   533: invokestatic distinct : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   536: areturn
/*    */     //   537: new java/lang/IllegalStateException
/*    */     //   540: dup
/*    */     //   541: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   543: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   546: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 60
/*    */     //   #23	-> 97
/*    */     //   #25	-> 108
/*    */     //   #19	-> 138
/*    */     //   #25	-> 157
/*    */     //   #36	-> 165
/*    */     //   #25	-> 169
/*    */     //   #38	-> 201
/*    */     //   #39	-> 225
/*    */     //   #40	-> 237
/*    */     //   #19	-> 261
/*    */     //   #38	-> 284
/*    */     //   #42	-> 286
/*    */     //   #54	-> 299
/*    */     //   #62	-> 318
/*    */     //   #63	-> 325
/*    */     //   #62	-> 360
/*    */     //   #43	-> 370
/*    */     //   #44	-> 390
/*    */     //   #45	-> 409
/*    */     //   #46	-> 425
/*    */     //   #47	-> 432
/*    */     //   #48	-> 454
/*    */     //   #49	-> 473
/*    */     //   #62	-> 497
/*    */     //   #64	-> 503
/*    */     //   #62	-> 506
/*    */     //   #62	-> 516
/*    */     //   #62	-> 519
/*    */     //   #63	-> 520
/*    */     //   #65	-> 523
/*    */     //   #66	-> 524
/*    */     //   #54	-> 529
/*    */     //   #50	-> 533
/*    */     //   #42	-> 536
/*    */     //   #19	-> 537
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	11	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   108	24	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	44	2	file	Lcom/intellij/psi/PsiFile;
/*    */     //   150	14	2	file	Lcom/intellij/psi/PsiFile;
/*    */     //   169	44	2	file	Lcom/intellij/psi/PsiFile;
/*    */     //   181	56	5	toolchain	Lorg/rust/cargo/toolchain/RsToolchainBase;
/*    */     //   191	46	6	externalLinterArgs	Lorg/rust/cargo/toolchain/tools/CargoCheckArgs$SpecificTarget;
/*    */     //   201	63	7	path	Ljava/lang/String;
/*    */     //   274	116	7	path	Ljava/lang/String;
/*    */     //   390	17	7	path	Ljava/lang/String;
/*    */     //   407	16	7	path	Ljava/lang/String;
/*    */     //   423	31	7	path	Ljava/lang/String;
/*    */     //   454	17	7	path	Ljava/lang/String;
/*    */     //   471	26	7	path	Ljava/lang/String;
/*    */     //   497	40	7	path	Ljava/lang/String;
/*    */     //   286	10	8	externalLinterResult	Lorg/rust/ide/annotator/external/RsExternalLinterResult;
/*    */     //   296	19	9	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*    */     //   315	7	11	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   315	75	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   390	17	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   407	16	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   423	31	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   454	17	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   471	26	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   497	29	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   322	12	14	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*    */     //   353	4	17	element$iv$iv$iv	Ljava/lang/Object;
/*    */     //   357	10	18	element$iv$iv	Ljava/lang/Object;
/*    */     //   367	130	20	it	Lorg/rust/cargo/toolchain/impl/CargoTopMessage;
/*    */     //   409	88	22	span	Lorg/rust/cargo/toolchain/impl/RustcSpan;
/*    */     //   425	72	23	fileName	Ljava/lang/String;
/*    */     //   432	65	24	spanFilePath	Ljava/lang/String;
/*    */     //   473	24	25	renderedMessage	Ljava/lang/String;
/*    */     //   503	13	26	it$iv$iv	Ljava/lang/Object;
/*    */     //   370	127	21	$i$a$-mapNotNull-RustRoverExternalLinterErrorChecker$findErrors$3	I
/*    */     //   506	10	27	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*    */     //   360	160	19	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*    */     //   325	199	15	$i$f$forEach	I
/*    */     //   318	208	13	$i$f$mapNotNullTo	I
/*    */     //   299	231	10	$i$f$mapNotNull	I
/*    */     //   0	547	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	487	29	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	480	28	$result	Ljava/lang/Object;
/*    */   } private static final Triple findErrors$lambda$0(PsiFile $file, Project $project) {
/*    */     String filePath;
/*    */     RsToolchainBase toolchain;
/*    */     CargoWorkspace.Target cargoTarget;
/* 26 */     if (((RsFile)$file).getVirtualFile() == null || ((RsFile)$file).getVirtualFile().getPath() == null) { ((RsFile)$file).getVirtualFile().getPath(); return null; }
/* 27 */      if (RustProjectSettingsServiceKt.getToolchain($project) == null) { RustProjectSettingsServiceKt.getToolchain($project); return null; }
/*    */     
/* 29 */     if (RsElementKt.getContainingCargoTarget((PsiElement)$file) == null) { RsElementKt.getContainingCargoTarget((PsiElement)$file); return null; }
/* 30 */      if (cargoTarget.getPkg().getOrigin() != PackageOrigin.WORKSPACE) return null;
/*    */     
/* 32 */     Intrinsics.checkNotNull(CargoCheckArgs.Companion.forTarget($project, cargoTarget), "null cannot be cast to non-null type org.rust.cargo.toolchain.tools.CargoCheckArgs.SpecificTarget"); CargoCheckArgs.SpecificTarget args = 
/* 33 */       CargoCheckArgs.SpecificTarget.copy$default((CargoCheckArgs.SpecificTarget)CargoCheckArgs.Companion.forTarget($project, cargoTarget), ExternalLinter.CARGO_CHECK, null, null, null, null, null, 62, null);
/*    */     
/* 35 */     return new Triple(toolchain, args, filePath);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "RustRoverExternalLinterErrorChecker.kt", l = {25, 40}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"file", "path"}, m = "findErrors", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverExternalLinterErrorChecker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class RustRoverExternalLinterErrorChecker$findErrors$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     RustRoverExternalLinterErrorChecker$findErrors$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return RustRoverExternalLinterErrorChecker.this.findErrors(null, null, (Continuation<? super List<? extends Error>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\RustRoverExternalLinterErrorChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */