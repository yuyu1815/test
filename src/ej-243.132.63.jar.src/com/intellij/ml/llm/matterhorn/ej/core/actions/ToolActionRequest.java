/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ParameterValue;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020$\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 )2\0020\001:\002()B3\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\022\020\005\032\016\022\004\022\0020\003\022\004\022\0020\0070\006\022\006\020\b\032\0020\003¢\006\004\b\t\020\nBW\b\020\022\006\020\013\032\0020\f\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\024\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006\022\b\020\b\032\004\030\0010\003\022\006\020\r\032\0020\f\022\b\020\016\032\004\030\0010\017¢\006\004\b\t\020\020J\"\020\031\032\016\022\004\022\0020\003\022\004\022\0020\0070\0062\006\020\032\032\0020\033H@¢\006\002\020\034J\b\020\037\032\0020\003H\026J%\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&H\001¢\006\002\b'R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\021\020\022R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\023\020\022R\035\020\005\032\016\022\004\022\0020\003\022\004\022\0020\0070\006¢\006\b\n\000\032\004\b\024\020\025R\024\020\b\032\0020\003X\004¢\006\b\n\000\032\004\b\026\020\022R\024\020\r\032\0020\fXD¢\006\b\n\000\032\004\b\027\020\030R\024\020\035\032\0020\0038VX\004¢\006\006\032\004\b\036\020\022¨\006*"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "name", "", "id", "inputParams", "", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "seen0", "", "numCommands", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getId", "getInputParams", "()Ljava/util/Map;", "getDescription", "getNumCommands", "()I", "getInputParameters", "action", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "title", "getTitle", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nActionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionRequest.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1611#2,9:163\n1863#2:172\n1864#2:174\n1620#2:175\n1#3:173\n*S KotlinDebug\n*F\n+ 1 ActionRequest.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest\n*L\n35#1:163,9\n35#1:172\n35#1:174\n35#1:175\n35#1:173\n*E\n"})
/*     */ public final class ToolActionRequest implements ActionRequest {
/*     */   @NotNull
/*  26 */   public static final Companion Companion = new Companion(null); @NotNull private final String name; @NotNull private final String id; @NotNull private final Map<String, ParameterValue> inputParams; @NotNull private final String description; private final int numCommands; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)ParameterValue$.serializer.INSTANCE); arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionRequest;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ToolActionRequest> serializer() { return (KSerializer<ToolActionRequest>)ToolActionRequest.$serializer.INSTANCE; }
/*     */      }
/*  28 */   public ToolActionRequest(@NotNull String name, @NotNull String id, @NotNull Map<String, ParameterValue> inputParams, @NotNull String description) { this.name = name;
/*  29 */     this.id = id;
/*  30 */     this.inputParams = inputParams;
/*  31 */     this.description = description;
/*     */     
/*  33 */     this.numCommands = 1; } @NotNull public String getName() { return this.name; } @NotNull public final String getId() { return this.id; } public int getNumCommands() { return this.numCommands; }
/*     */   @NotNull public final Map<String, ParameterValue> getInputParams() { return this.inputParams; }
/*  35 */   @NotNull public String getDescription() { return this.description; } @Nullable public Object getInputParameters(@NotNull AgentAction action, @NotNull Continuation $completion) { Iterable $this$mapNotNull$iv = action.getArguments(); int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 172 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; Argument arg = (Argument)element$iv$iv;
/*     */       int $i$a$-mapNotNull-ToolActionRequest$getInputParameters$2 = 0; }
/*     */     
/* 175 */     return MapsKt.toMap(destination$iv$iv); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getTitle() {
/*     */     return getName() + " " + getName();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "## " + getName() + " " + this.inputParams + "\n\n" + getDescription() + "\n";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ToolActionRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */