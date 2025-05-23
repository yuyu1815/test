/*     */ package feedback;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\n\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\003HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\023\032\0020\0132\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\bR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017¨\006\030"}, d2 = {"Lfeedback/RadioButtonItemData;", "", "label", "", "jsonElementName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getJsonElementName", "property", "", "getProperty$ej_ui", "()Z", "setProperty$ej_ui", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class RadioButtonItemData
/*     */ {
/*     */   @NotNull
/*     */   private final String label;
/*     */   @NotNull
/*     */   private final String jsonElementName;
/*     */   private boolean property;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final String getLabel() {
/*     */     return this.label;
/*     */   }
/*     */   
/*     */   public RadioButtonItemData(@NotNull String label, @NotNull String jsonElementName) {
/* 172 */     this.label = label;
/* 173 */     this.jsonElementName = jsonElementName; } @NotNull public final String getJsonElementName() { return this.jsonElementName; }
/*     */   
/* 175 */   public final boolean getProperty$ej_ui() { return this.property; } public final void setProperty$ej_ui(boolean <set-?>) { this.property = <set-?>; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.label;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.jsonElementName;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RadioButtonItemData copy(@NotNull String label, @NotNull String jsonElementName) {
/*     */     Intrinsics.checkNotNullParameter(label, "label");
/*     */     Intrinsics.checkNotNullParameter(jsonElementName, "jsonElementName");
/*     */     return new RadioButtonItemData(label, jsonElementName);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "RadioButtonItemData(label=" + this.label + ", jsonElementName=" + this.jsonElementName + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.label.hashCode();
/*     */     return result * 31 + this.jsonElementName.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof RadioButtonItemData))
/*     */       return false; 
/*     */     RadioButtonItemData radioButtonItemData = (RadioButtonItemData)other;
/*     */     return !Intrinsics.areEqual(this.label, radioButtonItemData.label) ? false : (!!Intrinsics.areEqual(this.jsonElementName, radioButtonItemData.jsonElementName));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\RadioButtonItemData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */