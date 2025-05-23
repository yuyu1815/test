/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\020\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005\022\b\b\002\020\007\032\0020\b¢\006\004\b\t\020\nBA\b\020\022\006\020\013\032\0020\f\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\006\020\007\032\0020\b\022\b\020\r\032\004\030\0010\016¢\006\004\b\t\020\017J\020\020\026\032\0020\0012\006\020\027\032\0020\005H\026J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\005HÆ\003J\t\020\032\032\0020\005HÆ\003J\t\020\033\032\0020\bHÆ\003J1\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\bHÆ\001J\023\020\035\032\0020\b2\b\020\036\032\004\030\0010\037HÖ\003J\t\020 \032\0020\fHÖ\001J\t\020!\032\0020\005HÖ\001J%\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(H\001¢\006\002\b)R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\024\020\023R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\007\020\025¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/UserTrajectoryElement;", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "subagent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "content", "", "role", "is_demo", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSubagent", "()Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "getContent", "()Ljava/lang/String;", "getRole", "()Z", "withId", "agentId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class UserTrajectoryElement
/*    */   implements TrajectoryElement
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final TrajectoryElementAgent subagent;
/*    */   @NotNull
/*    */   private final String content;
/*    */   @NotNull
/*    */   private final String role;
/*    */   private final boolean is_demo;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/UserTrajectoryElement$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/UserTrajectoryElement;", "core"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<UserTrajectoryElement> serializer() {
/* 50 */       return (KSerializer<UserTrajectoryElement>)UserTrajectoryElement.$serializer.INSTANCE;
/*    */     } }
/* 52 */   public UserTrajectoryElement(@NotNull TrajectoryElementAgent subagent, @NotNull String content, @NotNull String role, boolean is_demo) { this.subagent = subagent;
/* 53 */     this.content = content;
/* 54 */     this.role = role;
/* 55 */     this.is_demo = is_demo; } @NotNull public TrajectoryElementAgent getSubagent() { return this.subagent; } public final boolean is_demo() { return this.is_demo; }
/*    */   @NotNull public final String getContent() { return this.content; }
/*    */   @NotNull public final String getRole() { return this.role; } @NotNull
/* 58 */   public TrajectoryElement withId(@NotNull String agentId) { Intrinsics.checkNotNullParameter(agentId, "agentId"); return copy$default(this, TrajectoryElementAgent.copy$default(getSubagent(), null, null, null, null, agentId, 15, null), null, null, false, 14, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TrajectoryElementAgent component1() {
/*    */     return this.subagent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.is_demo;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UserTrajectoryElement copy(@NotNull TrajectoryElementAgent subagent, @NotNull String content, @NotNull String role, boolean is_demo) {
/*    */     Intrinsics.checkNotNullParameter(subagent, "subagent");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     return new UserTrajectoryElement(subagent, content, role, is_demo);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "UserTrajectoryElement(subagent=" + this.subagent + ", content=" + this.content + ", role=" + this.role + ", is_demo=" + this.is_demo + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.subagent.hashCode();
/*    */     result = result * 31 + this.content.hashCode();
/*    */     result = result * 31 + this.role.hashCode();
/*    */     return result * 31 + Boolean.hashCode(this.is_demo);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof UserTrajectoryElement))
/*    */       return false; 
/*    */     UserTrajectoryElement userTrajectoryElement = (UserTrajectoryElement)other;
/*    */     return !Intrinsics.areEqual(this.subagent, userTrajectoryElement.subagent) ? false : (!Intrinsics.areEqual(this.content, userTrajectoryElement.content) ? false : (!Intrinsics.areEqual(this.role, userTrajectoryElement.role) ? false : (!(this.is_demo != userTrajectoryElement.is_demo))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\UserTrajectoryElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */