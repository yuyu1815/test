/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ 
/*    */ import kotlinx.serialization.json.JsonBuilder;
/*    */ import kotlinx.serialization.modules.SerializersModule;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\016\020\n\032\0020\0132\006\020\f\032\0020\rJ\016\020\016\032\0020\r2\006\020\f\032\0020\013J\025\020\017\032\0020\0202\006\020\002\032\0020\003H\000¢\006\002\b\021R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;", "", "module", "Lkotlinx/serialization/modules/SerializersModule;", "usePrettyPrint", "", "<init>", "(Lkotlinx/serialization/modules/SerializersModule;Z)V", "format", "Lkotlinx/serialization/json/Json;", "serialize", "", "data", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventWithMetadata;", "deserialize", "reloadModule", "", "reloadModule$core", "core"})
/*    */ @SourceDebugExtension({"SMAP\nSerializableEventJsonSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableEventJsonSerializer.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,29:1\n205#2:30\n222#2:31\n*S KotlinDebug\n*F\n+ 1 SerializableEventJsonSerializer.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer\n*L\n17#1:30\n20#1:31\n*E\n"})
/*    */ public final class SerializableEventJsonSerializer {
/*    */   private final boolean usePrettyPrint;
/*    */   
/* 11 */   private static final Unit format$lambda$0(SerializableEventJsonSerializer this$0, SerializersModule $module, JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setPrettyPrint(this$0.usePrettyPrint);
/* 12 */     $this$Json.setSerializersModule($module);
/* 13 */     return Unit.INSTANCE; }
/*    */   @NotNull
/*    */   private volatile Json format; public SerializableEventJsonSerializer(@NotNull SerializersModule module, boolean usePrettyPrint) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'module'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: aload_0
/*    */     //   11: iload_2
/*    */     //   12: putfield usePrettyPrint : Z
/*    */     //   15: aload_0
/*    */     //   16: aconst_null
/*    */     //   17: aload_0
/*    */     //   18: aload_1
/*    */     //   19: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;Lkotlinx/serialization/modules/SerializersModule;)Lkotlin/jvm/functions/Function1;
/*    */     //   24: iconst_1
/*    */     //   25: aconst_null
/*    */     //   26: invokestatic Json$default : (Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;
/*    */     //   29: putfield format : Lkotlinx/serialization/json/Json;
/*    */     //   32: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 6
/*    */     //   #10	-> 15
/*    */     //   #8	-> 32
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	33	0	this	Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;
/*    */     //   0	33	1	module	Lkotlinx/serialization/modules/SerializersModule;
/*    */     //   0	33	2	usePrettyPrint	Z } @NotNull
/*    */   public final String serialize(@NotNull SerializableEventWithMetadata data) throws SerializationException, ConcurrentModificationException {
/* 17 */     Intrinsics.checkNotNullParameter(data, "data"); Json this_$iv = this.format; int $i$f$encodeToString = 0;
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
/* 30 */     this_$iv.getSerializersModule(); return this_$iv.encodeToString((SerializationStrategy)SerializableEventWithMetadata.Companion.serializer(), data); } @NotNull public final SerializableEventWithMetadata deserialize(@NotNull String data) { Intrinsics.checkNotNullParameter(data, "data"); Json this_$iv = this.format; int $i$f$decodeFromString = 0;
/* 31 */     this_$iv.getSerializersModule(); return (SerializableEventWithMetadata)this_$iv.decodeFromString((DeserializationStrategy)SerializableEventWithMetadata.Companion.serializer(), data); }
/*    */ 
/*    */   
/*    */   public final void reloadModule$core(@NotNull SerializersModule module) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'module'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: aconst_null
/*    */     //   8: aload_0
/*    */     //   9: aload_1
/*    */     //   10: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;Lkotlinx/serialization/modules/SerializersModule;)Lkotlin/jvm/functions/Function1;
/*    */     //   15: iconst_1
/*    */     //   16: aconst_null
/*    */     //   17: invokestatic Json$default : (Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;
/*    */     //   20: putfield format : Lkotlinx/serialization/json/Json;
/*    */     //   23: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 6
/*    */     //   #28	-> 23
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	24	0	this	Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;
/*    */     //   0	24	1	module	Lkotlinx/serialization/modules/SerializersModule;
/*    */   }
/*    */   
/*    */   private static final Unit reloadModule$lambda$1(SerializableEventJsonSerializer this$0, SerializersModule $module, JsonBuilder $this$Json) {
/*    */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json");
/*    */     $this$Json.setPrettyPrint(this$0.usePrettyPrint);
/*    */     $this$Json.setSerializersModule($module);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventJsonSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */