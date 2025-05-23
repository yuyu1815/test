/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import java.util.Map;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = StringProperties.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\004\b\007\030\000 \0162\0020\001:\002\016\017B\033\b\002\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\002\020\005J\023\020\b\032\0020\t2\b\020\n\032\004\030\0010\001H\002J\b\020\013\032\0020\fH\026J\b\020\r\032\0020\004H\026R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/attributes/StringProperties;", "", "map", "", "", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "equals", "", "other", "hashCode", "", "toString", "Companion", "Serializer", "utils-common"})
/*    */ public final class StringProperties {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 12 */   private StringProperties(Map<String, String> map) { this.map = map; } @NotNull private final Map<String, String> map; @NotNull public final Map<String, String> getMap() { return this.map; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\022\020\005\032\016\022\004\022\0020\007\022\004\022\0020\0070\006J\017\020\b\032\b\022\004\022\0020\0040\tHÆ\001¨\006\n"}, d2 = {"Lai/grazie/utils/attributes/StringProperties$Companion;", "", "()V", "fromMap", "Lai/grazie/utils/attributes/StringProperties;", "map", "", "", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 14 */     public final KSerializer<StringProperties> serializer() { return new StringProperties.Serializer(); } @NotNull
/*    */     public final StringProperties fromMap(@NotNull Map map) {
/* 16 */       Intrinsics.checkNotNullParameter(map, "map"); return new StringProperties(map, null);
/*    */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020$\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J\020\020\013\032\0020\0022\006\020\f\032\0020\rH\026J\030\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\002H\026R \020\004\032\024\022\020\022\016\022\004\022\0020\006\022\004\022\0020\0060\0050\001X\004¢\006\002\n\000R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\n¨\006\023"}, d2 = {"Lai/grazie/utils/attributes/StringProperties$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/StringProperties;", "()V", "delegate", "", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */   public static final class Serializer implements KSerializer<StringProperties> { @NotNull
/*    */     private final KSerializer<Map<String, String>> delegate;
/*    */     public Serializer() {
/* 21 */       this.delegate = (KSerializer<Map<String, String>>)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE);
/*    */     } @NotNull
/*    */     public StringProperties deserialize(@NotNull Decoder decoder) {
/* 24 */       Intrinsics.checkNotNullParameter(decoder, "decoder"); return new StringProperties((Map)this.delegate.deserialize(decoder), null);
/*    */     }
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/* 28 */       return this.delegate.getDescriptor();
/*    */     }
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull StringProperties value) {
/* 31 */       Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); this.delegate.serialize(encoder, value.getMap());
/*    */     } }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 36 */     if (this == other) return true; 
/* 37 */     if (!(other instanceof StringProperties)) return false;
/*    */     
/* 39 */     return Intrinsics.areEqual(this.map, ((StringProperties)other).map);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 43 */     return this.map.hashCode();
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 47 */     return this.map.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\StringProperties.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */