/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*    */ import androidx.compose.foundation.text.input.TextFieldState;
/*    */ import androidx.compose.foundation.text.input.TextFieldStateKt;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.AgentUtilsKt;
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.project.ProjectUtil;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.openapi.vfs.VirtualFileManager;
/*    */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Charsets;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\002\bÁ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\027\020\b\032\004\030\0010\t2\006\020\n\032\0020\013H\000¢\006\002\b\fJ\035\020\r\032\0020\0162\006\020\n\032\0020\0132\006\020\017\032\0020\tH\000¢\006\002\b\020J\035\020\021\032\0020\0162\006\020\n\032\0020\0132\006\020\022\032\0020\023H\000¢\006\002\b\024R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/Guidelines;", "", "<init>", "()V", "GUIDELINE_RELATIVE_PATH", "", "PLACEHOLDER_TEXT", "JUNIE_PROMPT", "getGuidelines", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;", "project", "Lcom/intellij/openapi/project/Project;", "getGuidelines$ej_ui", "openGuidelineFile", "", "guidelines", "openGuidelineFile$ej_ui", "createPlaceholderGuidelineFile", "textField", "Landroidx/compose/foundation/text/input/TextFieldState;", "createPlaceholderGuidelineFile$ej_ui", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class Guidelines {
/*    */   @NotNull
/*    */   public static final Guidelines INSTANCE = new Guidelines();
/*    */   @NotNull
/*    */   private static final String GUIDELINE_RELATIVE_PATH = ".junie/guidelines.md";
/*    */   @NotNull
/*    */   private static final String PLACEHOLDER_TEXT = "# Project Guidelines\n    \nThis is a placeholder of the project guidelines for Junie.\nReplace this text with any project-level instructions for Junie, e.g.:\n\n* What is the project structure\n* Whether Junie should run tests to check the correctness of the proposed solution\n* How does Junie run tests (once it requires any non-standard approach)\n* Whether Junie should build the project before submitting the result\n* Any code-style related instructions\n\nAs an option you can ask Junie to create these guidelines for you.\n";
/*    */   @NotNull
/*    */   private static final String JUNIE_PROMPT = "Create .junie/guidelines.md and add project overview";
/*    */   public static final int $stable;
/*    */   
/*    */   @Nullable
/*    */   public final GuidelinesEntry getGuidelines$ej_ui(@NotNull Project project) {
/*    */     VirtualFile baseDir;
/* 47 */     Intrinsics.checkNotNullParameter(project, "project"); if (ProjectUtil.guessProjectDir(project) == null) { ProjectUtil.guessProjectDir(project); return null; }
/* 48 */      VirtualFile virtualFile = baseDir.findFileByRelativePath(".junie/guidelines.md");
/* 49 */     Path path = (virtualFile != null) ? AgentUtilsKt.toNioPathOrNull(virtualFile) : null;
/* 50 */     if (virtualFile == null || path == null) return null; 
/* 51 */     return new GuidelinesEntry(".junie/guidelines.md", path);
/*    */   }
/*    */   public final void openGuidelineFile$ej_ui(@NotNull Project project, @NotNull GuidelinesEntry guidelines) {
/*    */     VirtualFile virtualFile;
/* 55 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(guidelines, "guidelines"); if (VirtualFileManager.getInstance().findFileByNioPath(guidelines.getFilePath()) == null) { VirtualFileManager.getInstance().findFileByNioPath(guidelines.getFilePath()); return; }
/* 56 */      FileEditorManager.getInstance(project).openFile(virtualFile);
/*    */   }
/*    */   
/*    */   public final void createPlaceholderGuidelineFile$ej_ui(@NotNull Project project, @NotNull TextFieldState textField) { VirtualFile baseDir;
/* 60 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(textField, "textField"); if ((textField.getText().length() == 0)) {
/* 61 */       TextFieldStateKt.setTextAndPlaceCursorAtEnd(textField, "Create .junie/guidelines.md and add project overview");
/*    */     }
/*    */     
/* 64 */     if (ProjectUtil.guessProjectDir(project) == null) { ProjectUtil.guessProjectDir(project); return; }
/* 65 */      BuildersKt.launch$default(GuidelinesCreationScope.Companion.getService(project).getScope(), (CoroutineContext)Dispatchers.getIO(), null, new Guidelines$createPlaceholderGuidelineFile$1(baseDir, project, null), 2, null); } @DebugMetadata(f = "Guidelines.kt", l = {66, 71}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.Guidelines$createPlaceholderGuidelineFile$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class Guidelines$createPlaceholderGuidelineFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; Guidelines$createPlaceholderGuidelineFile$1(VirtualFile $baseDir, Project $project, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { VirtualFile virtualFile; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 66 */           this.label = 1; if (CoroutinesKt.writeAction(this.$baseDir::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  virtualFile = (VirtualFile)CoroutinesKt.writeAction(this.$baseDir::invokeSuspend$lambda$0, (Continuation)this);
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 71 */           this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, virtualFile, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 72 */                       FileEditorManager.getInstance(this.$project).openFile(this.$virtualFile);
/* 73 */                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$virtualFile, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, virtualFile, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); FileEditorManager.getInstance(this.$project).openFile(this.$virtualFile); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/* 74 */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$virtualFile, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); virtualFile = (VirtualFile)SYNTHETIC_LOCAL_VARIABLE_1; this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, virtualFile, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); FileEditorManager.getInstance(this.$project).openFile(this.$virtualFile); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$virtualFile, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, virtualFile, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); FileEditorManager.getInstance(this.$project).openFile(this.$virtualFile); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$virtualFile, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super Guidelines$createPlaceholderGuidelineFile$1> $completion) {
/*    */       return (Continuation<Unit>)new Guidelines$createPlaceholderGuidelineFile$1(this.$baseDir, this.$project, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((Guidelines$createPlaceholderGuidelineFile$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */     
/*    */     private static final VirtualFile invokeSuspend$lambda$0(VirtualFile $baseDir) {
/*    */       VirtualFile virtualFile = VirtualFileUtil.findOrCreateFile($baseDir, ".junie/guidelines.md");
/*    */       Intrinsics.checkNotNullExpressionValue("# Project Guidelines\n    \nThis is a placeholder of the project guidelines for Junie.\nReplace this text with any project-level instructions for Junie, e.g.:\n\n* What is the project structure\n* Whether Junie should run tests to check the correctness of the proposed solution\n* How does Junie run tests (once it requires any non-standard approach)\n* Whether Junie should build the project before submitting the result\n* Any code-style related instructions\n\nAs an option you can ask Junie to create these guidelines for you.\n".getBytes(Charsets.UTF_8), "getBytes(...)");
/*    */       virtualFile.setBinaryContent("# Project Guidelines\n    \nThis is a placeholder of the project guidelines for Junie.\nReplace this text with any project-level instructions for Junie, e.g.:\n\n* What is the project structure\n* Whether Junie should run tests to check the correctness of the proposed solution\n* How does Junie run tests (once it requires any non-standard approach)\n* Whether Junie should build the project before submitting the result\n* Any code-style related instructions\n\nAs an option you can ask Junie to create these guidelines for you.\n".getBytes(Charsets.UTF_8));
/*    */       return virtualFile;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\Guidelines.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */