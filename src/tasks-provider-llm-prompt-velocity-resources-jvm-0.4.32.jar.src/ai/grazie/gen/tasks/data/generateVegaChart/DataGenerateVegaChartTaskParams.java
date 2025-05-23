/*    */ package ai.grazie.gen.tasks.data.generateVegaChart;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B1\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\003\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\031\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\nJ\t\020\023\032\0020\005HÆ\003J\020\020\024\032\004\030\0010\003HÆ\003¢\006\002\020\021J$\020\025\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\003HÆ\001¢\006\002\020\026J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\034HÖ\001J&\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#HÁ\001¢\006\002\b$R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\013\020\f\032\004\b\r\020\016R \020\006\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\022\022\004\b\017\020\f\032\004\b\020\020\021¨\006'"}, d2 = {"Lai/grazie/gen/tasks/data/generateVegaChart/DataGenerateVegaChartTaskParams;", "", "seen1", "", "dataframe", "Lai/grazie/gen/tasks/data/generateVegaChart/Dataframe;", "numberOfCharts", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gen/tasks/data/generateVegaChart/Dataframe;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gen/tasks/data/generateVegaChart/Dataframe;Ljava/lang/Integer;)V", "getDataframe$annotations", "()V", "getDataframe", "()Lai/grazie/gen/tasks/data/generateVegaChart/Dataframe;", "getNumberOfCharts$annotations", "getNumberOfCharts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lai/grazie/gen/tasks/data/generateVegaChart/Dataframe;Ljava/lang/Integer;)Lai/grazie/gen/tasks/data/generateVegaChart/DataGenerateVegaChartTaskParams;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class DataGenerateVegaChartTaskParams {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 35 */   public DataGenerateVegaChartTaskParams(@NotNull Dataframe dataframe, @Nullable Integer numberOfCharts) { this.dataframe = dataframe;
/*    */ 
/*    */     
/* 38 */     this.numberOfCharts = numberOfCharts; } @NotNull private final Dataframe dataframe; @Nullable private final Integer numberOfCharts; @Nullable
/* 39 */   public final Integer getNumberOfCharts() { return this.numberOfCharts; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/data/generateVegaChart/DataGenerateVegaChartTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/data/generateVegaChart/DataGenerateVegaChartTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<DataGenerateVegaChartTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)Dataframe.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public DataGenerateVegaChartTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Dataframe dataframe = null;
/*    */       Integer integer = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         dataframe = (Dataframe)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Dataframe.$serializer.INSTANCE, dataframe);
/*    */         i |= 0x1;
/*    */         integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               dataframe = (Dataframe)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Dataframe.$serializer.INSTANCE, dataframe);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new DataGenerateVegaChartTaskParams(i, dataframe, integer, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull DataGenerateVegaChartTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       DataGenerateVegaChartTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.data.generateVegaChart.DataGenerateVegaChartTaskParams", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("dataframe", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("numberOfCharts", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/data/generateVegaChart/DataGenerateVegaChartTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/data/generateVegaChart/DataGenerateVegaChartTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<DataGenerateVegaChartTaskParams> serializer() {
/*    */       return (KSerializer<DataGenerateVegaChartTaskParams>)DataGenerateVegaChartTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Dataframe getDataframe() {
/*    */     return this.dataframe;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Dataframe component1() {
/*    */     return this.dataframe;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component2() {
/*    */     return this.numberOfCharts;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DataGenerateVegaChartTaskParams copy(@NotNull Dataframe dataframe, @Nullable Integer numberOfCharts) {
/*    */     Intrinsics.checkNotNullParameter(dataframe, "dataframe");
/*    */     return new DataGenerateVegaChartTaskParams(dataframe, numberOfCharts);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DataGenerateVegaChartTaskParams(dataframe=" + this.dataframe + ", numberOfCharts=" + this.numberOfCharts + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.dataframe.hashCode();
/*    */     return result * 31 + ((this.numberOfCharts == null) ? 0 : this.numberOfCharts.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DataGenerateVegaChartTaskParams))
/*    */       return false; 
/*    */     DataGenerateVegaChartTaskParams dataGenerateVegaChartTaskParams = (DataGenerateVegaChartTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.dataframe, dataGenerateVegaChartTaskParams.dataframe) ? false : (!!Intrinsics.areEqual(this.numberOfCharts, dataGenerateVegaChartTaskParams.numberOfCharts));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\data\generateVegaChart\DataGenerateVegaChartTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */