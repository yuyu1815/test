/*     */ package com.intellij.ml.llm.matterhorn.ej.rustrover;
/*     */ import com.intellij.ide.CommandLineInspectionProgressReporter;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.openapi.application.ReadResult;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.rust.cargo.project.model.CargoProject;
/*     */ import org.rust.cargo.project.settings.RustProjectSettingsService;
/*     */ import org.rust.cargo.project.settings.RustProjectSettingsServiceKt;
/*     */ import org.rust.cargo.toolchain.RsToolchainBase;
/*     */ import org.rust.openapiext.RsPathManager;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020 \n\000\n\002\030\002\n\002\b\003\n\002\020\001\n\002\b\004\b\026\030\000 \0222\0020\001:\002\021\022B\007¢\006\004\b\002\020\003J,\020\004\032\0020\0052\006\020\006\032\0020\0072\f\020\b\032\b\022\004\022\0020\0070\t2\006\020\n\032\0020\013H@¢\006\002\020\fJ\b\020\r\032\0020\005H\002J\020\020\016\032\0020\0172\006\020\020\032\0020\007H\002¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter;", "Lcom/intellij/ml/llm/matterhorn/ej/core/EvaluationMatterhornStarterBase;", "<init>", "()V", "configureProject", "", "name", "", "args", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "(Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkNativeHelper", "fail", "", "message", "FakeConfiguratorContext", "Companion", "ej-rustrover"})
/*     */ @SourceDebugExtension({"SMAP\nRustRoverAgentMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RustRoverAgentMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,157:1\n78#2:158\n78#2:159\n1#3:160\n14#4:161\n*S KotlinDebug\n*F\n+ 1 RustRoverAgentMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter\n*L\n54#1:158\n55#1:159\n152#1:161\n*E\n"})
/*     */ public class RustRoverAgentMatterhornStarter extends EvaluationMatterhornStarterBase {
/*     */   public RustRoverAgentMatterhornStarter() {
/*  37 */     super(RustRoverAgentArtifactTypes.INSTANCE.getSWEPatchArtifactType());
/*     */   }
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
/*     */   private static final ReadResult configureProject$lambda$4(Project $project, RsToolchainBase $toolchain, ReadAndWriteScope $this$readAndWriteAction) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w '$this$readAndWriteAction'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: invokestatic getRustSettings : (Lcom/intellij/openapi/project/Project;)Lorg/rust/cargo/project/settings/RustProjectSettingsService;
/*     */     //   11: invokevirtual getToolchain : ()Lorg/rust/cargo/toolchain/RsToolchainBase;
/*     */     //   14: astore_3
/*     */     //   15: aload_3
/*     */     //   16: ifnull -> 36
/*     */     //   19: aload_3
/*     */     //   20: invokevirtual looksLikeValidToolchain : ()Z
/*     */     //   23: ifeq -> 36
/*     */     //   26: aload_2
/*     */     //   27: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   30: invokeinterface value : (Ljava/lang/Object;)Lcom/intellij/openapi/application/ReadResult;
/*     */     //   35: areturn
/*     */     //   36: aload_2
/*     */     //   37: aload_0
/*     */     //   38: aload_1
/*     */     //   39: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lorg/rust/cargo/toolchain/RsToolchainBase;)Lkotlin/jvm/functions/Function0;
/*     */     //   44: invokeinterface writeAction : (Lkotlin/jvm/functions/Function0;)Lcom/intellij/openapi/application/ReadResult;
/*     */     //   49: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 7
/*     */     //   #68	-> 15
/*     */     //   #69	-> 26
/*     */     //   #72	-> 36
/*     */     //   #74	-> 49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   15	35	3	oldToolchain	Lorg/rust/cargo/toolchain/RsToolchainBase;
/*     */     //   0	50	0	$project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	50	1	$toolchain	Lorg/rust/cargo/toolchain/RsToolchainBase;
/*     */     //   0	50	2	$this$readAndWriteAction	Lcom/intellij/openapi/application/ReadAndWriteScope;
/*     */   }
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
/*     */   private static final Unit configureProject$lambda$4$lambda$3$lambda$2(RsToolchainBase $toolchain, RustProjectSettingsService.RustProjectSettings it)
/*     */   {
/*  73 */     Intrinsics.checkNotNullParameter(it, "it"); it.setToolchain($toolchain); return Unit.INSTANCE; } private static final Unit configureProject$lambda$4$lambda$3(Project $project, RsToolchainBase $toolchain) { RustProjectSettingsServiceKt.getRustSettings($project).modify($toolchain::configureProject$lambda$4$lambda$3$lambda$2);
/*  74 */     return Unit.INSTANCE; }
/*     */    @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {165}, i = {0}, s = {"L$0"}, n = {"deferred"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter$configureProject$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nRustRoverAgentMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RustRoverAgentMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,157:1\n53#2,8:158\n*S KotlinDebug\n*F\n+ 1 RustRoverAgentMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3\n*L\n101#1:158,8\n*E\n"})
/*     */   static final class RustRoverAgentMatterhornStarter$configureProject$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; RustRoverAgentMatterhornStarter$configureProject$3(Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #10
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 220, 0 -> 32, 1 -> 178
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   43: astore_2
/*     */       //   44: aload_2
/*     */       //   45: aconst_null
/*     */       //   46: aconst_null
/*     */       //   47: new com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3$deferred$1
/*     */       //   50: dup
/*     */       //   51: aload_0
/*     */       //   52: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   55: aconst_null
/*     */       //   56: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */       //   59: checkcast kotlin/jvm/functions/Function2
/*     */       //   62: iconst_3
/*     */       //   63: aconst_null
/*     */       //   64: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */       //   67: astore_3
/*     */       //   68: nop
/*     */       //   69: iconst_0
/*     */       //   70: istore #5
/*     */       //   72: nop
/*     */       //   73: new kotlinx/coroutines/selects/SelectImplementation
/*     */       //   76: dup
/*     */       //   77: aload_0
/*     */       //   78: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */       //   83: invokespecial <init> : (Lkotlin/coroutines/CoroutineContext;)V
/*     */       //   86: astore #6
/*     */       //   88: iconst_0
/*     */       //   89: istore #7
/*     */       //   91: aload #6
/*     */       //   93: checkcast kotlinx/coroutines/selects/SelectBuilder
/*     */       //   96: astore #8
/*     */       //   98: iconst_0
/*     */       //   99: istore #9
/*     */       //   101: aload #8
/*     */       //   103: aload_3
/*     */       //   104: invokeinterface getOnAwait : ()Lkotlinx/coroutines/selects/SelectClause1;
/*     */       //   109: new com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3$done$1$1
/*     */       //   112: dup
/*     */       //   113: aconst_null
/*     */       //   114: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */       //   117: checkcast kotlin/jvm/functions/Function2
/*     */       //   120: invokeinterface invoke : (Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V
/*     */       //   125: aload #8
/*     */       //   127: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */       //   130: pop
/*     */       //   131: iconst_5
/*     */       //   132: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
/*     */       //   135: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */       //   138: new com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3$done$1$2
/*     */       //   141: dup
/*     */       //   142: aconst_null
/*     */       //   143: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */       //   146: checkcast kotlin/jvm/functions/Function1
/*     */       //   149: invokestatic onTimeout-8Mi8wO0 : (Lkotlinx/coroutines/selects/SelectBuilder;JLkotlin/jvm/functions/Function1;)V
/*     */       //   152: nop
/*     */       //   153: aload #6
/*     */       //   155: aload_0
/*     */       //   156: aload_0
/*     */       //   157: aload_3
/*     */       //   158: putfield L$0 : Ljava/lang/Object;
/*     */       //   161: aload_0
/*     */       //   162: iconst_1
/*     */       //   163: putfield label : I
/*     */       //   166: invokevirtual doSelect : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   169: dup
/*     */       //   170: aload #10
/*     */       //   172: if_acmpne -> 197
/*     */       //   175: aload #10
/*     */       //   177: areturn
/*     */       //   178: iconst_0
/*     */       //   179: istore #5
/*     */       //   181: iconst_0
/*     */       //   182: istore #7
/*     */       //   184: aload_0
/*     */       //   185: getfield L$0 : Ljava/lang/Object;
/*     */       //   188: checkcast kotlinx/coroutines/Deferred
/*     */       //   191: astore_3
/*     */       //   192: aload_1
/*     */       //   193: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   196: aload_1
/*     */       //   197: nop
/*     */       //   198: nop
/*     */       //   199: nop
/*     */       //   200: checkcast java/lang/Boolean
/*     */       //   203: invokevirtual booleanValue : ()Z
/*     */       //   206: istore #4
/*     */       //   208: iload #4
/*     */       //   210: ifeq -> 68
/*     */       //   213: goto -> 216
/*     */       //   216: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   219: areturn
/*     */       //   220: new java/lang/IllegalStateException
/*     */       //   223: dup
/*     */       //   224: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   226: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   229: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #95	-> 3
/*     */       //   #96	-> 44
/*     */       //   #100	-> 68
/*     */       //   #101	-> 69
/*     */       //   #158	-> 72
/*     */       //   #161	-> 73
/*     */       //   #161	-> 83
/*     */       //   #162	-> 91
/*     */       //   #102	-> 101
/*     */       //   #105	-> 125
/*     */       //   #105	-> 138
/*     */       //   #109	-> 152
/*     */       //   #162	-> 153
/*     */       //   #165	-> 153
/*     */       //   #95	-> 175
/*     */       //   #165	-> 197
/*     */       //   #161	-> 198
/*     */       //   #161	-> 199
/*     */       //   #101	-> 200
/*     */       //   #110	-> 208
/*     */       //   #112	-> 216
/*     */       //   #95	-> 220
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	24	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   68	110	3	deferred	Lkotlinx/coroutines/Deferred;
/*     */       //   192	28	3	deferred	Lkotlinx/coroutines/Deferred;
/*     */       //   208	8	4	done	Z
/*     */       //   88	65	6	$this$select_u24lambda_u241$iv	Lkotlinx/coroutines/selects/SelectImplementation;
/*     */       //   153	16	6	$this$select_u24lambda_u241$iv	Lkotlinx/coroutines/selects/SelectImplementation;
/*     */       //   98	55	8	$this$invokeSuspend_u24lambda_u240	Lkotlinx/coroutines/selects/SelectBuilder;
/*     */       //   101	52	9	$i$a$-select-RustRoverAgentMatterhornStarter$configureProject$3$done$1	I
/*     */       //   91	87	7	$i$a$-run-SelectKt$select$3$iv	I
/*     */       //   72	106	5	$i$f$select	I
/*     */       //   0	230	0	this	Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$configureProject$3;
/*     */       //   36	184	1	$result	Ljava/lang/Object;
/*     */       //   184	14	7	$i$a$-run-SelectKt$select$3$iv	I
/*     */       //   181	19	5	$i$f$select	I
/*     */     }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RustRoverAgentMatterhornStarter$configureProject$3> $completion) {
/*     */       RustRoverAgentMatterhornStarter$configureProject$3 rustRoverAgentMatterhornStarter$configureProject$3 = new RustRoverAgentMatterhornStarter$configureProject$3(this.$project, $completion);
/*     */       rustRoverAgentMatterhornStarter$configureProject$3.L$0 = value;
/*     */       return (Continuation<Unit>)rustRoverAgentMatterhornStarter$configureProject$3;
/*     */     }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((RustRoverAgentMatterhornStarter$configureProject$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter$configureProject$3$deferred$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class RustRoverAgentMatterhornStarter$configureProject$3$deferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */       int label;
/*  96 */       public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  97 */             (new CargoCommandLineInspectionProjectConfigurator()).configureProject(this.$project, new RustRoverAgentMatterhornStarter.FakeConfiguratorContext());
/*  98 */             return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */       RustRoverAgentMatterhornStarter$configureProject$3$deferred$1(Project $project, Continuation $completion) { super(2, $completion); } public final Continuation<Unit> create(Object value, Continuation<? super RustRoverAgentMatterhornStarter$configureProject$3$deferred$1> $completion) { return (Continuation<Unit>)new RustRoverAgentMatterhornStarter$configureProject$3$deferred$1(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((RustRoverAgentMatterhornStarter$configureProject$3$deferred$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/*     */     } @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter$configureProject$3$done$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\020\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", ""}) static final class RustRoverAgentMatterhornStarter$configureProject$3$done$1$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Boolean>, Object>
/*     */     {
/* 102 */       int label; RustRoverAgentMatterhornStarter$configureProject$3$done$1$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 103 */             return Boxing.boxBoolean(true); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super RustRoverAgentMatterhornStarter$configureProject$3$done$1$1> $completion) { return (Continuation<Unit>)new RustRoverAgentMatterhornStarter$configureProject$3$done$1$1($completion); } public final Object invoke(Unit p1, Continuation<?> p2) { return ((RustRoverAgentMatterhornStarter$configureProject$3$done$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */     @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter$configureProject$3$done$1$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class RustRoverAgentMatterhornStarter$configureProject$3$done$1$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { int label;
/* 105 */       public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 106 */             RustRoverAgentMatterhornStarter.logger.info("Still waiting for Cargo project configuration...");
/* 107 */             return Boxing.boxBoolean(false); }
/*     */         
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */        RustRoverAgentMatterhornStarter$configureProject$3$done$1$2(Continuation $completion) {
/*     */         super(1, $completion);
/*     */       } public final Continuation<Unit> create(Continuation<? super RustRoverAgentMatterhornStarter$configureProject$3$done$1$2> $completion) {
/*     */         return (Continuation<Unit>)new RustRoverAgentMatterhornStarter$configureProject$3$done$1$2($completion);
/*     */       }
/*     */       public final Object invoke(Continuation<?> p1) {
/*     */         return ((RustRoverAgentMatterhornStarter$configureProject$3$done$1$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */       } } }
/* 118 */   private static final CharSequence configureProject$lambda$5(CargoProject it) { Intrinsics.checkNotNullParameter(it, "it"); return it.getPresentableName(); } @DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {158, 159, 66, 95}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"}, n = {"$this", "context", "project", "$this", "context", "project", "$this", "project", "projectPath", "rustToolchainFile", "toolchain", "$this", "project"}, m = "configureProject$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RustRoverAgentMatterhornStarter$configureProject$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; int label; RustRoverAgentMatterhornStarter$configureProject$1(Continuation $completion) { super($completion); }
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RustRoverAgentMatterhornStarter.configureProject$suspendImpl(RustRoverAgentMatterhornStarter.this, null, null, null, (Continuation<? super Unit>)this); } }
/*     */   private final void checkNativeHelper() { Path nativeHelperPath;
/* 127 */     if (RsPathManager.INSTANCE.nativeHelper(false) == null) { RsPathManager.INSTANCE.nativeHelper(false); RustRoverAgentMatterhornStarter $this$checkNativeHelper_u24lambda_u246 = this; int $i$a$-run-RustRoverAgentMatterhornStarter$checkNativeHelper$nativeHelperPath$1 = 0;
/* 128 */       $this$checkNativeHelper_u24lambda_u246.fail("intellij-rust-native-helper executable is not found"); throw new KotlinNothingValueException(); }
/*     */     
/* 130 */     if (!Files.isExecutable(nativeHelperPath) && !nativeHelperPath.toFile().setExecutable(true)) {
/* 131 */       fail("Can't set executable permission for " + nativeHelperPath.toAbsolutePath().toString()); throw new KotlinNothingValueException();
/*     */     }  }
/*     */ 
/*     */   
/*     */   private final Void fail(String message) {
/* 136 */     logger.error(message);
/* 137 */     throw new RuntimeException(message);
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026J\b\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026J\016\020\n\032\b\022\004\022\0020\t0\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$FakeConfiguratorContext;", "Lcom/intellij/ide/CommandLineInspectionProjectConfigurator$ConfiguratorContext;", "<init>", "()V", "getLogger", "Lcom/intellij/ide/CommandLineInspectionProgressReporter;", "getProgressIndicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "getProjectPath", "Ljava/nio/file/Path;", "getFilesFilter", "Ljava/util/function/Predicate;", "ej-rustrover"})
/*     */   private static final class FakeConfiguratorContext implements CommandLineInspectionProjectConfigurator.ConfiguratorContext { @NotNull
/*     */     public CommandLineInspectionProgressReporter getLogger() {
/* 141 */       return new RustRoverAgentMatterhornStarter$FakeConfiguratorContext$getLogger$1(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\030\020\006\032\0020\0032\006\020\007\032\0020\b2\006\020\004\032\0020\005H\026¨\006\t"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$FakeConfiguratorContext$getLogger$1", "Lcom/intellij/ide/CommandLineInspectionProgressReporter;", "reportError", "", "message", "", "reportMessage", "minVerboseLevel", "", "ej-rustrover"})
/* 142 */     public static final class RustRoverAgentMatterhornStarter$FakeConfiguratorContext$getLogger$1 implements CommandLineInspectionProgressReporter { public void reportError(String message) { Intrinsics.checkNotNullParameter(message, "message"); } public void reportMessage(int minVerboseLevel, String message) {
/* 143 */         Intrinsics.checkNotNullParameter(message, "message");
/*     */       } }
/*     */     @NotNull
/* 146 */     public ProgressIndicator getProgressIndicator() { throw new UnsupportedOperationException(); } @NotNull
/* 147 */     public Path getProjectPath() { throw new UnsupportedOperationException(); } @NotNull
/* 148 */     public Predicate<Path> getFilesFilter() { throw new UnsupportedOperationException(); }
/*     */      } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-rustrover"})
/*     */   public static final class Companion { private Companion() {} }
/*     */   @NotNull
/* 152 */   public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(RustRoverAgentMatterhornStarter.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(RustRoverAgentMatterhornStarter.class);
/*     */   
/*     */   @Nullable
/*     */   public Object configureProject(@NotNull String name, @NotNull List<String> args, @NotNull RootExecutionContext context, @NotNull Continuation<? super Unit> $completion) {
/*     */     return configureProject$suspendImpl(this, name, args, context, $completion);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\RustRoverAgentMatterhornStarter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */