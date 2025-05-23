/*    */ package com.intellij.ml.llm.matterhorn.ej.rustrover;
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*    */ import com.intellij.openapi.options.ShowSettingsUtil;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.text.SemVer;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\022\020\t\032\004\030\0010\0062\006\020\007\032\0020\bH\002¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverJuniePrecondition;", "Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker;", "<init>", "()V", "canRunJunie", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "project", "Lcom/intellij/openapi/project/Project;", "checkRustToolchain", "ej-rustrover"})
/*    */ public final class RustRoverJuniePrecondition extends DefaultJuniePreconditionChecker {
/*    */   @NotNull
/*    */   public List<JuniePreconditionChecker.JunieProblem> canRunJunie(@NotNull Project project) {
/* 18 */     Intrinsics.checkNotNullParameter(project, "project"); return CollectionsKt.plus(super.canRunJunie(project), CollectionsKt.listOfNotNull(checkRustToolchain(project)));
/*    */   }
/*    */   private final JuniePreconditionChecker.JunieProblem checkRustToolchain(Project project) { IdeaPluginDescriptor rustPlugin;
/*    */     SemVer rustVersion;
/* 22 */     if (PluginManager.getInstance().findEnabledPlugin(RustRoverJuniePreconditionKt.access$getRUST_PLUGIN$p()) == null) { PluginManager.getInstance().findEnabledPlugin(RustRoverJuniePreconditionKt.access$getRUST_PLUGIN$p()); return null; }
/* 23 */      if (SemVer.parseFromText(rustPlugin.getVersion()) == null) { SemVer.parseFromText(rustPlugin.getVersion()); return null; }
/*    */     
/* 25 */     if (rustVersion.getMajor() == 251 && rustVersion.compareTo(RustRoverJuniePreconditionKt.access$getMIN_SUPPORTED_RUST_PLUGIN$p()) < 0) return new JuniePreconditionChecker.JunieProblem(
/* 26 */           "The Rust plugin version is outdated. Please update the Rust plugin or RustRover", null, null, 6, null);
/*    */ 
/*    */     
/* 29 */     if (RustProjectSettingsServiceKt.getToolchain(project) != null) return null;
/*    */     
/* 31 */     return new JuniePreconditionChecker.JunieProblem(
/* 32 */         "Rust toolchain is not configured", 
/* 33 */         "Set Up", 
/* 34 */         new RustRoverJuniePrecondition$checkRustToolchain$1(project, null)); } @DebugMetadata(f = "RustRoverJuniePrecondition.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverJuniePrecondition$checkRustToolchain$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class RustRoverJuniePrecondition$checkRustToolchain$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { int label; RustRoverJuniePrecondition$checkRustToolchain$1(Project $project, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 35 */           this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 36 */                       ShowSettingsUtil.getInstance().showSettingsDialog(this.$project, RsProjectConfigurable.class);
/* 37 */                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); ShowSettingsUtil.getInstance().showSettingsDialog(this.$project, RsProjectConfigurable.class); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); }
/* 38 */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Boxing.boxBoolean(true);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(true); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super RustRoverJuniePrecondition$checkRustToolchain$1> $completion) {
/*    */       return (Continuation<Unit>)new RustRoverJuniePrecondition$checkRustToolchain$1(this.$project, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((RustRoverJuniePrecondition$checkRustToolchain$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\RustRoverJuniePrecondition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */