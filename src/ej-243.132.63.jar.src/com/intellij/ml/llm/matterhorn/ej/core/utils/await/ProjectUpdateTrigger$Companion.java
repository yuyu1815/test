/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils.await;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectUpdateTrigger$Companion;", "", "<init>", "()V", "EP", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectUpdateTrigger;", "getEP", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "shouldTriggerUpdate", "", "project", "Lcom/intellij/openapi/project/Project;", "updatedDoc", "Lcom/intellij/openapi/editor/Document;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nProjectUpdateTrigger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectUpdateTrigger.kt\ncom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectUpdateTrigger$Companion\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,37:1\n24#2:38\n24#2:39\n*S KotlinDebug\n*F\n+ 1 ProjectUpdateTrigger.kt\ncom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectUpdateTrigger$Companion\n*L\n24#1:38\n28#1:39\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 14 */   private static final ExtensionPointName<ProjectUpdateTrigger> EP = new ExtensionPointName("com.intellij.ml.llm.matterhorn.projectUpdateTrigger"); @NotNull public final ExtensionPointName<ProjectUpdateTrigger> getEP() { return EP; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean shouldTriggerUpdate(@NotNull Project project, @NotNull Document updatedDoc) {
/* 21 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(updatedDoc, "updatedDoc"); for (ProjectUpdateTrigger trigger : EP.getExtensionList()) {
/*    */       
/* 23 */       try { if (trigger.shouldLaunchUpdate(project, updatedDoc))
/* 24 */         { Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0;
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
/* 38 */           Intrinsics.checkNotNullExpressionValue(Logger.getInstance(Companion.class), "getInstance(...)"); Logger.getInstance(Companion.class).info("Trigger " + Reflection.getOrCreateKotlinClass(trigger.getClass()).getQualifiedName() + " requested project update"); return true; }  }
/* 39 */       catch (Throwable t) { Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(Companion.class), "getInstance(...)"); Logger.getInstance(Companion.class).warn("Trigger " + Reflection.getOrCreateKotlinClass(trigger.getClass()).getQualifiedName() + " failed", t); }
/*    */     
/*    */     } 
/*    */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\await\ProjectUpdateTrigger$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */