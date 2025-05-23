/*    */ package ai.grazie.gen.tasks.terminal.explainCommand;
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
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\025\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 02\0020\001:\002/0BI\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\007\022\n\b\001\020\b\032\004\030\0010\t\022\n\b\001\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\017J\t\020\035\032\0020\005HÆ\003J\t\020\036\032\0020\007HÆ\003J\t\020\037\032\0020\tHÆ\003J\t\020 \032\0020\013HÆ\003J1\020!\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\"\032\0020#2\b\020$\032\004\030\0010\001HÖ\003J\t\020%\032\0020\003HÖ\001J\t\020&\032\0020\005HÖ\001J&\020'\032\0020(2\006\020)\032\0020\0002\006\020*\032\0020+2\006\020,\032\0020-HÁ\001¢\006\002\b.R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\020\020\021\032\004\b\022\020\023R\034\020\006\032\0020\0078\006X\004¢\006\016\n\000\022\004\b\024\020\021\032\004\b\025\020\026R\034\020\n\032\0020\0138\006X\004¢\006\016\n\000\022\004\b\027\020\021\032\004\b\030\020\031R\034\020\b\032\0020\t8\006X\004¢\006\016\n\000\022\004\b\032\020\021\032\004\b\033\020\034¨\0061"}, d2 = {"Lai/grazie/gen/tasks/terminal/explainCommand/TerminalExplainCommandTaskParams;", "", "seen1", "", "command", "", "device", "Lai/grazie/gen/tasks/terminal/explainCommand/Device;", "terminal", "Lai/grazie/gen/tasks/terminal/explainCommand/Terminal;", "history", "Lai/grazie/gen/tasks/terminal/explainCommand/History;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/gen/tasks/terminal/explainCommand/Device;Lai/grazie/gen/tasks/terminal/explainCommand/Terminal;Lai/grazie/gen/tasks/terminal/explainCommand/History;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/gen/tasks/terminal/explainCommand/Device;Lai/grazie/gen/tasks/terminal/explainCommand/Terminal;Lai/grazie/gen/tasks/terminal/explainCommand/History;)V", "getCommand$annotations", "()V", "getCommand", "()Ljava/lang/String;", "getDevice$annotations", "getDevice", "()Lai/grazie/gen/tasks/terminal/explainCommand/Device;", "getHistory$annotations", "getHistory", "()Lai/grazie/gen/tasks/terminal/explainCommand/History;", "getTerminal$annotations", "getTerminal", "()Lai/grazie/gen/tasks/terminal/explainCommand/Terminal;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class TerminalExplainCommandTaskParams
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String command;
/*    */   
/*    */   public TerminalExplainCommandTaskParams(@NotNull String command, @NotNull Device device, @NotNull Terminal terminal, @NotNull History history) {
/* 39 */     this.command = command;
/*    */ 
/*    */     
/* 42 */     this.device = device;
/*    */ 
/*    */     
/* 45 */     this.terminal = terminal;
/*    */ 
/*    */     
/* 48 */     this.history = history; } @NotNull private final Device device; @NotNull private final Terminal terminal; @NotNull private final History history; @NotNull
/* 49 */   public final History getHistory() { return this.history; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/terminal/explainCommand/TerminalExplainCommandTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/terminal/explainCommand/TerminalExplainCommandTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<TerminalExplainCommandTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Device.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)Terminal.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)History.$serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public TerminalExplainCommandTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str = null;
/*    */       Device device = null;
/*    */       Terminal terminal = null;
/*    */       History history = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         device = (Device)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Device.$serializer.INSTANCE, device);
/*    */         i |= 0x2;
/*    */         terminal = (Terminal)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Terminal.$serializer.INSTANCE, terminal);
/*    */         i |= 0x4;
/*    */         history = (History)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)History.$serializer.INSTANCE, history);
/*    */         i |= 0x8;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               device = (Device)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Device.$serializer.INSTANCE, device);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               terminal = (Terminal)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Terminal.$serializer.INSTANCE, terminal);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               history = (History)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)History.$serializer.INSTANCE, history);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new TerminalExplainCommandTaskParams(i, str, device, terminal, history, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull TerminalExplainCommandTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       TerminalExplainCommandTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.terminal.explainCommand.TerminalExplainCommandTaskParams", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("command", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("device", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("terminal", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("history", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/terminal/explainCommand/TerminalExplainCommandTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/terminal/explainCommand/TerminalExplainCommandTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TerminalExplainCommandTaskParams> serializer() {
/*    */       return (KSerializer<TerminalExplainCommandTaskParams>)TerminalExplainCommandTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getCommand() {
/*    */     return this.command;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Device getDevice() {
/*    */     return this.device;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Terminal getTerminal() {
/*    */     return this.terminal;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.command;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Device component2() {
/*    */     return this.device;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Terminal component3() {
/*    */     return this.terminal;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final History component4() {
/*    */     return this.history;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TerminalExplainCommandTaskParams copy(@NotNull String command, @NotNull Device device, @NotNull Terminal terminal, @NotNull History history) {
/*    */     Intrinsics.checkNotNullParameter(command, "command");
/*    */     Intrinsics.checkNotNullParameter(device, "device");
/*    */     Intrinsics.checkNotNullParameter(terminal, "terminal");
/*    */     Intrinsics.checkNotNullParameter(history, "history");
/*    */     return new TerminalExplainCommandTaskParams(command, device, terminal, history);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TerminalExplainCommandTaskParams(command=" + this.command + ", device=" + this.device + ", terminal=" + this.terminal + ", history=" + this.history + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.command.hashCode();
/*    */     result = result * 31 + this.device.hashCode();
/*    */     result = result * 31 + this.terminal.hashCode();
/*    */     return result * 31 + this.history.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TerminalExplainCommandTaskParams))
/*    */       return false; 
/*    */     TerminalExplainCommandTaskParams terminalExplainCommandTaskParams = (TerminalExplainCommandTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.command, terminalExplainCommandTaskParams.command) ? false : (!Intrinsics.areEqual(this.device, terminalExplainCommandTaskParams.device) ? false : (!Intrinsics.areEqual(this.terminal, terminalExplainCommandTaskParams.terminal) ? false : (!!Intrinsics.areEqual(this.history, terminalExplainCommandTaskParams.history))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\terminal\explainCommand\TerminalExplainCommandTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */