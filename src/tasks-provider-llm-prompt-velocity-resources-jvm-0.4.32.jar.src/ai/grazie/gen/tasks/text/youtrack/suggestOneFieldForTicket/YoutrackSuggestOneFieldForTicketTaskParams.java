/*    */ package ai.grazie.gen.tasks.text.youtrack.suggestOneFieldForTicket;
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
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\034\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 42\0020\001:\00234BW\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\020\b\001\020\006\032\n\022\004\022\0020\b\030\0010\007\022\n\b\001\020\t\032\004\030\0010\n\022\b\b\001\020\013\032\0020\f\022\b\b\001\020\r\032\0020\f\022\b\020\016\032\004\030\0010\017¢\006\002\020\020B3\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\006\020\r\032\0020\f¢\006\002\020\021J\t\020!\032\0020\005HÆ\003J\017\020\"\032\b\022\004\022\0020\b0\007HÆ\003J\t\020#\032\0020\nHÆ\003J\t\020$\032\0020\fHÆ\003J\t\020%\032\0020\fHÆ\003JA\020&\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\fHÆ\001J\023\020'\032\0020\f2\b\020(\032\004\030\0010\001HÖ\003J\t\020)\032\0020\003HÖ\001J\t\020*\032\0020\nHÖ\001J&\020+\032\0020,2\006\020-\032\0020\0002\006\020.\032\0020/2\006\0200\032\00201HÁ\001¢\006\002\b2R\034\020\r\032\0020\f8\006X\004¢\006\016\n\000\022\004\b\022\020\023\032\004\b\024\020\025R\034\020\t\032\0020\n8\006X\004¢\006\016\n\000\022\004\b\026\020\023\032\004\b\027\020\030R\034\020\013\032\0020\f8\006X\004¢\006\016\n\000\022\004\b\031\020\023\032\004\b\032\020\025R\"\020\006\032\b\022\004\022\0020\b0\0078\006X\004¢\006\016\n\000\022\004\b\033\020\023\032\004\b\034\020\035R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\036\020\023\032\004\b\037\020 ¨\0065"}, d2 = {"Lai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/YoutrackSuggestOneFieldForTicketTaskParams;", "", "seen1", "", "ticket", "Lai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/Ticket;", "propertyValues", "", "Lai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/Value;", "fieldName", "", "multi", "", "canBeEmpty", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/Ticket;Ljava/util/List;Ljava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/Ticket;Ljava/util/List;Ljava/lang/String;ZZ)V", "getCanBeEmpty$annotations", "()V", "getCanBeEmpty", "()Z", "getFieldName$annotations", "getFieldName", "()Ljava/lang/String;", "getMulti$annotations", "getMulti", "getPropertyValues$annotations", "getPropertyValues", "()Ljava/util/List;", "getTicket$annotations", "getTicket", "()Lai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/Ticket;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class YoutrackSuggestOneFieldForTicketTaskParams {
/*    */   @NotNull
/*    */   private final Ticket ticket;
/*    */   @NotNull
/*    */   private final List<Value> propertyValues;
/*    */   @NotNull
/*    */   private final String fieldName;
/*    */   @NotNull
/* 34 */   public static final Companion Companion = new Companion(null); private final boolean multi; private final boolean canBeEmpty; @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/*    */   
/*    */   public YoutrackSuggestOneFieldForTicketTaskParams(@NotNull Ticket ticket, @NotNull List<Value> propertyValues, @NotNull String fieldName, boolean multi, boolean canBeEmpty) {
/* 39 */     this.ticket = ticket;
/*    */ 
/*    */     
/* 42 */     this.propertyValues = propertyValues;
/*    */ 
/*    */     
/* 45 */     this.fieldName = fieldName;
/*    */ 
/*    */     
/* 48 */     this.multi = multi;
/*    */ 
/*    */     
/* 51 */     this.canBeEmpty = canBeEmpty; } public final boolean getCanBeEmpty() {
/* 52 */     return this.canBeEmpty;
/*    */   }
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)Value.$serializer.INSTANCE);
/*    */     arrayOfKSerializer[2] = null;
/*    */     arrayOfKSerializer[3] = null;
/*    */     arrayOfKSerializer[4] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/YoutrackSuggestOneFieldForTicketTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/YoutrackSuggestOneFieldForTicketTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<YoutrackSuggestOneFieldForTicketTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])YoutrackSuggestOneFieldForTicketTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[5];
/*    */       arrayOfKSerializer2[0] = (KSerializer)Ticket.$serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[3] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[4] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public YoutrackSuggestOneFieldForTicketTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Ticket ticket = null;
/*    */       List list = null;
/*    */       String str = null;
/*    */       boolean bool1 = false, bool2 = false;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])YoutrackSuggestOneFieldForTicketTaskParams.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         ticket = (Ticket)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Ticket.$serializer.INSTANCE, ticket);
/*    */         i |= 0x1;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */         i |= 0x2;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               ticket = (Ticket)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Ticket.$serializer.INSTANCE, ticket);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new YoutrackSuggestOneFieldForTicketTaskParams(i, ticket, list, str, bool1, bool2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull YoutrackSuggestOneFieldForTicketTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       YoutrackSuggestOneFieldForTicketTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.text.youtrack.suggestOneFieldForTicket.YoutrackSuggestOneFieldForTicketTaskParams", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("ticket", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("values", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("fieldName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("multi", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("canBeEmpty", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/YoutrackSuggestOneFieldForTicketTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/text/youtrack/suggestOneFieldForTicket/YoutrackSuggestOneFieldForTicketTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<YoutrackSuggestOneFieldForTicketTaskParams> serializer() {
/*    */       return (KSerializer<YoutrackSuggestOneFieldForTicketTaskParams>)YoutrackSuggestOneFieldForTicketTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Ticket getTicket() {
/*    */     return this.ticket;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Value> getPropertyValues() {
/*    */     return this.propertyValues;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getFieldName() {
/*    */     return this.fieldName;
/*    */   }
/*    */   
/*    */   public final boolean getMulti() {
/*    */     return this.multi;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Ticket component1() {
/*    */     return this.ticket;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Value> component2() {
/*    */     return this.propertyValues;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.fieldName;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.multi;
/*    */   }
/*    */   
/*    */   public final boolean component5() {
/*    */     return this.canBeEmpty;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final YoutrackSuggestOneFieldForTicketTaskParams copy(@NotNull Ticket ticket, @NotNull List<Value> propertyValues, @NotNull String fieldName, boolean multi, boolean canBeEmpty) {
/*    */     Intrinsics.checkNotNullParameter(ticket, "ticket");
/*    */     Intrinsics.checkNotNullParameter(propertyValues, "propertyValues");
/*    */     Intrinsics.checkNotNullParameter(fieldName, "fieldName");
/*    */     return new YoutrackSuggestOneFieldForTicketTaskParams(ticket, propertyValues, fieldName, multi, canBeEmpty);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "YoutrackSuggestOneFieldForTicketTaskParams(ticket=" + this.ticket + ", propertyValues=" + this.propertyValues + ", fieldName=" + this.fieldName + ", multi=" + this.multi + ", canBeEmpty=" + this.canBeEmpty + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.ticket.hashCode();
/*    */     result = result * 31 + this.propertyValues.hashCode();
/*    */     result = result * 31 + this.fieldName.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.multi);
/*    */     return result * 31 + Boolean.hashCode(this.canBeEmpty);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof YoutrackSuggestOneFieldForTicketTaskParams))
/*    */       return false; 
/*    */     YoutrackSuggestOneFieldForTicketTaskParams youtrackSuggestOneFieldForTicketTaskParams = (YoutrackSuggestOneFieldForTicketTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.ticket, youtrackSuggestOneFieldForTicketTaskParams.ticket) ? false : (!Intrinsics.areEqual(this.propertyValues, youtrackSuggestOneFieldForTicketTaskParams.propertyValues) ? false : (!Intrinsics.areEqual(this.fieldName, youtrackSuggestOneFieldForTicketTaskParams.fieldName) ? false : ((this.multi != youtrackSuggestOneFieldForTicketTaskParams.multi) ? false : (!(this.canBeEmpty != youtrackSuggestOneFieldForTicketTaskParams.canBeEmpty)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\text\youtrack\suggestOneFieldForTicket\YoutrackSuggestOneFieldForTicketTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */