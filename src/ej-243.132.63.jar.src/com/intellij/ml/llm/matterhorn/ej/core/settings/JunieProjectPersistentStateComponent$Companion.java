/*    */ package com.intellij.ml.llm.matterhorn.ej.core.settings;
/*    */ 
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.components.ServicesKt;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\b\032\0020\t2\006\020\n\032\0020\013R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger$ej_core", "()Lcom/intellij/openapi/diagnostic/Logger;", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent;", "project", "Lcom/intellij/openapi/project/Project;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nJunieProjectPersistentStateComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieProjectPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,58:1\n31#2,2:59\n*S KotlinDebug\n*F\n+ 1 JunieProjectPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent$Companion\n*L\n19#1:59,2\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 17 */   public final Logger getLogger$ej_core() { return JunieProjectPersistentStateComponent.access$getLogger$cp(); } private Companion() {} @NotNull
/*    */   public final JunieProjectPersistentStateComponent getInstance(@NotNull Project project) {
/* 19 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 59 */     Class<JunieProjectPersistentStateComponent> serviceClass$iv = JunieProjectPersistentStateComponent.class;
/* 60 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (JunieProjectPersistentStateComponent)$this$service$iv.getService(serviceClass$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\settings\JunieProjectPersistentStateComponent$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */