/*    */ package com.intellij.ml.llm.matterhorn.ej.core.aiignore;
/*    */ 
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Charsets;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "AIIgnore.kt", l = {44, 49}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.aiignore.AIIgnore$createPlaceholderAiignoreFile$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class AIIgnore$createPlaceholderAiignoreFile$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   AIIgnore$createPlaceholderAiignoreFile$1(VirtualFile $baseDir, Project $project, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     VirtualFile virtualFile;
/* 43 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 44 */         this.label = 1; if (CoroutinesKt.writeAction(this.$baseDir::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  virtualFile = (VirtualFile)CoroutinesKt.writeAction(this.$baseDir::invokeSuspend$lambda$0, (Continuation)this);
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 49 */         this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, virtualFile, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 50 */                     FileEditorManager.getInstance(this.$project).openFile(this.$virtualFile);
/* 51 */                     return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$virtualFile, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, virtualFile, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); FileEditorManager.getInstance(this.$project).openFile(this.$virtualFile); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/* 52 */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$virtualFile, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); virtualFile = (VirtualFile)SYNTHETIC_LOCAL_VARIABLE_1; this.label = 2; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, virtualFile, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); FileEditorManager.getInstance(this.$project).openFile(this.$virtualFile); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$virtualFile, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$project, virtualFile, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); FileEditorManager.getInstance(this.$project).openFile(this.$virtualFile); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, this.$virtualFile, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super AIIgnore$createPlaceholderAiignoreFile$1> $completion) {
/*    */     return (Continuation<Unit>)new AIIgnore$createPlaceholderAiignoreFile$1(this.$baseDir, this.$project, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((AIIgnore$createPlaceholderAiignoreFile$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final VirtualFile invokeSuspend$lambda$0(VirtualFile $baseDir) {
/*    */     VirtualFile virtualFile = VirtualFileUtil.findOrCreateFile($baseDir, ".aiignore");
/*    */     Intrinsics.checkNotNullExpressionValue("# An .aiignore file follows the same syntax as a .gitignore file.\n# .gitignore documentation: https://git-scm.com/docs/gitignore\n# Junie will ask for explicit approval before view or edit the file or file within a directory listed in .aiignore.\n# Only files contents is protected, Junie is still allowed to view file names even if they are listed in .aiignore.\n# Be aware that the files you included in .aiignore can still be accessed by Junie in two cases:\n# - If Brave Mode is turned on.\n# - If a command has been added to the Allowlist — Junie will not ask for confirmation, even if it accesses - files and folders listed in .aiignore.\n".getBytes(Charsets.UTF_8), "getBytes(...)");
/*    */     virtualFile.setBinaryContent("# An .aiignore file follows the same syntax as a .gitignore file.\n# .gitignore documentation: https://git-scm.com/docs/gitignore\n# Junie will ask for explicit approval before view or edit the file or file within a directory listed in .aiignore.\n# Only files contents is protected, Junie is still allowed to view file names even if they are listed in .aiignore.\n# Be aware that the files you included in .aiignore can still be accessed by Junie in two cases:\n# - If Brave Mode is turned on.\n# - If a command has been added to the Allowlist — Junie will not ask for confirmation, even if it accesses - files and folders listed in .aiignore.\n".getBytes(Charsets.UTF_8));
/*    */     return virtualFile;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\aiignore\AIIgnore$createPlaceholderAiignoreFile$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */