/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @InternalResourceApi
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\"\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\t\n\002\b\023\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B+\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b¢\006\002\020\nJ\024\020\022\032\b\022\004\022\0020\0040\003HÀ\003¢\006\002\b\023J\016\020\024\032\0020\006HÀ\003¢\006\002\b\025J\016\020\026\032\0020\bHÀ\003¢\006\002\b\027J\016\020\030\032\0020\bHÀ\003¢\006\002\b\031J7\020\032\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\bHÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\037HÖ\001J\t\020 \032\0020\006HÖ\001R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\r\020\016R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\t\032\0020\bX\004¢\006\b\n\000\032\004\b\021\020\f¨\006!"}, d2 = {"Lorg/jetbrains/compose/resources/ResourceItem;", "", "qualifiers", "", "Lorg/jetbrains/compose/resources/Qualifier;", "path", "", "offset", "", "size", "(Ljava/util/Set;Ljava/lang/String;JJ)V", "getOffset$library", "()J", "getPath$library", "()Ljava/lang/String;", "getQualifiers$library", "()Ljava/util/Set;", "getSize$library", "component1", "component1$library", "component2", "component2$library", "component3", "component3$library", "component4", "component4$library", "copy", "equals", "", "other", "hashCode", "", "toString", "library"})
/*    */ @Immutable
/*    */ public final class ResourceItem
/*    */ {
/*    */   @NotNull
/*    */   private final Set<Qualifier> qualifiers;
/*    */   @NotNull
/*    */   private final String path;
/*    */   private final long offset;
/*    */   private final long size;
/*    */   public static final int $stable;
/*    */   
/*    */   public ResourceItem(@NotNull Set<Qualifier> qualifiers, @NotNull String path, long offset, long size) {
/* 48 */     this.qualifiers = qualifiers;
/* 49 */     this.path = path;
/* 50 */     this.offset = offset;
/* 51 */     this.size = size; } public final long getSize$library() { return this.size; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Set<Qualifier> getQualifiers$library() {
/*    */     return this.qualifiers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getPath$library() {
/*    */     return this.path;
/*    */   }
/*    */   
/*    */   public final long getOffset$library() {
/*    */     return this.offset;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Set<Qualifier> component1$library() {
/*    */     return this.qualifiers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2$library() {
/*    */     return this.path;
/*    */   }
/*    */   
/*    */   public final long component3$library() {
/*    */     return this.offset;
/*    */   }
/*    */   
/*    */   public final long component4$library() {
/*    */     return this.size;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ResourceItem copy(@NotNull Set<? extends Qualifier> qualifiers, @NotNull String path, long offset, long size) {
/*    */     Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
/*    */     Intrinsics.checkNotNullParameter(path, "path");
/*    */     return new ResourceItem(qualifiers, path, offset, size);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ResourceItem(qualifiers=" + this.qualifiers + ", path=" + this.path + ", offset=" + this.offset + ", size=" + this.size + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.qualifiers.hashCode();
/*    */     result = result * 31 + this.path.hashCode();
/*    */     result = result * 31 + Long.hashCode(this.offset);
/*    */     return result * 31 + Long.hashCode(this.size);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ResourceItem))
/*    */       return false; 
/*    */     ResourceItem resourceItem = (ResourceItem)other;
/*    */     return !Intrinsics.areEqual(this.qualifiers, resourceItem.qualifiers) ? false : (!Intrinsics.areEqual(this.path, resourceItem.path) ? false : ((this.offset != resourceItem.offset) ? false : (!(this.size != resourceItem.size))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceItem.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */