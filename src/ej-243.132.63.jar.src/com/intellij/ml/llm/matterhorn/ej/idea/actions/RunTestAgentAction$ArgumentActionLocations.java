/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.ActionLocation;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\035\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\017\020\r\032\b\022\004\022\0020\0040\003HÆ\003J\t\020\016\032\0020\006HÆ\003J#\020\017\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\006HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\f¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations;", "", "locations", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "message", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getLocations", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-idea"})
/*     */ public final class ArgumentActionLocations
/*     */ {
/*     */   @NotNull
/*     */   private final List<ActionLocation> locations;
/*     */   @NotNull
/*     */   private final String message;
/*     */   
/*     */   public ArgumentActionLocations(@NotNull List<ActionLocation> locations, @NotNull String message) {
/* 123 */     this.locations = locations; this.message = message; } @NotNull public final List<ActionLocation> getLocations() { return this.locations; } @NotNull public final String getMessage() { return this.message; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<ActionLocation> component1() {
/*     */     return this.locations;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.message;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArgumentActionLocations copy(@NotNull List<? extends ActionLocation> locations, @NotNull String message) {
/*     */     Intrinsics.checkNotNullParameter(locations, "locations");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     return new ArgumentActionLocations(locations, message);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ArgumentActionLocations(locations=" + this.locations + ", message=" + this.message + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.locations.hashCode();
/*     */     return result * 31 + this.message.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ArgumentActionLocations))
/*     */       return false; 
/*     */     ArgumentActionLocations argumentActionLocations = (ArgumentActionLocations)other;
/*     */     return !Intrinsics.areEqual(this.locations, argumentActionLocations.locations) ? false : (!!Intrinsics.areEqual(this.message, argumentActionLocations.message));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\RunTestAgentAction$ArgumentActionLocations.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */