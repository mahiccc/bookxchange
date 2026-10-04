package com.example.data;

import androidx.fragment.app.FragmentTransaction;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\bl\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-\u0012\b\b\u0002\u0010.\u001a\u00020#\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b3\u00104J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0010HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010HJ\u0010\u0010y\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010HJ\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020#HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010HJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010_J\u0010\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030-HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020#HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010_Jþ\u0003\u0010\u0093\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-2\b\b\u0002\u0010.\u001a\u00020#2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0003\u0010\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u00020\u000b2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0097\u0001\u001a\u00020#HÖ\u0001J\n\u0010\u0098\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010=R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00106R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00106R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00106R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010I\u001a\u0004\bJ\u0010HR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00106R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00106R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00106R\u0011\u0010 \u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010=R\u0011\u0010!\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010=R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0015\u0010&\u001a\u0004\u0018\u00010#¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bW\u0010XR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u00106R\u0015\u0010(\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010I\u001a\u0004\b[\u0010HR\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00106R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u00106R\u0015\u0010+\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010`\u001a\u0004\b^\u0010_R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010.\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bc\u0010TR\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u00106R\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u00106R\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u00106R\u0015\u00102\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010`\u001a\u0004\bg\u0010_¨\u0006\u0099\u0001"}, d2 = {"Lcom/example/data/Book;", "", "id", "", "title", "author", "condition", "ownerName", "ownerDisplayName", "ownerProfilePicUrl", "isAvailable", "", "borrowerName", "requestedByName", "status", "timestamp", "", "imageUrl", "estimatedPrice", "pickupAddress", "mobileNumber", "latitude", "", "longitude", "genre", "description", "transferImageUrl", "returnImageUrl", "transferCondition", "transferAiAssessment", "returnCondition", "returnAiAssessment", "isTransferQrVerified", "isReturnQrVerified", "rentCount", "", "publisher", "publishedDate", "pageCount", "language", "averageRating", "categories", "remarks", "borrowedDate", "bookmarkedBy", "", "borrowerCurrentPage", "borrowerNotes", "agreedMeetupSpot", "agreedMeetupAddress", "agreedMeetupTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getTitle", "getAuthor", "getCondition", "getOwnerName", "getOwnerDisplayName", "getOwnerProfilePicUrl", "()Z", "getBorrowerName", "getRequestedByName", "getStatus", "getTimestamp", "()J", "getImageUrl", "getEstimatedPrice", "getPickupAddress", "getMobileNumber", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getGenre", "getDescription", "getTransferImageUrl", "getReturnImageUrl", "getTransferCondition", "getTransferAiAssessment", "getReturnCondition", "getReturnAiAssessment", "getRentCount", "()I", "getPublisher", "getPublishedDate", "getPageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLanguage", "getAverageRating", "getCategories", "getRemarks", "getBorrowedDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBookmarkedBy", "()Ljava/util/List;", "getBorrowerCurrentPage", "getBorrowerNotes", "getAgreedMeetupSpot", "getAgreedMeetupAddress", "getAgreedMeetupTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/example/data/Book;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Book {
    public static final int $stable = 8;
    private final String agreedMeetupAddress;
    private final String agreedMeetupSpot;
    private final Long agreedMeetupTime;
    private final String author;
    private final Double averageRating;
    private final List<String> bookmarkedBy;
    private final Long borrowedDate;
    private final int borrowerCurrentPage;
    private final String borrowerName;
    private final String borrowerNotes;
    private final String categories;
    private final String condition;
    private final String description;
    private final String estimatedPrice;
    private final String genre;
    private final String id;
    private final String imageUrl;
    private final boolean isAvailable;
    private final boolean isReturnQrVerified;
    private final boolean isTransferQrVerified;
    private final String language;
    private final Double latitude;
    private final Double longitude;
    private final String mobileNumber;
    private final String ownerDisplayName;
    private final String ownerName;
    private final String ownerProfilePicUrl;
    private final Integer pageCount;
    private final String pickupAddress;
    private final String publishedDate;
    private final String publisher;
    private final String remarks;
    private final int rentCount;
    private final String requestedByName;
    private final String returnAiAssessment;
    private final String returnCondition;
    private final String returnImageUrl;
    private final String status;
    private final long timestamp;
    private final String title;
    private final String transferAiAssessment;
    private final String transferCondition;
    private final String transferImageUrl;

    public Book() {
        this(null, null, null, null, null, null, null, false, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, -1, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Book copy$default(Book book, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, long j, String str11, String str12, String str13, String str14, Double d, Double d2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z2, boolean z3, int i, String str23, String str24, Integer num, String str25, Double d3, String str26, String str27, Long l, List list, int i2, String str28, String str29, String str30, Long l2, int i3, int i4, Object obj) {
        String str31 = (i3 & 1) != 0 ? book.id : str;
        return book.copy(str31, (i3 & 2) != 0 ? book.title : str2, (i3 & 4) != 0 ? book.author : str3, (i3 & 8) != 0 ? book.condition : str4, (i3 & 16) != 0 ? book.ownerName : str5, (i3 & 32) != 0 ? book.ownerDisplayName : str6, (i3 & 64) != 0 ? book.ownerProfilePicUrl : str7, (i3 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? book.isAvailable : z, (i3 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? book.borrowerName : str8, (i3 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? book.requestedByName : str9, (i3 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? book.status : str10, (i3 & 2048) != 0 ? book.timestamp : j, (i3 & 4096) != 0 ? book.imageUrl : str11, (i3 & FragmentTransaction.TRANSIT_EXIT_MASK) != 0 ? book.estimatedPrice : str12, (i3 & 16384) != 0 ? book.pickupAddress : str13, (i3 & 32768) != 0 ? book.mobileNumber : str14, (i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? book.latitude : d, (i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? book.longitude : d2, (i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? book.genre : str15, (i3 & 524288) != 0 ? book.description : str16, (i3 & 1048576) != 0 ? book.transferImageUrl : str17, (i3 & 2097152) != 0 ? book.returnImageUrl : str18, (i3 & 4194304) != 0 ? book.transferCondition : str19, (i3 & 8388608) != 0 ? book.transferAiAssessment : str20, (i3 & 16777216) != 0 ? book.returnCondition : str21, (i3 & 33554432) != 0 ? book.returnAiAssessment : str22, (i3 & 67108864) != 0 ? book.isTransferQrVerified : z2, (i3 & 134217728) != 0 ? book.isReturnQrVerified : z3, (i3 & 268435456) != 0 ? book.rentCount : i, (i3 & 536870912) != 0 ? book.publisher : str23, (i3 & 1073741824) != 0 ? book.publishedDate : str24, (i3 & Integer.MIN_VALUE) != 0 ? book.pageCount : num, (i4 & 1) != 0 ? book.language : str25, (i4 & 2) != 0 ? book.averageRating : d3, (i4 & 4) != 0 ? book.categories : str26, (i4 & 8) != 0 ? book.remarks : str27, (i4 & 16) != 0 ? book.borrowedDate : l, (i4 & 32) != 0 ? book.bookmarkedBy : list, (i4 & 64) != 0 ? book.borrowerCurrentPage : i2, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? book.borrowerNotes : str28, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? book.agreedMeetupSpot : str29, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? book.agreedMeetupAddress : str30, (i4 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? book.agreedMeetupTime : l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRequestedByName() {
        return this.requestedByName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getEstimatedPrice() {
        return this.estimatedPrice;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPickupAddress() {
        return this.pickupAddress;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getGenre() {
        return this.genre;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTransferImageUrl() {
        return this.transferImageUrl;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getReturnImageUrl() {
        return this.returnImageUrl;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTransferCondition() {
        return this.transferCondition;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTransferAiAssessment() {
        return this.transferAiAssessment;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getReturnCondition() {
        return this.returnCondition;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getReturnAiAssessment() {
        return this.returnAiAssessment;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getIsTransferQrVerified() {
        return this.isTransferQrVerified;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getIsReturnQrVerified() {
        return this.isReturnQrVerified;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getRentCount() {
        return this.rentCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getPublishedDate() {
        return this.publishedDate;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Integer getPageCount() {
        return this.pageCount;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Double getAverageRating() {
        return this.averageRating;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Long getBorrowedDate() {
        return this.borrowedDate;
    }

    public final List<String> component38() {
        return this.bookmarkedBy;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final int getBorrowerCurrentPage() {
        return this.borrowerCurrentPage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getBorrowerNotes() {
        return this.borrowerNotes;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getAgreedMeetupSpot() {
        return this.agreedMeetupSpot;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getAgreedMeetupAddress() {
        return this.agreedMeetupAddress;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Long getAgreedMeetupTime() {
        return this.agreedMeetupTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwnerProfilePicUrl() {
        return this.ownerProfilePicUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBorrowerName() {
        return this.borrowerName;
    }

    public final Book copy(String id, String title, String author, String condition, String ownerName, String ownerDisplayName, String ownerProfilePicUrl, boolean isAvailable, String borrowerName, String requestedByName, String status, long timestamp, String imageUrl, String estimatedPrice, String pickupAddress, String mobileNumber, Double latitude, Double longitude, String genre, String description, String transferImageUrl, String returnImageUrl, String transferCondition, String transferAiAssessment, String returnCondition, String returnAiAssessment, boolean isTransferQrVerified, boolean isReturnQrVerified, int rentCount, String publisher, String publishedDate, Integer pageCount, String language, Double averageRating, String categories, String remarks, Long borrowedDate, List<String> bookmarkedBy, int borrowerCurrentPage, String borrowerNotes, String agreedMeetupSpot, String agreedMeetupAddress, Long agreedMeetupTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(ownerDisplayName, "ownerDisplayName");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(bookmarkedBy, "bookmarkedBy");
        return new Book(id, title, author, condition, ownerName, ownerDisplayName, ownerProfilePicUrl, isAvailable, borrowerName, requestedByName, status, timestamp, imageUrl, estimatedPrice, pickupAddress, mobileNumber, latitude, longitude, genre, description, transferImageUrl, returnImageUrl, transferCondition, transferAiAssessment, returnCondition, returnAiAssessment, isTransferQrVerified, isReturnQrVerified, rentCount, publisher, publishedDate, pageCount, language, averageRating, categories, remarks, borrowedDate, bookmarkedBy, borrowerCurrentPage, borrowerNotes, agreedMeetupSpot, agreedMeetupAddress, agreedMeetupTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Book)) {
            return false;
        }
        Book book = (Book) other;
        return Intrinsics.areEqual(this.id, book.id) && Intrinsics.areEqual(this.title, book.title) && Intrinsics.areEqual(this.author, book.author) && Intrinsics.areEqual(this.condition, book.condition) && Intrinsics.areEqual(this.ownerName, book.ownerName) && Intrinsics.areEqual(this.ownerDisplayName, book.ownerDisplayName) && Intrinsics.areEqual(this.ownerProfilePicUrl, book.ownerProfilePicUrl) && this.isAvailable == book.isAvailable && Intrinsics.areEqual(this.borrowerName, book.borrowerName) && Intrinsics.areEqual(this.requestedByName, book.requestedByName) && Intrinsics.areEqual(this.status, book.status) && this.timestamp == book.timestamp && Intrinsics.areEqual(this.imageUrl, book.imageUrl) && Intrinsics.areEqual(this.estimatedPrice, book.estimatedPrice) && Intrinsics.areEqual(this.pickupAddress, book.pickupAddress) && Intrinsics.areEqual(this.mobileNumber, book.mobileNumber) && Intrinsics.areEqual(this.latitude, book.latitude) && Intrinsics.areEqual(this.longitude, book.longitude) && Intrinsics.areEqual(this.genre, book.genre) && Intrinsics.areEqual(this.description, book.description) && Intrinsics.areEqual(this.transferImageUrl, book.transferImageUrl) && Intrinsics.areEqual(this.returnImageUrl, book.returnImageUrl) && Intrinsics.areEqual(this.transferCondition, book.transferCondition) && Intrinsics.areEqual(this.transferAiAssessment, book.transferAiAssessment) && Intrinsics.areEqual(this.returnCondition, book.returnCondition) && Intrinsics.areEqual(this.returnAiAssessment, book.returnAiAssessment) && this.isTransferQrVerified == book.isTransferQrVerified && this.isReturnQrVerified == book.isReturnQrVerified && this.rentCount == book.rentCount && Intrinsics.areEqual(this.publisher, book.publisher) && Intrinsics.areEqual(this.publishedDate, book.publishedDate) && Intrinsics.areEqual(this.pageCount, book.pageCount) && Intrinsics.areEqual(this.language, book.language) && Intrinsics.areEqual(this.averageRating, book.averageRating) && Intrinsics.areEqual(this.categories, book.categories) && Intrinsics.areEqual(this.remarks, book.remarks) && Intrinsics.areEqual(this.borrowedDate, book.borrowedDate) && Intrinsics.areEqual(this.bookmarkedBy, book.bookmarkedBy) && this.borrowerCurrentPage == book.borrowerCurrentPage && Intrinsics.areEqual(this.borrowerNotes, book.borrowerNotes) && Intrinsics.areEqual(this.agreedMeetupSpot, book.agreedMeetupSpot) && Intrinsics.areEqual(this.agreedMeetupAddress, book.agreedMeetupAddress) && Intrinsics.areEqual(this.agreedMeetupTime, book.agreedMeetupTime);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31) + this.condition.hashCode()) * 31) + this.ownerName.hashCode()) * 31) + this.ownerDisplayName.hashCode()) * 31;
        String str = this.ownerProfilePicUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isAvailable)) * 31;
        String str2 = this.borrowerName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestedByName;
        int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.status.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31;
        String str4 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.estimatedPrice;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pickupAddress;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mobileNumber;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.latitude;
        int iHashCode9 = (iHashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.longitude;
        int iHashCode10 = (iHashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str8 = this.genre;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.description;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.transferImageUrl;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.returnImageUrl;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.transferCondition;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.transferAiAssessment;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.returnCondition;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.returnAiAssessment;
        int iHashCode18 = (((((((iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31) + Boolean.hashCode(this.isTransferQrVerified)) * 31) + Boolean.hashCode(this.isReturnQrVerified)) * 31) + Integer.hashCode(this.rentCount)) * 31;
        String str16 = this.publisher;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.publishedDate;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num = this.pageCount;
        int iHashCode21 = (iHashCode20 + (num == null ? 0 : num.hashCode())) * 31;
        String str18 = this.language;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Double d3 = this.averageRating;
        int iHashCode23 = (iHashCode22 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str19 = this.categories;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.remarks;
        int iHashCode25 = (iHashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Long l = this.borrowedDate;
        int iHashCode26 = (((((iHashCode25 + (l == null ? 0 : l.hashCode())) * 31) + this.bookmarkedBy.hashCode()) * 31) + Integer.hashCode(this.borrowerCurrentPage)) * 31;
        String str21 = this.borrowerNotes;
        int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.agreedMeetupSpot;
        int iHashCode28 = (iHashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.agreedMeetupAddress;
        int iHashCode29 = (iHashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Long l2 = this.agreedMeetupTime;
        return iHashCode29 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "Book(id=" + this.id + ", title=" + this.title + ", author=" + this.author + ", condition=" + this.condition + ", ownerName=" + this.ownerName + ", ownerDisplayName=" + this.ownerDisplayName + ", ownerProfilePicUrl=" + this.ownerProfilePicUrl + ", isAvailable=" + this.isAvailable + ", borrowerName=" + this.borrowerName + ", requestedByName=" + this.requestedByName + ", status=" + this.status + ", timestamp=" + this.timestamp + ", imageUrl=" + this.imageUrl + ", estimatedPrice=" + this.estimatedPrice + ", pickupAddress=" + this.pickupAddress + ", mobileNumber=" + this.mobileNumber + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", genre=" + this.genre + ", description=" + this.description + ", transferImageUrl=" + this.transferImageUrl + ", returnImageUrl=" + this.returnImageUrl + ", transferCondition=" + this.transferCondition + ", transferAiAssessment=" + this.transferAiAssessment + ", returnCondition=" + this.returnCondition + ", returnAiAssessment=" + this.returnAiAssessment + ", isTransferQrVerified=" + this.isTransferQrVerified + ", isReturnQrVerified=" + this.isReturnQrVerified + ", rentCount=" + this.rentCount + ", publisher=" + this.publisher + ", publishedDate=" + this.publishedDate + ", pageCount=" + this.pageCount + ", language=" + this.language + ", averageRating=" + this.averageRating + ", categories=" + this.categories + ", remarks=" + this.remarks + ", borrowedDate=" + this.borrowedDate + ", bookmarkedBy=" + this.bookmarkedBy + ", borrowerCurrentPage=" + this.borrowerCurrentPage + ", borrowerNotes=" + this.borrowerNotes + ", agreedMeetupSpot=" + this.agreedMeetupSpot + ", agreedMeetupAddress=" + this.agreedMeetupAddress + ", agreedMeetupTime=" + this.agreedMeetupTime + ")";
    }

    public Book(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, long j, String str11, String str12, String str13, String str14, Double d, Double d2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z2, boolean z3, int i, String str23, String str24, Integer num, String str25, Double d3, String str26, String str27, Long l, List<String> list, int i2, String str28, String str29, String str30, Long l2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "author");
        Intrinsics.checkNotNullParameter(str4, "condition");
        Intrinsics.checkNotNullParameter(str5, "ownerName");
        Intrinsics.checkNotNullParameter(str6, "ownerDisplayName");
        Intrinsics.checkNotNullParameter(str10, "status");
        Intrinsics.checkNotNullParameter(list, "bookmarkedBy");
        this.id = str;
        this.title = str2;
        this.author = str3;
        this.condition = str4;
        this.ownerName = str5;
        this.ownerDisplayName = str6;
        this.ownerProfilePicUrl = str7;
        this.isAvailable = z;
        this.borrowerName = str8;
        this.requestedByName = str9;
        this.status = str10;
        this.timestamp = j;
        this.imageUrl = str11;
        this.estimatedPrice = str12;
        this.pickupAddress = str13;
        this.mobileNumber = str14;
        this.latitude = d;
        this.longitude = d2;
        this.genre = str15;
        this.description = str16;
        this.transferImageUrl = str17;
        this.returnImageUrl = str18;
        this.transferCondition = str19;
        this.transferAiAssessment = str20;
        this.returnCondition = str21;
        this.returnAiAssessment = str22;
        this.isTransferQrVerified = z2;
        this.isReturnQrVerified = z3;
        this.rentCount = i;
        this.publisher = str23;
        this.publishedDate = str24;
        this.pageCount = num;
        this.language = str25;
        this.averageRating = d3;
        this.categories = str26;
        this.remarks = str27;
        this.borrowedDate = l;
        this.bookmarkedBy = list;
        this.borrowerCurrentPage = i2;
        this.borrowerNotes = str28;
        this.agreedMeetupSpot = str29;
        this.agreedMeetupAddress = str30;
        this.agreedMeetupTime = l2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Book(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, long j, String str11, String str12, String str13, String str14, Double d, Double d2, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z2, boolean z3, int i, String str23, String str24, Integer num, String str25, Double d3, String str26, String str27, Long l, List list, int i2, String str28, String str29, String str30, Long l2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        if ((i3 & 1) != 0) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else {
            string = str;
        }
        this(string, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) == 0 ? str6 : "", (i3 & 64) != 0 ? null : str7, (i3 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z, (i3 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str8, (i3 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str9, (i3 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "AVAILABLE" : str10, (i3 & 2048) != 0 ? System.currentTimeMillis() : j, (i3 & 4096) != 0 ? null : str11, (i3 & FragmentTransaction.TRANSIT_EXIT_MASK) != 0 ? null : str12, (i3 & 16384) != 0 ? null : str13, (i3 & 32768) != 0 ? null : str14, (i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : d, (i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : d2, (i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str15, (i3 & 524288) != 0 ? null : str16, (i3 & 1048576) != 0 ? null : str17, (i3 & 2097152) != 0 ? null : str18, (i3 & 4194304) != 0 ? null : str19, (i3 & 8388608) != 0 ? null : str20, (i3 & 16777216) != 0 ? null : str21, (i3 & 33554432) != 0 ? null : str22, (i3 & 67108864) != 0 ? false : z2, (i3 & 134217728) != 0 ? false : z3, (i3 & 268435456) != 0 ? 0 : i, (i3 & 536870912) != 0 ? null : str23, (i3 & 1073741824) != 0 ? null : str24, (i3 & Integer.MIN_VALUE) != 0 ? null : num, (i4 & 1) != 0 ? null : str25, (i4 & 2) != 0 ? null : d3, (i4 & 4) != 0 ? null : str26, (i4 & 8) != 0 ? null : str27, (i4 & 16) != 0 ? null : l, (i4 & 32) != 0 ? CollectionsKt.emptyList() : list, (i4 & 64) == 0 ? i2 : 0, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str28, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str29, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str30, (i4 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    public final String getOwnerProfilePicUrl() {
        return this.ownerProfilePicUrl;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final String getBorrowerName() {
        return this.borrowerName;
    }

    public final String getRequestedByName() {
        return this.requestedByName;
    }

    public final String getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getEstimatedPrice() {
        return this.estimatedPrice;
    }

    public final String getPickupAddress() {
        return this.pickupAddress;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getGenre() {
        return this.genre;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTransferImageUrl() {
        return this.transferImageUrl;
    }

    public final String getReturnImageUrl() {
        return this.returnImageUrl;
    }

    public final String getTransferCondition() {
        return this.transferCondition;
    }

    public final String getTransferAiAssessment() {
        return this.transferAiAssessment;
    }

    public final String getReturnCondition() {
        return this.returnCondition;
    }

    public final String getReturnAiAssessment() {
        return this.returnAiAssessment;
    }

    public final boolean isTransferQrVerified() {
        return this.isTransferQrVerified;
    }

    public final boolean isReturnQrVerified() {
        return this.isReturnQrVerified;
    }

    public final int getRentCount() {
        return this.rentCount;
    }

    public final String getPublisher() {
        return this.publisher;
    }

    public final String getPublishedDate() {
        return this.publishedDate;
    }

    public final Integer getPageCount() {
        return this.pageCount;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Double getAverageRating() {
        return this.averageRating;
    }

    public final String getCategories() {
        return this.categories;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final Long getBorrowedDate() {
        return this.borrowedDate;
    }

    public final List<String> getBookmarkedBy() {
        return this.bookmarkedBy;
    }

    public final int getBorrowerCurrentPage() {
        return this.borrowerCurrentPage;
    }

    public final String getBorrowerNotes() {
        return this.borrowerNotes;
    }

    public final String getAgreedMeetupSpot() {
        return this.agreedMeetupSpot;
    }

    public final String getAgreedMeetupAddress() {
        return this.agreedMeetupAddress;
    }

    public final Long getAgreedMeetupTime() {
        return this.agreedMeetupTime;
    }
}
