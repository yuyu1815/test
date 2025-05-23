/*     */ package com.intellij.ml.llm.matterhorn.ej.core.diagnostic;
/*     */ import com.intellij.diagnostic.CoroutineDumperKt;
/*     */ import com.intellij.diagnostic.ThreadDumper;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.startup.ProjectActivity;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import java.io.File;
/*     */ import java.time.LocalDateTime;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.io.FilesKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineDispatcher;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.NonCancellable;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\007\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\020\020\020\032\0020\0212\006\020\022\032\0020\fH\002J\026\020\023\032\0020\0242\006\020\022\032\0020\fH@¢\006\002\020\025J\026\020\026\032\0020\0242\006\020\027\032\0020\021H@¢\006\002\020\030J\020\020\031\032\0020\0242\006\020\027\032\0020\021H\002J\b\020\032\032\0020\024H\026R\016\020\005\032\0020\006X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\bX\016¢\006\002\n\000R\020\020\t\032\004\030\0010\nX\016¢\006\002\n\000R\020\020\013\032\004\030\0010\fX\016¢\006\002\n\000R\024\020\r\032\0020\0168BX\004¢\006\006\032\004\b\r\020\017¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity;", "Lcom/intellij/openapi/startup/ProjectActivity;", "Lcom/intellij/openapi/Disposable;", "<init>", "()V", "log", "Lcom/intellij/openapi/diagnostic/Logger;", "job", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "projectRef", "Lcom/intellij/openapi/project/Project;", "isTestEnvironment", "", "()Z", "getDumpDirectory", "Ljava/io/File;", "project", "execute", "", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDump", "dumpDir", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanupDumpDirectory", "dispose", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nCoroutineDumpActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDumpActivity.kt\ncom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,142:1\n14#2:143\n*S KotlinDebug\n*F\n+ 1 CoroutineDumpActivity.kt\ncom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity\n*L\n34#1:143\n*E\n"})
/*     */ public final class CoroutineDumpActivity implements ProjectActivity, Disposable {
/*     */   public CoroutineDumpActivity() {
/*  34 */     int $i$f$logger = 0;
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
/*     */ 
/*     */ 
/*     */     
/* 143 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CoroutineDumpActivity.class), "getInstance(...)"); this.log = Logger.getInstance(CoroutineDumpActivity.class);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final Logger log;
/*     */   @Nullable
/*     */   private Job job;
/*     */   @Nullable
/*     */   private CoroutineScope scope;
/*     */   @Nullable
/*     */   private Project projectRef;
/*     */   
/*     */   private final boolean isTestEnvironment() {
/*     */     return Intrinsics.areEqual(System.getProperty("idea.test.environment"), "true");
/*     */   }
/*     */   
/*     */   private final File getDumpDirectory(Project project) {
/*     */     String dumpsPathEnv = System.getenv("COROUTINE_DUMPS_PATH");
/*     */     return (dumpsPathEnv == null) ? new File(project.getBasePath(), "coroutine-dumps") : new File(dumpsPathEnv);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull Project project, @NotNull Continuation $completion) {
/*     */     this.projectRef = project;
/*     */     CoroutineScope serviceScope = MatterhornServiceScope.Companion.getScope(project);
/*     */     Disposer.register(CoroutinesKt.nestedDisposable(serviceScope), this);
/*     */     File dumpDir = getDumpDirectory(project);
/*     */     if (project.isDefault() || isTestEnvironment()) {
/*     */       if (BuildersKt.withContext((CoroutineContext)NonCancellable.INSTANCE, new CoroutineDumpActivity$execute$2(dumpDir, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */         return BuildersKt.withContext((CoroutineContext)NonCancellable.INSTANCE, new CoroutineDumpActivity$execute$2(dumpDir, null), $completion); 
/*     */       BuildersKt.withContext((CoroutineContext)NonCancellable.INSTANCE, new CoroutineDumpActivity$execute$2(dumpDir, null), $completion);
/*     */       return Unit.INSTANCE;
/*     */     } 
/*     */     boolean isDebugModeEnabled = Registry.Companion.is("matterhorn.debug.coroutine.dumps");
/*     */     boolean isExplicitlyEnabled = Intrinsics.areEqual(System.getenv("ENABLE_COROUTINE_DUMP_ACTIVITY"), "true");
/*     */     if (!isDebugModeEnabled && !isExplicitlyEnabled) {
/*     */       this.log.info("Skipping coroutine dump activity in regular mode. Enable with registry key 'matterhorn.debug.coroutine.dumps' or ENABLE_COROUTINE_DUMP_ACTIVITY environment variable");
/*     */       return Unit.INSTANCE;
/*     */     } 
/*     */     this.log.info("Starting coroutine dump activity");
/*     */     dumpDir.mkdirs();
/*     */     this.log.info("Coroutine dumps will be saved to: " + dumpDir.getAbsolutePath());
/*     */     CoroutineDispatcher dispatcher = Dispatchers.getIO();
/*     */     this.scope = CoroutineScopeKt.CoroutineScope(dispatcher.plus((CoroutineContext)SupervisorKt.SupervisorJob$default(null, 1, null)).plus((CoroutineContext)new CoroutineName("CoroutineDumpActivity")));
/*     */     this.job = (this.scope != null) ? BuildersKt.launch$default(this.scope, null, null, new CoroutineDumpActivity$execute$3(dumpDir, null), 3, null) : null;
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CoroutineDumpActivity.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.diagnostic.CoroutineDumpActivity$execute$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class CoroutineDumpActivity$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     CoroutineDumpActivity$execute$2(File $dumpDir, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           CoroutineDumpActivity.this.cleanupDumpDirectory(this.$dumpDir);
/*     */           CoroutineDumpActivity.this.log.info("Skipping coroutine dump activity in test environment");
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super CoroutineDumpActivity$execute$2> $completion) {
/*     */       return (Continuation<Unit>)new CoroutineDumpActivity$execute$2(this.$dumpDir, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((CoroutineDumpActivity$execute$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CoroutineDumpActivity.kt", l = {83, 84}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$this$launch", "$this$launch"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.diagnostic.CoroutineDumpActivity$execute$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class CoroutineDumpActivity$execute$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     CoroutineDumpActivity$execute$3(File $dumpDir, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_3
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 158, 0 -> 36, 1 -> 87, 2 -> 137
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   47: astore_2
/*     */       //   48: aload_2
/*     */       //   49: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
/*     */       //   52: ifeq -> 154
/*     */       //   55: aload_0
/*     */       //   56: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity;
/*     */       //   59: aload_0
/*     */       //   60: getfield $dumpDir : Ljava/io/File;
/*     */       //   63: aload_0
/*     */       //   64: checkcast kotlin/coroutines/Continuation
/*     */       //   67: aload_0
/*     */       //   68: aload_2
/*     */       //   69: putfield L$0 : Ljava/lang/Object;
/*     */       //   72: aload_0
/*     */       //   73: iconst_1
/*     */       //   74: putfield label : I
/*     */       //   77: invokestatic access$createDump : (Lcom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   80: dup
/*     */       //   81: aload_3
/*     */       //   82: if_acmpne -> 100
/*     */       //   85: aload_3
/*     */       //   86: areturn
/*     */       //   87: aload_0
/*     */       //   88: getfield L$0 : Ljava/lang/Object;
/*     */       //   91: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   94: astore_2
/*     */       //   95: aload_1
/*     */       //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   99: aload_1
/*     */       //   100: pop
/*     */       //   101: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */       //   104: pop
/*     */       //   105: bipush #10
/*     */       //   107: getstatic kotlin/time/DurationUnit.MINUTES : Lkotlin/time/DurationUnit;
/*     */       //   110: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */       //   113: aload_0
/*     */       //   114: checkcast kotlin/coroutines/Continuation
/*     */       //   117: aload_0
/*     */       //   118: aload_2
/*     */       //   119: putfield L$0 : Ljava/lang/Object;
/*     */       //   122: aload_0
/*     */       //   123: iconst_2
/*     */       //   124: putfield label : I
/*     */       //   127: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   130: dup
/*     */       //   131: aload_3
/*     */       //   132: if_acmpne -> 150
/*     */       //   135: aload_3
/*     */       //   136: areturn
/*     */       //   137: aload_0
/*     */       //   138: getfield L$0 : Ljava/lang/Object;
/*     */       //   141: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   144: astore_2
/*     */       //   145: aload_1
/*     */       //   146: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   149: aload_1
/*     */       //   150: pop
/*     */       //   151: goto -> 48
/*     */       //   154: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   157: areturn
/*     */       //   158: new java/lang/IllegalStateException
/*     */       //   161: dup
/*     */       //   162: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   164: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   167: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #81	-> 3
/*     */       //   #82	-> 48
/*     */       //   #83	-> 55
/*     */       //   #81	-> 85
/*     */       //   #84	-> 100
/*     */       //   #84	-> 117
/*     */       //   #81	-> 135
/*     */       //   #84	-> 150
/*     */       //   #86	-> 154
/*     */       //   #81	-> 158
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	39	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   95	42	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   145	13	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   0	168	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity$execute$3;
/*     */       //   40	118	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super CoroutineDumpActivity$execute$3> $completion) {
/*     */       CoroutineDumpActivity$execute$3 coroutineDumpActivity$execute$3 = new CoroutineDumpActivity$execute$3(this.$dumpDir, $completion);
/*     */       coroutineDumpActivity$execute$3.L$0 = value;
/*     */       return (Continuation<Unit>)coroutineDumpActivity$execute$3;
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((CoroutineDumpActivity$execute$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final Object createDump(File dumpDir, Continuation $completion) {
/*     */     try {
/*     */       String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
/*     */       File dumpFile = new File(dumpDir, "coroutine-dump-" + timestamp + ".txt");
/*     */       StringBuilder dumpContent = new StringBuilder();
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append("=== THREAD DUMP AT " + timestamp + " ==="), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append("=== THREAD DUMP AT " + timestamp + " ===").append('\n'), "append(...)");
/*     */       dumpContent.append("=== THREAD DUMP AT " + timestamp + " ===").append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append(ThreadDumper.dumpThreadsToString()), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append(ThreadDumper.dumpThreadsToString()).append('\n'), "append(...)");
/*     */       dumpContent.append(ThreadDumper.dumpThreadsToString()).append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append("=== COROUTINE DUMP AT " + timestamp + " ==="), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append("=== COROUTINE DUMP AT " + timestamp + " ===").append('\n'), "append(...)");
/*     */       dumpContent.append("=== COROUTINE DUMP AT " + timestamp + " ===").append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append(CoroutineDumperKt.dumpCoroutines(null, true, true)), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append(CoroutineDumperKt.dumpCoroutines(null, true, true)).append('\n'), "append(...)");
/*     */       dumpContent.append(CoroutineDumperKt.dumpCoroutines(null, true, true)).append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.append('\n'), "append(...)");
/*     */       dumpContent.append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(dumpContent.toString(), "toString(...)");
/*     */       FilesKt.writeText$default(dumpFile, dumpContent.toString(), null, 2, null);
/*     */       this.log.info("Thread and coroutine dump saved to: " + dumpFile.getAbsolutePath());
/*     */       Intrinsics.checkNotNullExpressionValue(dumpFile.getAbsolutePath(), "getAbsolutePath(...)");
/*     */       TeamCityArtifactPublisher.INSTANCE.publishArtifact(dumpFile.getAbsolutePath(), "coroutine-dumps/" + dumpFile.getName());
/*     */     } catch (Exception e) {
/*     */       this.log.error("Failed to create thread or a coroutine dump", e);
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final void cleanupDumpDirectory(File dumpDir) {
/*     */     if (dumpDir.exists())
/*     */       try {
/*     */         FilesKt.deleteRecursively(dumpDir);
/*     */       } catch (Exception e) {
/*     */         this.log.warn("Failed to cleanup dump directory", e);
/*     */       }  
/*     */   }
/*     */   
/*     */   public void dispose() {
/*     */     if (this.job != null) {
/*     */       Job.DefaultImpls.cancel$default(this.job, null, 1, null);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     if (this.scope != null) {
/*     */       CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     if (isTestEnvironment()) {
/*     */       Project project = this.projectRef;
/*     */       int $i$a$-let-CoroutineDumpActivity$dispose$1 = 0;
/*     */       cleanupDumpDirectory(getDumpDirectory(project));
/*     */     } 
/*     */     this.job = null;
/*     */     this.scope = null;
/*     */     this.projectRef = null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\diagnostic\CoroutineDumpActivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */