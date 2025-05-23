/*    */ package com.intellij.ml.llm.matterhorn.ej.clion;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.jetbrains.cidr.radler.inspections.RadInspection;
/*    */ import com.jetbrains.rd.util.lifetime.LifetimeDefinition;
/*    */ import com.jetbrains.rider.model.Issue;
/*    */ import com.jetbrains.rider.model.IssueGroup;
/*    */ import java.util.List;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J$\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\006\020\t\032\0020\nH@¢\006\002\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/clion/RadErrorChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker;", "<init>", "()V", "findErrors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-clion"})
/*    */ @SourceDebugExtension({"SMAP\nRadErrorChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadErrorChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/clion/RadErrorChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n774#2:49\n865#2,2:50\n1557#2:52\n1628#2,3:53\n*S KotlinDebug\n*F\n+ 1 RadErrorChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/clion/RadErrorChecker\n*L\n37#1:49\n37#1:50,2\n39#1:52\n39#1:53,3\n*E\n"})
/*    */ public final class RadErrorChecker implements SemanticChecker {
/*    */   @NotNull
/*    */   public String getNameForLogging() {
/* 20 */     return SemanticChecker.DefaultImpls.getNameForLogging(this);
/*    */   } @Nullable
/*    */   public Object findErrors(@NotNull Project project, @NotNull PsiFile file, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   6: dup
/*    */     //   7: ldc 'getProject(...)'
/*    */     //   9: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: astore #4
/*    */     //   14: getstatic com/intellij/platform/backend/workspace/WorkspaceModel.Companion : Lcom/intellij/platform/backend/workspace/WorkspaceModel$Companion;
/*    */     //   17: aload #4
/*    */     //   19: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/platform/backend/workspace/WorkspaceModel;
/*    */     //   22: astore #5
/*    */     //   24: aload #5
/*    */     //   26: aload_2
/*    */     //   27: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   32: dup
/*    */     //   33: ldc 'getVirtualFile(...)'
/*    */     //   35: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   38: aload #4
/*    */     //   40: invokestatic getProjectModelEntities : (Lcom/intellij/platform/backend/workspace/WorkspaceModel;Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/openapi/project/Project;)Ljava/util/List;
/*    */     //   43: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   46: checkcast com/jetbrains/rider/projectView/workspace/ProjectModelEntity
/*    */     //   49: dup
/*    */     //   50: ifnull -> 68
/*    */     //   53: aload #4
/*    */     //   55: invokestatic getId : (Lcom/jetbrains/rider/projectView/workspace/ProjectModelEntity;Lcom/intellij/openapi/project/Project;)Ljava/lang/Integer;
/*    */     //   58: dup
/*    */     //   59: ifnull -> 68
/*    */     //   62: invokevirtual intValue : ()I
/*    */     //   65: goto -> 73
/*    */     //   68: pop
/*    */     //   69: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   72: areturn
/*    */     //   73: istore #6
/*    */     //   75: new com/jetbrains/rd/util/lifetime/LifetimeDefinition
/*    */     //   78: dup
/*    */     //   79: invokespecial <init> : ()V
/*    */     //   82: astore #7
/*    */     //   84: nop
/*    */     //   85: new com/intellij/ml/llm/matterhorn/ej/clion/RadErrorChecker$findErrors$errors$1
/*    */     //   88: dup
/*    */     //   89: aload_2
/*    */     //   90: aload #7
/*    */     //   92: aload #4
/*    */     //   94: iload #6
/*    */     //   96: aconst_null
/*    */     //   97: invokespecial <init> : (Lcom/intellij/psi/PsiFile;Lcom/jetbrains/rd/util/lifetime/LifetimeDefinition;Lcom/intellij/openapi/project/Project;ILkotlin/coroutines/Continuation;)V
/*    */     //   100: checkcast kotlin/jvm/functions/Function2
/*    */     //   103: invokestatic runBlockingCancellable : (Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
/*    */     //   106: checkcast java/util/List
/*    */     //   109: astore #8
/*    */     //   111: aload #8
/*    */     //   113: checkcast java/lang/Iterable
/*    */     //   116: astore #9
/*    */     //   118: iconst_0
/*    */     //   119: istore #10
/*    */     //   121: aload #9
/*    */     //   123: astore #11
/*    */     //   125: new java/util/ArrayList
/*    */     //   128: dup
/*    */     //   129: invokespecial <init> : ()V
/*    */     //   132: checkcast java/util/Collection
/*    */     //   135: astore #12
/*    */     //   137: iconst_0
/*    */     //   138: istore #13
/*    */     //   140: aload #11
/*    */     //   142: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   147: astore #14
/*    */     //   149: aload #14
/*    */     //   151: invokeinterface hasNext : ()Z
/*    */     //   156: ifeq -> 210
/*    */     //   159: aload #14
/*    */     //   161: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   166: astore #15
/*    */     //   168: aload #15
/*    */     //   170: checkcast com/jetbrains/rider/model/Issue
/*    */     //   173: astore #16
/*    */     //   175: iconst_0
/*    */     //   176: istore #17
/*    */     //   178: aload #16
/*    */     //   180: invokevirtual getSeverity : ()Lcom/jetbrains/rider/model/IssueSeverity;
/*    */     //   183: getstatic com/jetbrains/rider/model/IssueSeverity.Error : Lcom/jetbrains/rider/model/IssueSeverity;
/*    */     //   186: if_acmpne -> 193
/*    */     //   189: iconst_1
/*    */     //   190: goto -> 194
/*    */     //   193: iconst_0
/*    */     //   194: ifeq -> 149
/*    */     //   197: aload #12
/*    */     //   199: aload #15
/*    */     //   201: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   206: pop
/*    */     //   207: goto -> 149
/*    */     //   210: aload #12
/*    */     //   212: checkcast java/util/List
/*    */     //   215: nop
/*    */     //   216: checkcast java/lang/Iterable
/*    */     //   219: astore #9
/*    */     //   221: nop
/*    */     //   222: iconst_0
/*    */     //   223: istore #10
/*    */     //   225: aload #9
/*    */     //   227: astore #11
/*    */     //   229: new java/util/ArrayList
/*    */     //   232: dup
/*    */     //   233: aload #9
/*    */     //   235: bipush #10
/*    */     //   237: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   240: invokespecial <init> : (I)V
/*    */     //   243: checkcast java/util/Collection
/*    */     //   246: astore #12
/*    */     //   248: iconst_0
/*    */     //   249: istore #13
/*    */     //   251: aload #11
/*    */     //   253: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   258: astore #14
/*    */     //   260: aload #14
/*    */     //   262: invokeinterface hasNext : ()Z
/*    */     //   267: ifeq -> 322
/*    */     //   270: aload #14
/*    */     //   272: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   277: astore #15
/*    */     //   279: aload #12
/*    */     //   281: aload #15
/*    */     //   283: checkcast com/jetbrains/rider/model/Issue
/*    */     //   286: astore #16
/*    */     //   288: astore #18
/*    */     //   290: iconst_0
/*    */     //   291: istore #17
/*    */     //   293: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/OffsetError
/*    */     //   296: dup
/*    */     //   297: aload #16
/*    */     //   299: invokevirtual getStart : ()I
/*    */     //   302: aload #16
/*    */     //   304: invokevirtual getDescription : ()Ljava/lang/String;
/*    */     //   307: invokespecial <init> : (ILjava/lang/String;)V
/*    */     //   310: aload #18
/*    */     //   312: swap
/*    */     //   313: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   318: pop
/*    */     //   319: goto -> 260
/*    */     //   322: aload #12
/*    */     //   324: checkcast java/util/List
/*    */     //   327: nop
/*    */     //   328: astore #9
/*    */     //   330: aconst_null
/*    */     //   331: aload #7
/*    */     //   333: <illegal opcode> invoke : (Lcom/jetbrains/rd/util/lifetime/LifetimeDefinition;)Lkotlin/jvm/functions/Function0;
/*    */     //   338: iconst_1
/*    */     //   339: aconst_null
/*    */     //   340: invokestatic runInEdt$default : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*    */     //   343: aload #9
/*    */     //   345: areturn
/*    */     //   346: astore #9
/*    */     //   348: aconst_null
/*    */     //   349: aload #7
/*    */     //   351: <illegal opcode> invoke : (Lcom/jetbrains/rd/util/lifetime/LifetimeDefinition;)Lkotlin/jvm/functions/Function0;
/*    */     //   356: iconst_1
/*    */     //   357: aconst_null
/*    */     //   358: invokestatic runInEdt$default : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*    */     //   361: aload #9
/*    */     //   363: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 0
/*    */     //   #26	-> 14
/*    */     //   #27	-> 24
/*    */     //   #29	-> 75
/*    */     //   #30	-> 84
/*    */     //   #31	-> 85
/*    */     //   #37	-> 111
/*    */     //   #49	-> 121
/*    */     //   #50	-> 140
/*    */     //   #38	-> 178
/*    */     //   #50	-> 194
/*    */     //   #51	-> 210
/*    */     //   #49	-> 215
/*    */     //   #39	-> 221
/*    */     //   #52	-> 225
/*    */     //   #53	-> 251
/*    */     //   #54	-> 279
/*    */     //   #40	-> 293
/*    */     //   #54	-> 313
/*    */     //   #55	-> 322
/*    */     //   #52	-> 327
/*    */     //   #43	-> 330
/*    */     //   #37	-> 345
/*    */     //   #43	-> 346
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   178	16	17	$i$a$-filter-RadErrorChecker$findErrors$2	I
/*    */     //   175	19	16	it	Lcom/jetbrains/rider/model/Issue;
/*    */     //   168	39	15	element$iv$iv	Ljava/lang/Object;
/*    */     //   140	72	13	$i$f$filterTo	I
/*    */     //   137	75	11	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   137	75	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   121	95	10	$i$f$filter	I
/*    */     //   118	98	9	$this$filter$iv	Ljava/lang/Iterable;
/*    */     //   293	17	17	$i$a$-map-RadErrorChecker$findErrors$3	I
/*    */     //   290	20	16	it	Lcom/jetbrains/rider/model/Issue;
/*    */     //   279	40	15	item$iv$iv	Ljava/lang/Object;
/*    */     //   251	73	13	$i$f$mapTo	I
/*    */     //   248	76	11	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   248	76	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   225	103	10	$i$f$map	I
/*    */     //   222	106	9	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   111	219	8	errors	Ljava/util/List;
/*    */     //   343	3	8	errors	Ljava/util/List;
/*    */     //   14	350	4	project	Lcom/intellij/openapi/project/Project;
/*    */     //   24	340	5	workspaceModel	Lcom/intellij/platform/backend/workspace/WorkspaceModel;
/*    */     //   75	289	6	id	I
/*    */     //   84	280	7	def	Lcom/jetbrains/rd/util/lifetime/LifetimeDefinition;
/*    */     //   0	364	0	this	Lcom/intellij/ml/llm/matterhorn/ej/clion/RadErrorChecker;
/*    */     //   0	364	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	364	2	file	Lcom/intellij/psi/PsiFile;
/*    */     //   0	364	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   84	330	346	finally
/*    */     //   346	348	346	finally
/*    */   }
/*    */   @DebugMetadata(f = "RadErrorChecker.kt", l = {32}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.clion.RadErrorChecker$findErrors$errors$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/jetbrains/rider/model/Issue;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class RadErrorChecker$findErrors$errors$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Issue>>, Object> { int label;
/*    */     RadErrorChecker$findErrors$errors$1(PsiFile $file, LifetimeDefinition $def, Project $project, int $id, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/* 31 */     public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 32 */           this.label = 1; if (RadDiagnosticUtilKt.withBackendThreadDumps-rnQQ1Ag(DurationKt.toDuration(5, DurationUnit.MINUTES), "runBackendSession(" + this.$file.getName() + ")", new Function1<Continuation<? super List<? extends Issue>>, Object>(this.$def, this.$project, this.$id, null) { int label; public final Continuation<Unit> create(Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$def, this.$project, this.$id, $completion); } public final Object invoke(Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 33 */                       this.label = 1; if (RadInspection.Companion.runBackendSession(this.$def.getLifetime(), this.$project, this.$id, IssueGroup.All, (Continuation)this) == object) return object;  return RadInspection.Companion.runBackendSession(this.$def.getLifetime(), this.$project, this.$id, IssueGroup.All, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  return RadDiagnosticUtilKt.withBackendThreadDumps-rnQQ1Ag(DurationKt.toDuration(5, DurationUnit.MINUTES), "runBackendSession(" + this.$file.getName() + ")", new Function1<Continuation<? super List<? extends Issue>>, Object>(this.$def, this.$project, this.$id, null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (RadInspection.Companion.runBackendSession(this.$def.getLifetime(), this.$project, this.$id, IssueGroup.All, (Continuation)this) == object) return object;  return RadInspection.Companion.runBackendSession(this.$def.getLifetime(), this.$project, this.$id, IssueGroup.All, (Continuation)this);
/*    */                     case 1:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$def, this.$project, this.$id, $completion); }
/*    */                 public final Object invoke(Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super RadErrorChecker$findErrors$errors$1> $completion) { return (Continuation<Unit>)new RadErrorChecker$findErrors$errors$1(this.$file, this.$def, this.$project, this.$id, $completion); }
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((RadErrorChecker$findErrors$errors$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 44 */   private static final Unit findErrors$lambda$2(LifetimeDefinition $def) { LifetimeDefinition.terminate$default($def, false, 1, null);
/* 45 */     return Unit.INSTANCE; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\clion\RadErrorChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */