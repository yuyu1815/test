/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\003\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\f\020\b\032\b\022\004\022\0020\0050\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable$Companion;", "", "<init>", "()V", "withStacktrace", "Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "throwable", "", "serializer", "Lkotlinx/serialization/KSerializer;", "core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<SerializableThrowable> serializer() {
/* 27 */     return (KSerializer<SerializableThrowable>)SerializableThrowable.$serializer.INSTANCE; } @NotNull
/*    */   public final SerializableThrowable withStacktrace(@NotNull Throwable throwable) {
/* 29 */     Intrinsics.checkNotNullParameter(throwable, "throwable"); return new SerializableThrowable(throwable, true);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\events\SerializableThrowable$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */