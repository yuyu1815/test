/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\024\020\b\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fJ\030\020\r\032\0020\0162\006\020\006\032\0020\0052\b\020\017\032\004\030\0010\005R\016\020\020\032\0020\021XT¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Companion;", "", "<init>", "()V", "buildAiIgnoreMessage", "", "path", "Ljava/nio/file/Path;", "getExtractors", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "createQuery", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "testName", "MAX_TEST_LOCATIONS", "", "ej-idea"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final String buildAiIgnoreMessage(@NotNull Path path) {
/* 40 */     Intrinsics.checkNotNullParameter(path, "path"); return "ERROR: " + path + " must not be run according to .aiignore settings";
/*    */   }
/*    */   @NotNull
/*    */   public final List<ActionLocationsExtractor> getExtractors(@NotNull ExecutionAgentContext context) {
/* 44 */     Intrinsics.checkNotNullParameter(context, "context"); ActionLocationsExtractor[] arrayOfActionLocationsExtractor = new ActionLocationsExtractor[4]; arrayOfActionLocationsExtractor[0] = new SingleTestExtractor(context); arrayOfActionLocationsExtractor[1] = 
/* 45 */       new FilePathActionLocationExtractor(context);
/* 46 */     arrayOfActionLocationsExtractor[2] = new FileFQNActionLocationExtractor(context);
/* 47 */     arrayOfActionLocationsExtractor[3] = new FolderPathActionLocationExtractor(context);
/*    */     return CollectionsKt.listOf((Object[])arrayOfActionLocationsExtractor);
/*    */   } @NotNull
/*    */   public final ActionLocationsExtractor.Query createQuery(@NotNull String path, @Nullable String testName) {
/* 51 */     Intrinsics.checkNotNullParameter(path, "path"); return (testName != null) ? 
/* 52 */       new ActionLocationsExtractor.Query.SingleTest(path, testName) : 
/*    */       
/* 54 */       new ActionLocationsExtractor.Query.RawPath(path);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\ActionLocationsExtractor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */