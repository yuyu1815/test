/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000*\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\032&\020\000\032\002H\001\"\n\b\000\020\001\030\001*\0020\002*\0020\0032\006\020\004\032\0020\005H\b¢\006\002\020\006\0324\020\007\032\0020\005\"\b\b\000\020\001*\0020\005*\0020\0032\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\002H\0010\0132\b\b\002\020\f\032\0020\r\0324\020\016\032\0020\005\"\b\b\000\020\001*\0020\005*\0020\0032\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\002H\0010\0132\b\b\002\020\f\032\0020\r\0329\020\017\032\0020\t\"\b\b\000\020\001*\0020\005*\0020\0032\006\020\b\032\002H\0012\f\020\020\032\b\022\004\022\002H\0010\0132\b\b\002\020\f\032\0020\r¢\006\002\020\021¨\006\022"}, d2 = {"handle", "T", "Lai/grazie/model/cloud/sse/continuous/Data;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;", "event", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;", "(Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;)Lai/grazie/model/cloud/sse/continuous/Data;", "parse", "obj", "", "dataSerializer", "Lkotlinx/serialization/KSerializer;", "json", "Lai/grazie/utils/json/JSON;", "parseV2", "serialize", "serializer", "(Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)Ljava/lang/String;", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/model/cloud/sse/continuous/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,54:1\n1#2:55\n74#3,2:56\n70#3,8:58\n74#3,2:66\n70#3,8:68\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nai/grazie/model/cloud/sse/continuous/ExtensionsKt\n*L\n10#1:56,2\n10#1:58,8\n21#1:66,2\n21#1:68,8\n*E\n"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/*    */   public static final <T extends ContinuousSSEEvent> ContinuousSSEEvent parse(@NotNull ContinuousSSEEvent.Companion $this$parse, @NotNull String obj, @NotNull KSerializer dataSerializer, @NotNull JSON json) { Object object2;
/*  9 */     Intrinsics.checkNotNullParameter($this$parse, "<this>"); Intrinsics.checkNotNullParameter(obj, "obj"); Intrinsics.checkNotNullParameter(dataSerializer, "dataSerializer"); Intrinsics.checkNotNullParameter(json, "json"); String type = json.parseStringValueOrNull(obj, "event_type");
/* 10 */     String it = type;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     int $i$a$-let-ExtensionsKt$parse$1 = 0; JSON jSON = json; String value$iv = "\"" + it + "\""; int $i$f$parseOrNull = 0;
/*    */     try {
/* 57 */       JSON this_$iv$iv = jSON; int $i$f$parse = 0;
/* 58 */       object2 = this_$iv$iv.parse((DeserializationStrategy)ContinuousSSEEventType.Companion.serializer(), value$iv);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 64 */     catch (SerializationException e$iv) {}
/* 65 */     null; (type != null) ? object2 : null; switch ((((type != null) ? object2 : null) == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[((type != null) ? object2 : null).ordinal()]) { case true: case true: case true: case true: default: throw new SerializationException("Unknown EventType: " + type + " not found or does not matches any event type, received object: " + obj); }  Object object1 = (type != null) ? object2 : null; int $i$a$-let-ExtensionsKt$parse$2 = 0; return (ContinuousSSEEvent)json.parse((DeserializationStrategy)object1, obj); } @NotNull public static final <T extends ContinuousSSEEvent> ContinuousSSEEvent parseV2(@NotNull ContinuousSSEEvent.Companion $this$parseV2, @NotNull String obj, @NotNull KSerializer dataSerializer, @NotNull JSON json) { Object object; Intrinsics.checkNotNullParameter($this$parseV2, "<this>"); Intrinsics.checkNotNullParameter(obj, "obj"); Intrinsics.checkNotNullParameter(dataSerializer, "dataSerializer"); Intrinsics.checkNotNullParameter(json, "json"); String it = json.parseStringValueOrNull(obj, "event_type"); int $i$a$-let-ExtensionsKt$parseV2$type$1 = 0; JSON jSON = json; String value$iv = "\"" + it + "\""; int $i$f$parseOrNull = 0;
/*    */     try {
/* 67 */       JSON this_$iv$iv = jSON; int $i$f$parse = 0;
/* 68 */       object = this_$iv$iv.parse((DeserializationStrategy)ContinuousSSEEventType.Companion.serializer(), value$iv);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 74 */     catch (SerializationException e$iv) {}
/* 75 */     null; ContinuousSSEEventType type = (json.parseStringValueOrNull(obj, "event_type") != null) ? (ContinuousSSEEventType)object : null;
/*    */     KSerializer serializer = (type == ContinuousSSEEventType.Data) ? dataSerializer : (KSerializer)ContinuousSSEExceptionEventV2Serializer.INSTANCE;
/*    */     return (ContinuousSSEEvent)json.parse((DeserializationStrategy)serializer, obj); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <T extends ContinuousSSEEvent> String serialize(@NotNull ContinuousSSEEvent.Companion $this$serialize, @NotNull ContinuousSSEEvent obj, @NotNull KSerializer serializer, @NotNull JSON json) {
/*    */     Intrinsics.checkNotNullParameter($this$serialize, "<this>");
/*    */     Intrinsics.checkNotNullParameter(obj, "obj");
/*    */     Intrinsics.checkNotNullParameter(serializer, "serializer");
/*    */     Intrinsics.checkNotNullParameter(json, "json");
/*    */     return json.string((SerializationStrategy)serializer, obj);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */