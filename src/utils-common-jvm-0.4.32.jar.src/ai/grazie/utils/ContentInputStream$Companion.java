/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\004R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/utils/ContentInputStream$Companion;", "", "()V", "APPLICATION_OCTET_STREAM", "", "fromInternalStream", "Lai/grazie/utils/ContentInputStream;", "inputStream", "Ljava/io/InputStream;", "size", "", "type", "utils-common"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final ContentInputStream fromInternalStream(@NotNull InputStream inputStream, long size, @NotNull String type) {
/* 35 */     Intrinsics.checkNotNullParameter(inputStream, "inputStream"); Intrinsics.checkNotNullParameter(type, "type"); return new ContentInputStream(inputStream, size, type, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\ContentInputStream$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */