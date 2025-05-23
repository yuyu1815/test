/*    */ package ai.grazie.gen.tasks.code.pycharm.generateJupyter;
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
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 .2\0020\001:\002-.BY\b\021\022\006\020\002\032\0020\003\022\020\b\001\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\b\001\020\007\032\0020\003\022\020\b\001\020\b\032\n\022\004\022\0020\t\030\0010\005\022\020\b\001\020\n\032\n\022\004\022\0020\013\030\0010\005\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B7\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\003\022\f\020\b\032\b\022\004\022\0020\t0\005\022\f\020\n\032\b\022\004\022\0020\0130\005¢\006\002\020\017J\017\020\033\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\034\032\0020\003HÆ\003J\017\020\035\032\b\022\004\022\0020\t0\005HÆ\003J\017\020\036\032\b\022\004\022\0020\0130\005HÆ\003JC\020\037\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\0032\016\b\002\020\b\032\b\022\004\022\0020\t0\0052\016\b\002\020\n\032\b\022\004\022\0020\0130\005HÆ\001J\023\020 \032\0020!2\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020\003HÖ\001J\t\020$\032\0020\013HÖ\001J&\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+HÁ\001¢\006\002\b,R\"\020\n\032\b\022\004\022\0020\0130\0058\006X\004¢\006\016\n\000\022\004\b\020\020\021\032\004\b\022\020\023R\"\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\016\n\000\022\004\b\024\020\021\032\004\b\025\020\023R\034\020\007\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\026\020\021\032\004\b\027\020\030R\"\020\b\032\b\022\004\022\0020\t0\0058\006X\004¢\006\016\n\000\022\004\b\031\020\021\032\004\b\032\020\023¨\006/"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM;", "", "seen1", "", "cells", "", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell;", "selectedCellIndex", "variablesValues", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/Variable;", "availableFiles", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;ILjava/util/List;Ljava/util/List;)V", "getAvailableFiles$annotations", "()V", "getAvailableFiles", "()Ljava/util/List;", "getCells$annotations", "getCells", "getSelectedCellIndex$annotations", "getSelectedCellIndex", "()I", "getVariablesValues$annotations", "getVariablesValues", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class JupyterNotebookInfoForLLM {
/*    */   @NotNull
/*    */   private final List<NotebookCell> cells;
/*    */   private final int selectedCellIndex;
/*    */   @NotNull
/*    */   private final List<Variable> variablesValues;
/*    */   @NotNull
/* 33 */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final List<String> availableFiles; @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/*    */   public JupyterNotebookInfoForLLM(@NotNull List<NotebookCell> cells, int selectedCellIndex, @NotNull List<Variable> variablesValues, @NotNull List<String> availableFiles) {
/* 38 */     this.cells = cells;
/*    */ 
/*    */     
/* 41 */     this.selectedCellIndex = selectedCellIndex;
/*    */ 
/*    */     
/* 44 */     this.variablesValues = variablesValues;
/*    */ 
/*    */     
/* 47 */     this.availableFiles = availableFiles; } @NotNull
/* 48 */   public final List<String> getAvailableFiles() { return this.availableFiles; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */     arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)NotebookCell.$serializer.INSTANCE);
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)Variable.$serializer.INSTANCE);
/*    */     arrayOfKSerializer[3] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<JupyterNotebookInfoForLLM> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])JupyterNotebookInfoForLLM.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*    */       arrayOfKSerializer2[3] = arrayOfKSerializer1[3];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public JupyterNotebookInfoForLLM deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       List list1 = null;
/*    */       int j = 0;
/*    */       List list2 = null, list3 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])JupyterNotebookInfoForLLM.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list2);
/*    */         i |= 0x4;
/*    */         list3 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list3);
/*    */         i |= 0x8;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               list3 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new JupyterNotebookInfoForLLM(i, list1, j, list2, list3, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull JupyterNotebookInfoForLLM value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       JupyterNotebookInfoForLLM.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.code.pycharm.generateJupyter.JupyterNotebookInfoForLLM", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("cells", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("selectedCellIndex", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("variablesValues", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("availableFiles", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<JupyterNotebookInfoForLLM> serializer() {
/*    */       return (KSerializer<JupyterNotebookInfoForLLM>)JupyterNotebookInfoForLLM.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<NotebookCell> getCells() {
/*    */     return this.cells;
/*    */   }
/*    */   
/*    */   public final int getSelectedCellIndex() {
/*    */     return this.selectedCellIndex;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Variable> getVariablesValues() {
/*    */     return this.variablesValues;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<NotebookCell> component1() {
/*    */     return this.cells;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.selectedCellIndex;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Variable> component3() {
/*    */     return this.variablesValues;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component4() {
/*    */     return this.availableFiles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JupyterNotebookInfoForLLM copy(@NotNull List<NotebookCell> cells, int selectedCellIndex, @NotNull List<Variable> variablesValues, @NotNull List<String> availableFiles) {
/*    */     Intrinsics.checkNotNullParameter(cells, "cells");
/*    */     Intrinsics.checkNotNullParameter(variablesValues, "variablesValues");
/*    */     Intrinsics.checkNotNullParameter(availableFiles, "availableFiles");
/*    */     return new JupyterNotebookInfoForLLM(cells, selectedCellIndex, variablesValues, availableFiles);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "JupyterNotebookInfoForLLM(cells=" + this.cells + ", selectedCellIndex=" + this.selectedCellIndex + ", variablesValues=" + this.variablesValues + ", availableFiles=" + this.availableFiles + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.cells.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.selectedCellIndex);
/*    */     result = result * 31 + this.variablesValues.hashCode();
/*    */     return result * 31 + this.availableFiles.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof JupyterNotebookInfoForLLM))
/*    */       return false; 
/*    */     JupyterNotebookInfoForLLM jupyterNotebookInfoForLLM = (JupyterNotebookInfoForLLM)other;
/*    */     return !Intrinsics.areEqual(this.cells, jupyterNotebookInfoForLLM.cells) ? false : ((this.selectedCellIndex != jupyterNotebookInfoForLLM.selectedCellIndex) ? false : (!Intrinsics.areEqual(this.variablesValues, jupyterNotebookInfoForLLM.variablesValues) ? false : (!!Intrinsics.areEqual(this.availableFiles, jupyterNotebookInfoForLLM.availableFiles))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\pycharm\generateJupyter\JupyterNotebookInfoForLLM.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */