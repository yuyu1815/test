/*    */ package com.intellij.ml.llm.matterhorn.ej.phpstorm;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.utils.AwaitUtils;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\022\020\t\032\004\030\0010\0062\006\020\007\032\0020\bH\002J\022\020\n\032\004\030\0010\0062\006\020\007\032\0020\bH\002¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/phpstorm/PhpStormJuniePrecondition;", "Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker;", "<init>", "()V", "canRunJunie", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "project", "Lcom/intellij/openapi/project/Project;", "checkPhpInterpreter", "checkVendorDirectory", "ej-phpstorm"})
/*    */ public final class PhpStormJuniePrecondition extends DefaultJuniePreconditionChecker {
/*    */   @NotNull
/*    */   public List<JuniePreconditionChecker.JunieProblem> canRunJunie(@NotNull Project project) {
/* 22 */     Intrinsics.checkNotNullParameter(project, "project");
/* 23 */     JuniePreconditionChecker.JunieProblem[] arrayOfJunieProblem = new JuniePreconditionChecker.JunieProblem[2]; arrayOfJunieProblem[0] = checkPhpInterpreter(project); arrayOfJunieProblem[1] = 
/* 24 */       checkVendorDirectory(project);
/*    */     return CollectionsKt.plus(super.canRunJunie(project), CollectionsKt.listOfNotNull((Object[])arrayOfJunieProblem));
/*    */   }
/*    */   
/*    */   private final JuniePreconditionChecker.JunieProblem checkPhpInterpreter(Project project) {
/* 29 */     PhpInterpreter interpreter = PhpProjectConfigurationFacade.getInstance(project).getInterpreter();
/* 30 */     if (interpreter != null) {
/* 31 */       return null;
/*    */     }
/*    */     
/* 34 */     return new JuniePreconditionChecker.JunieProblem(
/* 35 */         "PHP interpreter is not configured", 
/* 36 */         "Configure", 
/* 37 */         new PhpStormJuniePrecondition$checkPhpInterpreter$1(project, null)); } @DebugMetadata(f = "PhpStormJuniePrecondition.kt", l = {38}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.phpstorm.PhpStormJuniePrecondition$checkPhpInterpreter$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class PhpStormJuniePrecondition$checkPhpInterpreter$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { int label; PhpStormJuniePrecondition$checkPhpInterpreter$1(Project $project, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 38 */           this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 39 */                       PhpProjectConfigurable.createFix(this.$project).run();
/* 40 */                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); PhpProjectConfigurable.createFix(this.$project).run(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); }
/* 41 */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Boxing.boxBoolean(true);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(true); }
/*    */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super PhpStormJuniePrecondition$checkPhpInterpreter$1> $completion) { return (Continuation<Unit>)new PhpStormJuniePrecondition$checkPhpInterpreter$1(this.$project, $completion); }
/*    */     public final Object invoke(Continuation<?> p1) { return ((PhpStormJuniePrecondition$checkPhpInterpreter$1)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/*    */   private final JuniePreconditionChecker.JunieProblem checkVendorDirectory(Project project) { VirtualFile projectDir; String composerJsonPath; Object object;
/*    */     String vendorPath;
/* 46 */     if (ProjectUtil.guessProjectDir(project) == null) { ProjectUtil.guessProjectDir(project); return null; }
/* 47 */      if (ComposerConfigManager.Companion.getInstance(project).getConfigPath(projectDir) == null) { ComposerConfigManager.Companion.getInstance(project).getConfigPath(projectDir); return null; }
/* 48 */      if ((ApplicationManager.getApplication().isReadAccessAllowed() ? 
/* 49 */       LocalFileSystem.getInstance().findFileByPath(composerJsonPath) : 
/*    */       
/* 51 */       LocalFileSystem.getInstance().refreshAndFindFileByPath(composerJsonPath)) == null) { ApplicationManager.getApplication().isReadAccessAllowed() ? LocalFileSystem.getInstance().findFileByPath(composerJsonPath) : LocalFileSystem.getInstance().refreshAndFindFileByPath(composerJsonPath);
/* 52 */       return null; }
/* 53 */      if (ComposerConfigUtils.getVendorAndBinDirs((VirtualFile)object) == null || (String)(ComposerConfigUtils.getVendorAndBinDirs((VirtualFile)object)).first == null) { (String)(ComposerConfigUtils.getVendorAndBinDirs((VirtualFile)object)).first; return null; }
/* 54 */      VirtualFile vendorDir = ComposerUtils.findVendorDir((VirtualFile)object, vendorPath);
/* 55 */     if (vendorDir != null) {
/* 56 */       return null;
/*    */     }
/*    */     
/* 59 */     return new JuniePreconditionChecker.JunieProblem(
/* 60 */         "'vendor' directory, required to process the prompt, is not found", 
/* 61 */         "Install Composer dependencies", 
/* 62 */         new PhpStormJuniePrecondition$checkVendorDirectory$1(project, (VirtualFile)object, null)); } @DebugMetadata(f = "PhpStormJuniePrecondition.kt", l = {63, 66}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.phpstorm.PhpStormJuniePrecondition$checkVendorDirectory$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class PhpStormJuniePrecondition$checkVendorDirectory$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { int label; PhpStormJuniePrecondition$checkVendorDirectory$1(Project $project, VirtualFile $composerConfig, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 63 */           this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, this.$composerConfig, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 64 */                       (new ComposerInstallAction()).act(this.$project, this.$composerConfig, "Junie");
/* 65 */                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$composerConfig, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, this.$composerConfig, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); (new ComposerInstallAction()).act(this.$project, this.$composerConfig, "Junie"); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$composerConfig, $completion); }
/* 66 */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); this.label = 2; if (AwaitUtils.INSTANCE.awaitProjectUpdate(this.$project, (Continuation)this) == object) return object;  AwaitUtils.INSTANCE.awaitProjectUpdate(this.$project, (Continuation)this);
/* 67 */           return Boxing.boxBoolean(true);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (AwaitUtils.INSTANCE.awaitProjectUpdate(this.$project, (Continuation)this) == object) return object;  AwaitUtils.INSTANCE.awaitProjectUpdate(this.$project, (Continuation)this); return Boxing.boxBoolean(true);case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(true); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super PhpStormJuniePrecondition$checkVendorDirectory$1> $completion) {
/*    */       return (Continuation<Unit>)new PhpStormJuniePrecondition$checkVendorDirectory$1(this.$project, this.$composerConfig, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((PhpStormJuniePrecondition$checkVendorDirectory$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\phpstorm\PhpStormJuniePrecondition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */