/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ 
/*    */ import java.util.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\f\020\006\032\b\022\004\022\0020\0050\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId$Companion;", "", "<init>", "()V", "new", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 13 */   public final KSerializer<TaskChainId> serializer() { return (KSerializer<TaskChainId>)TaskChainId.$serializer.INSTANCE; } private Companion() {} @NotNull
/*    */   public final TaskChainId new() {
/* 15 */     Intrinsics.checkNotNullExpressionValue(UUID.randomUUID(), "randomUUID(...)"); return new TaskChainId(UUID.randomUUID());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskChainId$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */