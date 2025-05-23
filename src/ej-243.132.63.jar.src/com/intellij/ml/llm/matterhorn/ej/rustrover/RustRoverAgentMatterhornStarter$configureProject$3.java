/*     */ package com.intellij.ml.llm.matterhorn.ej.rustrover;
/*     */ 
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.rust.ide.inspections.CargoCommandLineInspectionProjectConfigurator;
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
/*     */ @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {165}, i = {0}, s = {"L$0"}, n = {"deferred"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter$configureProject$3")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nRustRoverAgentMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RustRoverAgentMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,157:1\n53#2,8:158\n*S KotlinDebug\n*F\n+ 1 RustRoverAgentMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3\n*L\n101#1:158,8\n*E\n"})
/*     */ final class RustRoverAgentMatterhornStarter$configureProject$3
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   RustRoverAgentMatterhornStarter$configureProject$3(Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #10
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 220, 0 -> 32, 1 -> 178
/*     */     //   32: aload_1
/*     */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   36: aload_0
/*     */     //   37: getfield L$0 : Ljava/lang/Object;
/*     */     //   40: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   43: astore_2
/*     */     //   44: aload_2
/*     */     //   45: aconst_null
/*     */     //   46: aconst_null
/*     */     //   47: new com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3$deferred$1
/*     */     //   50: dup
/*     */     //   51: aload_0
/*     */     //   52: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   55: aconst_null
/*     */     //   56: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */     //   59: checkcast kotlin/jvm/functions/Function2
/*     */     //   62: iconst_3
/*     */     //   63: aconst_null
/*     */     //   64: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */     //   67: astore_3
/*     */     //   68: nop
/*     */     //   69: iconst_0
/*     */     //   70: istore #5
/*     */     //   72: nop
/*     */     //   73: new kotlinx/coroutines/selects/SelectImplementation
/*     */     //   76: dup
/*     */     //   77: aload_0
/*     */     //   78: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   83: invokespecial <init> : (Lkotlin/coroutines/CoroutineContext;)V
/*     */     //   86: astore #6
/*     */     //   88: iconst_0
/*     */     //   89: istore #7
/*     */     //   91: aload #6
/*     */     //   93: checkcast kotlinx/coroutines/selects/SelectBuilder
/*     */     //   96: astore #8
/*     */     //   98: iconst_0
/*     */     //   99: istore #9
/*     */     //   101: aload #8
/*     */     //   103: aload_3
/*     */     //   104: invokeinterface getOnAwait : ()Lkotlinx/coroutines/selects/SelectClause1;
/*     */     //   109: new com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3$done$1$1
/*     */     //   112: dup
/*     */     //   113: aconst_null
/*     */     //   114: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   117: checkcast kotlin/jvm/functions/Function2
/*     */     //   120: invokeinterface invoke : (Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V
/*     */     //   125: aload #8
/*     */     //   127: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */     //   130: pop
/*     */     //   131: iconst_5
/*     */     //   132: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
/*     */     //   135: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */     //   138: new com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3$done$1$2
/*     */     //   141: dup
/*     */     //   142: aconst_null
/*     */     //   143: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   146: checkcast kotlin/jvm/functions/Function1
/*     */     //   149: invokestatic onTimeout-8Mi8wO0 : (Lkotlinx/coroutines/selects/SelectBuilder;JLkotlin/jvm/functions/Function1;)V
/*     */     //   152: nop
/*     */     //   153: aload #6
/*     */     //   155: aload_0
/*     */     //   156: aload_0
/*     */     //   157: aload_3
/*     */     //   158: putfield L$0 : Ljava/lang/Object;
/*     */     //   161: aload_0
/*     */     //   162: iconst_1
/*     */     //   163: putfield label : I
/*     */     //   166: invokevirtual doSelect : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   169: dup
/*     */     //   170: aload #10
/*     */     //   172: if_acmpne -> 197
/*     */     //   175: aload #10
/*     */     //   177: areturn
/*     */     //   178: iconst_0
/*     */     //   179: istore #5
/*     */     //   181: iconst_0
/*     */     //   182: istore #7
/*     */     //   184: aload_0
/*     */     //   185: getfield L$0 : Ljava/lang/Object;
/*     */     //   188: checkcast kotlinx/coroutines/Deferred
/*     */     //   191: astore_3
/*     */     //   192: aload_1
/*     */     //   193: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   196: aload_1
/*     */     //   197: nop
/*     */     //   198: nop
/*     */     //   199: nop
/*     */     //   200: checkcast java/lang/Boolean
/*     */     //   203: invokevirtual booleanValue : ()Z
/*     */     //   206: istore #4
/*     */     //   208: iload #4
/*     */     //   210: ifeq -> 68
/*     */     //   213: goto -> 216
/*     */     //   216: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   219: areturn
/*     */     //   220: new java/lang/IllegalStateException
/*     */     //   223: dup
/*     */     //   224: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   226: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   229: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #95	-> 3
/*     */     //   #96	-> 44
/*     */     //   #100	-> 68
/*     */     //   #101	-> 69
/*     */     //   #158	-> 72
/*     */     //   #161	-> 73
/*     */     //   #161	-> 83
/*     */     //   #162	-> 91
/*     */     //   #102	-> 101
/*     */     //   #105	-> 125
/*     */     //   #105	-> 138
/*     */     //   #109	-> 152
/*     */     //   #162	-> 153
/*     */     //   #165	-> 153
/*     */     //   #95	-> 175
/*     */     //   #165	-> 197
/*     */     //   #161	-> 198
/*     */     //   #161	-> 199
/*     */     //   #101	-> 200
/*     */     //   #110	-> 208
/*     */     //   #112	-> 216
/*     */     //   #95	-> 220
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	24	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   68	110	3	deferred	Lkotlinx/coroutines/Deferred;
/*     */     //   192	28	3	deferred	Lkotlinx/coroutines/Deferred;
/*     */     //   208	8	4	done	Z
/*     */     //   88	65	6	$this$select_u24lambda_u241$iv	Lkotlinx/coroutines/selects/SelectImplementation;
/*     */     //   153	16	6	$this$select_u24lambda_u241$iv	Lkotlinx/coroutines/selects/SelectImplementation;
/*     */     //   98	55	8	$this$invokeSuspend_u24lambda_u240	Lkotlinx/coroutines/selects/SelectBuilder;
/*     */     //   101	52	9	$i$a$-select-RustRoverAgentMatterhornStarter$configureProject$3$done$1	I
/*     */     //   91	87	7	$i$a$-run-SelectKt$select$3$iv	I
/*     */     //   72	106	5	$i$f$select	I
/*     */     //   0	230	0	this	Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3;
/*     */     //   36	184	1	$result	Ljava/lang/Object;
/*     */     //   184	14	7	$i$a$-run-SelectKt$select$3$iv	I
/*     */     //   181	19	5	$i$f$select	I
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super RustRoverAgentMatterhornStarter$configureProject$3> $completion) {
/*     */     RustRoverAgentMatterhornStarter$configureProject$3 rustRoverAgentMatterhornStarter$configureProject$3 = new RustRoverAgentMatterhornStarter$configureProject$3(this.$project, $completion);
/*     */     rustRoverAgentMatterhornStarter$configureProject$3.L$0 = value;
/*     */     return (Continuation<Unit>)rustRoverAgentMatterhornStarter$configureProject$3;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((RustRoverAgentMatterhornStarter$configureProject$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter$configureProject$3$deferred$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RustRoverAgentMatterhornStarter$configureProject$3$deferred$1
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     RustRoverAgentMatterhornStarter$configureProject$3$deferred$1(Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RustRoverAgentMatterhornStarter$configureProject$3$deferred$1> $completion) {
/*     */       return (Continuation<Unit>)new RustRoverAgentMatterhornStarter$configureProject$3$deferred$1(this.$project, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*  96 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  97 */           (new CargoCommandLineInspectionProjectConfigurator()).configureProject(this.$project, new RustRoverAgentMatterhornStarter.FakeConfiguratorContext());
/*  98 */           return Unit.INSTANCE; }
/*     */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((RustRoverAgentMatterhornStarter$configureProject$3$deferred$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/*     */   } @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter$configureProject$3$done$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\020\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", ""}) static final class RustRoverAgentMatterhornStarter$configureProject$3$done$1$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Boolean>, Object> {
/* 102 */     int label; RustRoverAgentMatterhornStarter$configureProject$3$done$1$1(Continuation $completion) { super(2, $completion); } public final Continuation<Unit> create(Object value, Continuation<? super RustRoverAgentMatterhornStarter$configureProject$3$done$1$1> $completion) { return (Continuation<Unit>)new RustRoverAgentMatterhornStarter$configureProject$3$done$1$1($completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 103 */           return Boxing.boxBoolean(true); }
/*     */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(Unit p1, Continuation<?> p2) { return ((RustRoverAgentMatterhornStarter$configureProject$3$done$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/* 105 */   } @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter$configureProject$3$done$1$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class RustRoverAgentMatterhornStarter$configureProject$3$done$1$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 106 */           RustRoverAgentMatterhornStarter.access$getLogger$cp().info("Still waiting for Cargo project configuration...");
/* 107 */           return Boxing.boxBoolean(false); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */     
/*     */     int label;
/*     */     
/*     */     RustRoverAgentMatterhornStarter$configureProject$3$done$1$2(Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super RustRoverAgentMatterhornStarter$configureProject$3$done$1$2> $completion) {
/*     */       return (Continuation<Unit>)new RustRoverAgentMatterhornStarter$configureProject$3$done$1$2($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((RustRoverAgentMatterhornStarter$configureProject$3$done$1$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\RustRoverAgentMatterhornStarter$configureProject$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */