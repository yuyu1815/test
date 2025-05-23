/*    */ package ai.grazie.utils.data;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.StringCompanionObject;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationException;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import kotlinx.serialization.json.JsonElementKt;
/*    */ import kotlinx.serialization.json.JsonObject;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/data/DataHolderSerializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/data/DataHolder;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */ public final class DataHolderSerializer
/*    */   implements KSerializer<DataHolder>
/*    */ {
/*    */   @NotNull
/* 72 */   public static final DataHolderSerializer INSTANCE = new DataHolderSerializer(); @NotNull private static final SerialDescriptor descriptor = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), JsonElement.Companion.serializer()).getDescriptor(); @NotNull public SerialDescriptor getDescriptor() { return descriptor; }
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull DataHolder value) {
/* 75 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); Map<String, JsonElement> map = value.getData$utils_common();
/* 76 */     CompositeEncoder compositeEncoder = encoder.beginStructure(getDescriptor());
/* 77 */     for (Map.Entry<String, JsonElement> entry : map.entrySet()) { String key = (String)entry.getKey(); JsonElement element = (JsonElement)entry.getValue();
/* 78 */       compositeEncoder.encodeSerializableElement(getDescriptor(), 0, (SerializationStrategy)BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), key);
/* 79 */       compositeEncoder.encodeSerializableElement(getDescriptor(), 1, (SerializationStrategy)JsonElement.Companion.serializer(), element); }
/*    */     
/* 81 */     compositeEncoder.endStructure(getDescriptor());
/*    */   } @NotNull
/*    */   public DataHolder deserialize(@NotNull Decoder decoder) {
/*    */     Object object;
/* 85 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); if (((decoder instanceof kotlinx.serialization.json.JsonDecoder) ? decoder : null) == null) { (decoder instanceof kotlinx.serialization.json.JsonDecoder) ? decoder : null; throw new SerializationException("This class can be loaded only by JSON"); }
/*    */     
/* 87 */     JsonObject jsonObject = JsonElementKt.getJsonObject(object.decodeJsonElement());
/* 88 */     Map<String, ? extends JsonElement> map = MapsKt.toMap((Map)jsonObject);
/*    */     
/* 90 */     return new DataHolder(map);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\data\DataHolderSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */