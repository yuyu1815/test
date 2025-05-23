/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bw\030\000 \t2\0020\001:\004\006\007\b\tR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005\001\003\n\013\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "", "allowMultiple", "", "getAllowMultiple", "()Z", "Auto", "Any", "Tool", "Companion", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Any;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Auto;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Tool;", "core"})
/*     */ public interface MatterhornToolChoice
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   boolean getAllowMultiple();
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     @NotNull
/*     */     public final KSerializer<MatterhornToolChoice> serializer() {
/* 227 */       KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(MatterhornToolChoice.Any.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(MatterhornToolChoice.Auto.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(MatterhornToolChoice.Tool.class); KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)MatterhornToolChoice.Any.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)MatterhornToolChoice.Auto.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)MatterhornToolChoice.Tool.$serializer.INSTANCE; return (KSerializer<MatterhornToolChoice>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornToolChoice", Reflection.getOrCreateKotlinClass(MatterhornToolChoice.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */     } } @Serializable @SerialName("auto") @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\007\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005B#\b\020\022\006\020\006\032\0020\007\022\006\020\002\032\0020\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0032\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\007HÖ\001J\t\020\023\032\0020\024HÖ\001J%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Auto;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "allowMultiple", "", "<init>", "(Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAllowMultiple", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"}) public static final class Auto implements MatterhornToolChoice { @NotNull public static final Companion Companion = new Companion(null); private final boolean allowMultiple; public Auto() { this(false, 1, (DefaultConstructorMarker)null); } public boolean equals(@Nullable Object other) { if (this == other)
/*     */         return true;  if (!(other instanceof Auto))
/*     */         return false; 
/*     */       Auto auto = (Auto)other;
/*     */       return !(this.allowMultiple != auto.allowMultiple); } public int hashCode() { return Boolean.hashCode(this.allowMultiple); }
/*     */     @NotNull public String toString() { return "Auto(allowMultiple=" + this.allowMultiple + ")"; }
/*     */     @NotNull public final Auto copy(boolean allowMultiple) { return new Auto(allowMultiple); }
/*     */     public final boolean component1() { return this.allowMultiple; }
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Auto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Auto;", "core"}) public static final class Companion { private Companion() {}
/* 237 */       @NotNull public final KSerializer<MatterhornToolChoice.Auto> serializer() { return (KSerializer<MatterhornToolChoice.Auto>)MatterhornToolChoice.Auto.$serializer.INSTANCE; } }
/* 238 */     public boolean getAllowMultiple() { return this.allowMultiple; } public Auto(boolean allowMultiple) { this.allowMultiple = allowMultiple; } } @Serializable @SerialName("any") @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\007\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005B#\b\020\022\006\020\006\032\0020\007\022\006\020\002\032\0020\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0032\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\007HÖ\001J\t\020\023\032\0020\024HÖ\001J%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Any;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "allowMultiple", "", "<init>", "(Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAllowMultiple", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"}) public static final class Any implements MatterhornToolChoice { @NotNull public static final Companion Companion = new Companion(null); private final boolean allowMultiple; public Any() { this(false, 1, (DefaultConstructorMarker)null); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Any)) return false;  Any any = (Any)other; return !(this.allowMultiple != any.allowMultiple); } public int hashCode() { return Boolean.hashCode(this.allowMultiple); }
/*     */     @NotNull public String toString() { return "Any(allowMultiple=" + this.allowMultiple + ")"; }
/*     */     @NotNull public final Any copy(boolean allowMultiple) { return new Any(allowMultiple); }
/*     */     public final boolean component1() { return this.allowMultiple; }
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Any$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Any;", "core"}) public static final class Companion { private Companion() {}
/* 243 */       @NotNull public final KSerializer<MatterhornToolChoice.Any> serializer() { return (KSerializer<MatterhornToolChoice.Any>)MatterhornToolChoice.Any.$serializer.INSTANCE; } }
/* 244 */     public boolean getAllowMultiple() { return this.allowMultiple; } public Any(boolean allowMultiple) { this.allowMultiple = allowMultiple; } }
/*     */    @Serializable @SerialName("tool") @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\n\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007B-\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\005HÆ\003J\035\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\024\032\0020\0052\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\tHÖ\001J\t\020\030\032\0020\003HÖ\001J%\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037H\001¢\006\002\b R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\017\020\020¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Tool;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;", "name", "", "allowMultiple", "", "<init>", "(Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getAllowMultiple", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"}) public static final class Tool implements MatterhornToolChoice
/*     */   {
/*     */     @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String name; private final boolean allowMultiple; public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Tool)) return false;  Tool tool = (Tool)other; return !Intrinsics.areEqual(this.name, tool.name) ? false : (!(this.allowMultiple != tool.allowMultiple)); } public int hashCode() { result = this.name.hashCode(); return result * 31 + Boolean.hashCode(this.allowMultiple); } @NotNull public String toString() { return "Tool(name=" + this.name + ", allowMultiple=" + this.allowMultiple + ")"; } @NotNull public final Tool copy(@NotNull String name, boolean allowMultiple) { Intrinsics.checkNotNullParameter(name, "name"); return new Tool(name, allowMultiple); } public final boolean component2() { return this.allowMultiple; } @NotNull public final String component1() { return this.name; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Tool$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Tool;", "core"}) public static final class Companion
/*     */     {
/* 249 */       @NotNull public final KSerializer<MatterhornToolChoice.Tool> serializer() { return (KSerializer<MatterhornToolChoice.Tool>)MatterhornToolChoice.Tool.$serializer.INSTANCE; } private Companion() {} } public boolean getAllowMultiple() {
/* 250 */       return this.allowMultiple; } @NotNull public final String getName() { return this.name; } public Tool(@NotNull String name, boolean allowMultiple) { this.name = name; this.allowMultiple = allowMultiple; }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornToolChoice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */