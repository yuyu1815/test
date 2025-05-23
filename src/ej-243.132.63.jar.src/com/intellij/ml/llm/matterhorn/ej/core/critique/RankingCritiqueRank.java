/*     */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.DoubleSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\006\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bB7\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\006\020\005\032\0020\006\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\006HÆ\003J'\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\nHÖ\001J\t\020\033\032\0020\003HÖ\001J%\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"H\001¢\006\002\b#R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\020\020\017R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\021\020\022¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueRank;", "", "command", "", "comment", "rank", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCommand", "()Ljava/lang/String;", "getComment", "getRank", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*     */ public final class RankingCritiqueRank
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String command;
/*     */   @NotNull
/*     */   private final String comment;
/*     */   private final double rank;
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof RankingCritiqueRank))
/*     */       return false; 
/*     */     RankingCritiqueRank rankingCritiqueRank = (RankingCritiqueRank)other;
/*     */     return !Intrinsics.areEqual(this.command, rankingCritiqueRank.command) ? false : (!Intrinsics.areEqual(this.comment, rankingCritiqueRank.comment) ? false : (!(Double.compare(this.rank, rankingCritiqueRank.rank) != 0)));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.command.hashCode();
/*     */     result = result * 31 + this.comment.hashCode();
/*     */     return result * 31 + Double.hashCode(this.rank);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "RankingCritiqueRank(command=" + this.command + ", comment=" + this.comment + ", rank=" + this.rank + ")";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RankingCritiqueRank copy(@NotNull String command, @NotNull String comment, double rank) {
/*     */     Intrinsics.checkNotNullParameter(command, "command");
/*     */     Intrinsics.checkNotNullParameter(comment, "comment");
/*     */     return new RankingCritiqueRank(command, comment, rank);
/*     */   }
/*     */   
/*     */   public final double component3() {
/*     */     return this.rank;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.comment;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.command;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueRank$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueRank;", "ej-core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<RankingCritiqueRank> serializer() {
/* 159 */       return (KSerializer<RankingCritiqueRank>)RankingCritiqueRank.$serializer.INSTANCE;
/*     */     }
/* 161 */   } public final double getRank() { return this.rank; } @NotNull public final String getComment() { return this.comment; } @NotNull public final String getCommand() { return this.command; } public RankingCritiqueRank(@NotNull String command, @NotNull String comment, double rank) { this.command = command; this.comment = comment; this.rank = rank; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\RankingCritiqueRank.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */