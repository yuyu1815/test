/*    */ package ai.grazie.model.task.library.v2.data;
/*    */ import java.util.List;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B=\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\016\020\007\032\n\022\004\022\0020\t\030\0010\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB%\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\005\022\f\020\007\032\b\022\004\022\0020\t0\b¢\006\002\020\rJ\t\020\023\032\0020\005HÆ\003J\013\020\024\032\004\030\0010\005HÆ\003J\017\020\025\032\b\022\004\022\0020\t0\bHÆ\003J/\020\026\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0052\016\b\002\020\007\032\b\022\004\022\0020\t0\bHÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\005HÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\027\020\007\032\b\022\004\022\0020\t0\b¢\006\b\n\000\032\004\b\020\020\021R\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\022\020\017¨\006&"}, d2 = {"Lai/grazie/model/task/library/v2/data/ColumnDescription;", "", "seen1", "", "name", "", "type", "statistics", "", "Lai/grazie/model/task/library/v2/data/DescriptionStatisticsValue;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getStatistics", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*    */ public final class ColumnDescription {
/*    */   @NotNull
/* 23 */   public static final Companion Companion = new Companion(null); @NotNull private final String name; @Nullable private final String type; @NotNull
/*    */   private final List<DescriptionStatisticsValue> statistics; @JvmField
/*    */   @NotNull
/* 26 */   private static final KSerializer<Object>[] $childSerializers; public ColumnDescription(@NotNull String name, @Nullable String type, @NotNull List<DescriptionStatisticsValue> statistics) { this.name = name;
/* 27 */     this.type = type;
/* 28 */     this.statistics = statistics; } @NotNull public final List<DescriptionStatisticsValue> getStatistics() { return this.statistics; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)DescriptionStatisticsValue.$serializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/v2/data/ColumnDescription.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/v2/data/ColumnDescription;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */   public static final class $serializer implements GeneratedSerializer<ColumnDescription> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])ColumnDescription.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public ColumnDescription deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null;
/*    */       List list = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])ColumnDescription.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x2;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new ColumnDescription(i, str1, str2, list, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ColumnDescription value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       ColumnDescription.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.library.v2.data.ColumnDescription", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("name", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("type", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("statistics", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/v2/data/ColumnDescription$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/v2/data/ColumnDescription;", "model-task"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ColumnDescription> serializer() {
/*    */       return (KSerializer<ColumnDescription>)ColumnDescription.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<DescriptionStatisticsValue> component3() {
/*    */     return this.statistics;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ColumnDescription copy(@NotNull String name, @Nullable String type, @NotNull List<DescriptionStatisticsValue> statistics) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(statistics, "statistics");
/*    */     return new ColumnDescription(name, type, statistics);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ColumnDescription(name=" + this.name + ", type=" + this.type + ", statistics=" + this.statistics + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + ((this.type == null) ? 0 : this.type.hashCode());
/*    */     return result * 31 + this.statistics.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ColumnDescription))
/*    */       return false; 
/*    */     ColumnDescription columnDescription = (ColumnDescription)other;
/*    */     return !Intrinsics.areEqual(this.name, columnDescription.name) ? false : (!Intrinsics.areEqual(this.type, columnDescription.type) ? false : (!!Intrinsics.areEqual(this.statistics, columnDescription.statistics)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\data\ColumnDescription.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */