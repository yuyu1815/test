/*    */ package ai.grazie.gen.tasks.data.generateChart;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 )2\0020\001:\002()BC\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\020\b\001\020\007\032\n\022\004\022\0020\t\030\0010\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB+\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\005\022\020\b\002\020\007\032\n\022\004\022\0020\t\030\0010\b¢\006\002\020\rJ\t\020\027\032\0020\005HÆ\003J\013\020\030\032\004\030\0010\005HÆ\003J\021\020\031\032\n\022\004\022\0020\t\030\0010\bHÆ\003J1\020\032\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0052\020\b\002\020\007\032\n\022\004\022\0020\t\030\0010\bHÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\003HÖ\001J\t\020\037\032\0020\005HÖ\001J&\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÁ\001¢\006\002\b'R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R$\020\007\032\n\022\004\022\0020\t\030\0010\b8\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\024R\036\020\006\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\025\020\017\032\004\b\026\020\021¨\006*"}, d2 = {"Lai/grazie/gen/tasks/data/generateChart/Column;", "", "seen1", "", "name", "", "type", "statistics", "", "Lai/grazie/gen/tasks/data/generateChart/Statistics;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getStatistics$annotations", "getStatistics", "()Ljava/util/List;", "getType$annotations", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class Column {
/*    */   @NotNull
/* 31 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String name; @Nullable
/*    */   private final String type;
/*    */   
/* 36 */   public Column(@NotNull String name, @Nullable String type, @Nullable List<Statistics> statistics) { this.name = name;
/*    */ 
/*    */     
/* 39 */     this.type = type;
/*    */ 
/*    */     
/* 42 */     this.statistics = statistics; } @Nullable private final List<Statistics> statistics; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @Nullable
/* 43 */   public final List<Statistics> getStatistics() { return this.statistics; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)Statistics.$serializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/data/generateChart/Column.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/data/generateChart/Column;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<Column> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])Column.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[2]);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Column deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null;
/*    */       List list = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])Column.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x2;
/*    */         list = (List)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
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
/*    */               list = (List)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Column(i, str1, str2, list, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Column value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Column.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.data.generateChart.Column", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("name", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("type", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("statistics", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/data/generateChart/Column$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/data/generateChart/Column;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Column> serializer() {
/*    */       return (KSerializer<Column>)Column.$serializer.INSTANCE;
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
/*    */   @Nullable
/*    */   public final List<Statistics> component3() {
/*    */     return this.statistics;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Column copy(@NotNull String name, @Nullable String type, @Nullable List<Statistics> statistics) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     return new Column(name, type, statistics);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Column(name=" + this.name + ", type=" + this.type + ", statistics=" + this.statistics + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + ((this.type == null) ? 0 : this.type.hashCode());
/*    */     return result * 31 + ((this.statistics == null) ? 0 : this.statistics.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Column))
/*    */       return false; 
/*    */     Column column = (Column)other;
/*    */     return !Intrinsics.areEqual(this.name, column.name) ? false : (!Intrinsics.areEqual(this.type, column.type) ? false : (!!Intrinsics.areEqual(this.statistics, column.statistics)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\data\generateChart\Column.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */