/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ 
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.modules.SerializersModule;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\013\032\0020\fR\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventUpdatableSerializer;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventRegister;", "serializer", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;", "getSerializer", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;", "makeSerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "core"})
/*    */ public final class SerializableEventUpdatableSerializer
/*    */ {
/*    */   @NotNull
/* 44 */   public static final SerializableEventUpdatableSerializer INSTANCE = new SerializableEventUpdatableSerializer(); @NotNull private static final ExtensionPointName<SerializableEventRegister> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.events.serializableEventRegister");
/*    */   @NotNull
/* 46 */   private static final SerializableEventJsonSerializer serializer = new SerializableEventJsonSerializer(INSTANCE.makeSerializersModule(), false); @NotNull public final SerializableEventJsonSerializer getSerializer() { return serializer; }
/*    */    @NotNull
/*    */   public final SerializersModule makeSerializersModule() {
/* 49 */     return SerializableEventRegister.Companion.makeSerializersModule(EP_NAME.getExtensionList());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventUpdatableSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */