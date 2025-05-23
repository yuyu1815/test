/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tests;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionEnvironment;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.local.LocalExecutionEnvironment;
/*    */ import com.intellij.openapi.module.Module;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.roots.ModuleRootModificationUtil;
/*    */ import com.intellij.testFramework.PsiTestUtil;
/*    */ import com.intellij.testFramework.rules.ProjectModelExtension;
/*    */ import com.intellij.testFramework.rules.ProjectModelRule;
/*    */ import com.intellij.testFramework.rules.TempDirectory;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.junit.jupiter.api.extension.AfterEachCallback;
/*    */ import org.junit.jupiter.api.extension.BeforeEachCallback;
/*    */ import org.junit.jupiter.api.extension.ExtensionContext;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\002\030\002\n\002\b\002\b\026\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\b\020!\032\0020\"H\024J\020\020(\032\0020)2\006\020#\032\0020*H\026J\020\020+\032\0020)2\006\020#\032\0020*H\026R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\007\020\bR\032\020\t\032\0020\nX.¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\021\020\017\032\0020\0208F¢\006\006\032\004\b\021\020\022R\021\020\023\032\0020\0248F¢\006\006\032\004\b\025\020\026R\021\020\027\032\0020\0308F¢\006\006\032\004\b\031\020\032R\021\020\033\032\0020\0348F¢\006\006\032\004\b\035\020\036R\016\020\037\032\0020 X\004¢\006\002\n\000R\033\020#\032\0020\"8FX\002¢\006\f\n\004\b&\020'\032\004\b$\020%¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tests/AgentActionExtension;", "Lorg/junit/jupiter/api/extension/BeforeEachCallback;", "Lorg/junit/jupiter/api/extension/AfterEachCallback;", "<init>", "()V", "projectModel", "Lcom/intellij/testFramework/rules/ProjectModelExtension;", "getProjectModel", "()Lcom/intellij/testFramework/rules/ProjectModelExtension;", "module", "Lcom/intellij/openapi/module/Module;", "getModule", "()Lcom/intellij/openapi/module/Module;", "setModule", "(Lcom/intellij/openapi/module/Module;)V", "baseProjectDir", "Lcom/intellij/testFramework/rules/TempDirectory;", "getBaseProjectDir", "()Lcom/intellij/testFramework/rules/TempDirectory;", "projectRootDir", "Ljava/nio/file/Path;", "getProjectRootDir", "()Ljava/nio/file/Path;", "root", "Lcom/intellij/openapi/vfs/VirtualFile;", "getRoot", "()Lcom/intellij/openapi/vfs/VirtualFile;", "project", "Lcom/intellij/openapi/project/Project;", "getProject", "()Lcom/intellij/openapi/project/Project;", "testExecutionEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionEnvironment;", "buildContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "context", "getContext", "()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "context$delegate", "Lkotlin/Lazy;", "beforeEach", "", "Lorg/junit/jupiter/api/extension/ExtensionContext;", "afterEach", "ej-core-test"})
/*    */ public class AgentActionExtension implements BeforeEachCallback, AfterEachCallback {
/*    */   @NotNull
/* 24 */   private final ProjectModelExtension projectModel = new ProjectModelExtension(); public Module module; @NotNull public final ProjectModelExtension getProjectModel() { return this.projectModel; } @NotNull
/* 25 */   public final Module getModule() { if (this.module != null) return this.module;  Intrinsics.throwUninitializedPropertyAccessException("module"); return null; } public final void setModule(@NotNull Module <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.module = <set-?>; }
/*    */    @NotNull
/*    */   public final TempDirectory getBaseProjectDir() {
/* 28 */     return this.projectModel.getBaseProjectDir();
/*    */   } @NotNull
/*    */   public final Path getProjectRootDir() {
/* 31 */     return this.projectModel.getProjectRootDir();
/*    */   } @NotNull
/*    */   public final VirtualFile getRoot() {
/* 34 */     return this.projectModel.getBaseProjectDir().getVirtualFileRoot();
/*    */   } @NotNull
/*    */   public final Project getProject() {
/* 37 */     return this.projectModel.getProject();
/*    */   } @NotNull
/* 39 */   private final LocalExecutionEnvironment testExecutionEnvironment = new LocalExecutionEnvironment(null);
/*    */   @NotNull
/*    */   protected ExecutionAgentContext buildContext() {
/* 42 */     Intrinsics.checkNotNull(getProject().getBaseDir()); return (ExecutionAgentContext)new DummyExecutionAgentContext(getProject(), new AgentContext(null, getProject().getBaseDir()), (ExecutionEnvironment)this.testExecutionEnvironment);
/*    */   }
/*    */   @NotNull
/* 45 */   private final Lazy context$delegate = LazyKt.lazy(this::context_delegate$lambda$0); @NotNull public final ExecutionAgentContext getContext() { Lazy lazy = this.context$delegate; return (ExecutionAgentContext)lazy.getValue(); } private static final ExecutionAgentContext context_delegate$lambda$0(AgentActionExtension this$0) { return this$0.buildContext(); }
/*    */   
/*    */   public void beforeEach(@NotNull ExtensionContext context) {
/* 48 */     Intrinsics.checkNotNullParameter(context, "context"); this.projectModel.beforeEach(context);
/* 49 */     setModule(ProjectModelRule.createModule$default((ProjectModelRule)this.projectModel, null, 1, null));
/* 50 */     ModuleRootModificationUtil.addContentRoot(getModule(), getRoot());
/* 51 */     PsiTestUtil.addSourceRoot(getModule(), getRoot());
/*    */   }
/*    */   
/*    */   public void afterEach(@NotNull ExtensionContext context) {
/* 55 */     Intrinsics.checkNotNullParameter(context, "context"); this.projectModel.afterEach(context);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tests\AgentActionExtension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */