/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.Artifact;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.ml.llm.matterhorn.CancelledArtifact;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.FailedArtifact;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornServiceScope;
/*     */ import com.intellij.ml.llm.matterhorn.ProjectFileStructure;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContextListener;
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.TrajectoryElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.nio.file.Path;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {94, 144}, i = {0}, s = {"L$0"}, n = {"service"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$3")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractMultiAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,214:1\n31#2,2:215\n*S KotlinDebug\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3\n*L\n88#1:215,2\n*E\n"})
/*     */ final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$3
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   MatterhornForkedLocalExecutor$executeInForkedEnvironment$3(Ref.ObjectRef<Project> $project, ExecutionContext $originalContext, Ref.ObjectRef<Artifactual> $result, String $name, ArtifactRequest<I, O> $request, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #10
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 347, 0 -> 36, 1 -> 202, 2 -> 323
/*     */     //   36: aload_1
/*     */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield $project : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   44: getfield element : Ljava/lang/Object;
/*     */     //   47: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   50: astore_3
/*     */     //   51: iconst_0
/*     */     //   52: istore #4
/*     */     //   54: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   56: astore #5
/*     */     //   58: aload_3
/*     */     //   59: aload #5
/*     */     //   61: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   66: dup
/*     */     //   67: ifnonnull -> 78
/*     */     //   70: pop
/*     */     //   71: aload_3
/*     */     //   72: aload #5
/*     */     //   74: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   77: athrow
/*     */     //   78: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   81: astore_2
/*     */     //   82: aload_0
/*     */     //   83: getfield $originalContext : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   86: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   89: invokevirtual getOpenAIProxy : ()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   92: astore_3
/*     */     //   93: aload_0
/*     */     //   94: getfield $originalContext : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   97: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   100: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   103: astore #4
/*     */     //   105: getstatic com/intellij/ml/llm/matterhorn/LegacyShellExecutor.Companion : Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor$Companion;
/*     */     //   108: getstatic com/intellij/ml/llm/matterhorn/MatterhornServiceScope.Companion : Lcom/intellij/ml/llm/matterhorn/MatterhornServiceScope$Companion;
/*     */     //   111: aload_0
/*     */     //   112: getfield $project : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   115: getfield element : Ljava/lang/Object;
/*     */     //   118: checkcast com/intellij/openapi/project/Project
/*     */     //   121: invokevirtual getScope : (Lcom/intellij/openapi/project/Project;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   124: aconst_null
/*     */     //   125: iconst_2
/*     */     //   126: aconst_null
/*     */     //   127: invokestatic launchLegacyExecutor$default : (Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor$Companion;Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   130: astore #5
/*     */     //   132: aload_0
/*     */     //   133: getfield $project : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   136: getfield element : Ljava/lang/Object;
/*     */     //   139: checkcast com/intellij/openapi/project/Project
/*     */     //   142: invokestatic obtainAIIgnoreChecker : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function1;
/*     */     //   145: astore #6
/*     */     //   147: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   150: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   153: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1
/*     */     //   156: dup
/*     */     //   157: aload_2
/*     */     //   158: aload_3
/*     */     //   159: aload_0
/*     */     //   160: getfield $name : Ljava/lang/String;
/*     */     //   163: aload #4
/*     */     //   165: aload #5
/*     */     //   167: aload #6
/*     */     //   169: aconst_null
/*     */     //   170: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   173: checkcast kotlin/jvm/functions/Function2
/*     */     //   176: aload_0
/*     */     //   177: checkcast kotlin/coroutines/Continuation
/*     */     //   180: aload_0
/*     */     //   181: aload_2
/*     */     //   182: putfield L$0 : Ljava/lang/Object;
/*     */     //   185: aload_0
/*     */     //   186: iconst_1
/*     */     //   187: putfield label : I
/*     */     //   190: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   193: dup
/*     */     //   194: aload #10
/*     */     //   196: if_acmpne -> 215
/*     */     //   199: aload #10
/*     */     //   201: areturn
/*     */     //   202: aload_0
/*     */     //   203: getfield L$0 : Ljava/lang/Object;
/*     */     //   206: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   209: astore_2
/*     */     //   210: aload_1
/*     */     //   211: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   214: aload_1
/*     */     //   215: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   218: astore #7
/*     */     //   220: aload #7
/*     */     //   222: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1
/*     */     //   225: dup
/*     */     //   226: aload_0
/*     */     //   227: getfield $name : Ljava/lang/String;
/*     */     //   230: aload_0
/*     */     //   231: getfield $originalContext : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   234: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)V
/*     */     //   237: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContextListener
/*     */     //   240: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;)V
/*     */     //   243: aload_0
/*     */     //   244: getfield $originalContext : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   247: invokevirtual getSource : ()Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   250: dup
/*     */     //   251: ifnull -> 260
/*     */     //   254: invokevirtual copy : ()Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   257: goto -> 262
/*     */     //   260: pop
/*     */     //   261: aconst_null
/*     */     //   262: astore #8
/*     */     //   264: aload_0
/*     */     //   265: getfield $result : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   268: astore #9
/*     */     //   270: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   273: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   276: new com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$2
/*     */     //   279: dup
/*     */     //   280: aload_2
/*     */     //   281: aload_0
/*     */     //   282: getfield $request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   285: aload #8
/*     */     //   287: aload #7
/*     */     //   289: aconst_null
/*     */     //   290: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   293: checkcast kotlin/jvm/functions/Function2
/*     */     //   296: aload_0
/*     */     //   297: checkcast kotlin/coroutines/Continuation
/*     */     //   300: aload_0
/*     */     //   301: aload #9
/*     */     //   303: putfield L$0 : Ljava/lang/Object;
/*     */     //   306: aload_0
/*     */     //   307: iconst_2
/*     */     //   308: putfield label : I
/*     */     //   311: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   314: dup
/*     */     //   315: aload #10
/*     */     //   317: if_acmpne -> 337
/*     */     //   320: aload #10
/*     */     //   322: areturn
/*     */     //   323: aload_0
/*     */     //   324: getfield L$0 : Ljava/lang/Object;
/*     */     //   327: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   330: astore #9
/*     */     //   332: aload_1
/*     */     //   333: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   336: aload_1
/*     */     //   337: aload #9
/*     */     //   339: swap
/*     */     //   340: putfield element : Ljava/lang/Object;
/*     */     //   343: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   346: areturn
/*     */     //   347: new java/lang/IllegalStateException
/*     */     //   350: dup
/*     */     //   351: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   353: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   356: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 3
/*     */     //   #88	-> 40
/*     */     //   #215	-> 54
/*     */     //   #216	-> 58
/*     */     //   #88	-> 78
/*     */     //   #89	-> 82
/*     */     //   #90	-> 93
/*     */     //   #91	-> 105
/*     */     //   #92	-> 132
/*     */     //   #94	-> 147
/*     */     //   #87	-> 199
/*     */     //   #107	-> 220
/*     */     //   #143	-> 243
/*     */     //   #144	-> 264
/*     */     //   #87	-> 320
/*     */     //   #148	-> 343
/*     */     //   #87	-> 347
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   82	120	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   210	104	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   51	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   93	100	3	lLMProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   105	88	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   58	20	5	serviceClass$iv	Ljava/lang/Class;
/*     */     //   132	61	5	shellExecutor	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   147	46	6	checker	Lkotlin/jvm/functions/Function1;
/*     */     //   220	94	7	root	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   264	50	8	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   54	24	4	$i$f$service	I
/*     */     //   0	357	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3;
/*     */     //   40	307	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$3> $completion) {
/*     */     return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$3(this.$project, this.$originalContext, this.$result, this.$name, this.$request, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super RootExecutionContext>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1(ArtifactRequestExecutorService $service, LLMProxy $lLMProxy, String $name, MatterhornPropertyProvider $propertyProvider, ShellExecutor $shellExecutor, Function1<Path, Boolean> $checker, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*  94 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  95 */           return new RootExecutionContext(
/*  96 */               this.$service, 
/*  97 */               this.$lLMProxy, 
/*  98 */               this.$name, 
/*  99 */               this.$shellExecutor::invokeSuspend$lambda$0, 
/* 100 */               false, 
/* 101 */               this.$propertyProvider, 
/* 102 */               HumanInLoop.Companion.getALLOW_ALL(), 
/* 103 */               new Function2<Path, Continuation<? super Boolean>, Object>(this.$checker, null) { public final Object invokeSuspend(Object $result) { Path it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */                 
/*     */                 int label;
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$checker, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(Path p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 } }
/*     */             ); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1> $completion) {
/*     */       return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1(this.$service, this.$lLMProxy, this.$name, this.$propertyProvider, this.$shellExecutor, this.$checker, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$root$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final ShellExecutor invokeSuspend$lambda$0(ShellExecutor $shellExecutor) {
/*     */       return $shellExecutor;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornForkedLocalExecutor$executeInForkedEnvironment$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */